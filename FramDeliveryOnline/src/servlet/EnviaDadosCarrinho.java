package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Carrinho;
import model.Cliente;
import model.Doce;
import model.ItemProduto;
import model.Produto;
import controller.CarrinhoBusiness;
import controller.ClienteBusiness;
import controller.ProdutoBusiness;

//@WebServlet("/EnviaDadosCarrinho")
public class EnviaDadosCarrinho extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EnviaDadosCarrinho() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String page="";
		ProdutoBusiness pb = new ProdutoBusiness();
		HttpSession session = request.getSession();

		try{
			String cmd = request.getParameter("cmd");

			if(cmd.equalsIgnoreCase("addCarrinho")){
				page="DetalhesProduto.jsp";
				List<Produto> busca = null;
				String codigo = "";
				//HttpSession session = request.getSession();
				ClienteBusiness cb = new ClienteBusiness();
				CarrinhoBusiness carb = new CarrinhoBusiness();
				Cliente cliente = null;

				codigo = request.getParameter("codigo");

				if(pb.consulta(codigo, "", "", "", 0.0)){
					busca = pb.getBusca();
					Produto p = busca.get(0);

					if((p != null) && (p.getQtdEstoque() > 0)){
						ItemProduto item = new ItemProduto(p, 1, p.getPreco());
						String login = (String) session.getAttribute("loginCliente");
						cliente = cb.getCliente(login);
						session.setAttribute("Cliente", cliente);
						Carrinho carrinho = carb.criaCarrinho(cliente, item);
						visualizarCarrinho(response, carrinho);
						
						//double subtotal = 0.0;

						//carrinho.getListaProdutos();
						
						////

						/*PrintWriter out = response.getWriter();

							   response.setContentType("text/html");
								out.println("<html>");
								out.println("<body>");
								out.println("<h4>Meu Carrinho</h4>");
								out.println("<form action=\"EnviaDadosCarrinho?cmd=finalizarCompra\" method=\"post\"> ");
								out.println("<table border=\"1\">");
								out.println("<tr>");
								out.println("<td>Imagem</td>");
								out.println("<td>Produto</td>");
								out.println("<td>Quantidade</td>");
								out.println("<td>Preço Unitário</td>");
								out.println("<td>Preço Total</td>");
								out.println("<td></td>");
								out.println("</tr>");

								for (int i = 0; i < carrinho.getListaProdutos().size(); i++) {
									ItemProduto itemProduto = carrinho.getListaProdutos().get(i);
									out.println("<tr>");
									out.println("<td>"+ "<img src=\""+itemProduto.getItem().getImagem()+"\"/> </td>");
									out.println("<td>"+ itemProduto.getItem().getNome()+" "+itemProduto.getItem().getDescricao()+"</td>");
									out.println("<td>"+ itemProduto.getQuantidade() +"</td>");
									out.println("<td>"+ itemProduto.getItem().getPreco()+"</td>");
									out.println("<td>"+ itemProduto.getItem().getPreco() * itemProduto.getQuantidade() +"</td>");
									out.println("<td><a href='RemoverProduto.jsp?codigo=\""+p.getCodigo()+"\"'>Remover</a></td>");
									out.println("</tr>");
									subtotal += (itemProduto.getItem().getPreco() * itemProduto.getQuantidade());
								}
								out.println("<tr>");
								out.println("<td></td>");
								out.println("<td></td>");
								out.println("<td></td>");
								out.println("<td></td>");
								out.println("<td>Subtotal R$</td>");
								out.println("<td>"+subtotal+"</td>");
								out.println("</tr>");
								out.println("<input type=\"submit\" value=\"FinalizarCompra\" />");
								out.println("</form>");
								out.println("<a href=\"ConsultarProduto.jsp\">Continuar Comprando</a>");
								out.println("</body>");
								out.println("</html>");

								out.close();*/
						/////

						//request.setAttribute("msg", "Adcionou.");
						request.getRequestDispatcher("VisualizarCarrinho.jsp").forward(request, response);
					}else{
						((Doce)p).adiciona(cliente);
						request.setAttribute("msg", "Não há produto disponível.");
						request.getRequestDispatcher(page).forward(request, response);
					}
				}else{
					request.setAttribute("msg", "O produto não existe.");
					request.getRequestDispatcher(page).forward(request, response);
				}
			}else if(cmd.equalsIgnoreCase("finalizarCompra")){
				page = "VisualizarCarrinho.jsp";

				request.setAttribute("msg", "Erro: ");
				request.getRequestDispatcher(page).forward(request, response);
			}else if(cmd.equalsIgnoreCase("visualizarCarrinho")){
				page = "VisualizarCarrinho.jsp";

				request.setAttribute("msg", "Erro: ");
				request.getRequestDispatcher(page).forward(request, response);
			}
		}catch(Exception e){
			request.setAttribute("msg", "Erro: " + e.getMessage());
			request.getRequestDispatcher(page).forward(request, response);
		}
	}

	public void visualizarCarrinho(ServletResponse response, Carrinho carrinho) throws IOException {
		double subtotal = 0.0;
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<h4>Meu Carrinho</h4>");
		out.println("<form action=\"EnviaDadosCarrinho?cmd=finalizarCompra\" method=\"post\"> ");
		out.println("<table border=\"1\">");
		out.println("<tr>");
		out.println("<td>Imagem</td>");
		out.println("<td>Produto</td>");
		out.println("<td>Quantidade</td>");
		out.println("<td>Preço Unitário</td>");
		out.println("<td>Preço Total</td>");
		out.println("<td></td>");
		out.println("</tr>");

		for (int i = 0; i < carrinho.getListaProdutos().size(); i++) {
			ItemProduto itemProduto = carrinho.getListaProdutos().get(i);
			out.println("<tr>");
			out.println("<td>"+ "<img src=\""+itemProduto.getItem().getImagem()+"\"/> </td>");
			out.println("<td>"+ itemProduto.getItem().getNome()+" "+itemProduto.getItem().getDescricao()+"</td>");
			out.println("<td>"+ itemProduto.getQuantidade() +"</td>");
			out.println("<td>"+ itemProduto.getItem().getPreco()+"</td>");
			out.println("<td>"+ itemProduto.getItem().getPreco() * itemProduto.getQuantidade() +"</td>");
			out.println("<td><a href='RemoverProduto.jsp?codigo=\""+itemProduto.getItem().getCodigo()+"\"'>Remover</a></td>");
			out.println("</tr>");
			subtotal += (itemProduto.getItem().getPreco() * itemProduto.getQuantidade());
		}
		out.println("<tr>");
		out.println("<td></td>");
		out.println("<td></td>");
		out.println("<td></td>");
		out.println("<td></td>");
		out.println("<td>Subtotal R$</td>");
		out.println("<td>"+subtotal+"</td>");
		out.println("</tr>");
		out.println("<input type=\"submit\" value=\"FinalizarCompra\" />");
		out.println("</form>");
		out.println("<a href=\"ConsultarProduto.jsp\">Continuar Comprando</a>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}

}
