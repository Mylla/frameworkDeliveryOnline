package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.Cliente;
import model.ItemProduto;
import model.Produto;
import controller.CarrinhoBusiness;
import controller.ClienteBusiness;
import controller.ProdutoBusiness;

//@WebServlet("/EnviaDadosProduto")
public class EnviaDadosProduto extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public EnviaDadosProduto() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  

	}  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		
		String page = "";
		
		try{
			String cmd = request.getParameter("cmd");
			ProdutoBusiness pb = new ProdutoBusiness();

			if(cmd.equalsIgnoreCase("cadastrar")){
				
				page = "CadastrarProduto.jsp";
				String codigo, nomeLoja, imagem, nome, tipo, descricao,recheio;
				int qtdEstoque;
				double preco, desconto, peso;

				tipo = request.getParameter("tipo");
				codigo = request.getParameter("codigo");
				nomeLoja = request.getParameter("nomeLoja");
				nome = request.getParameter("nome");
				recheio = request.getParameter("recheio");
				descricao = request.getParameter("descricao");
				qtdEstoque = Integer.parseInt(request.getParameter("qtdEstoque"));
				preco = Double.parseDouble(request.getParameter("preco"));
				desconto = Double.parseDouble(request.getParameter("desconto"));
				peso = Double.parseDouble(request.getParameter("peso"));
				imagem = request.getParameter("imagem");

				if(pb.cadastra(codigo, nomeLoja, imagem, nome, tipo, descricao,recheio, qtdEstoque, preco, desconto, peso)){
					request.setAttribute("msg", "Cadastro efetuado.");
					request.getRequestDispatcher("CadastrarProduto.jsp").forward(request, response);
				}else{
					request.setAttribute("msg", "Não foi possível cadastrar.");
					request.getRequestDispatcher("CadastrarProduto.jsp").forward(request, response);
				}

			}else if(cmd.equalsIgnoreCase("consultar")){
				List<Produto> busca = null;
				String codigo = "",produto = "", tipo = "",atePreco = "", loja = "";
				double preco = 0.0;
				PrintWriter out = response.getWriter();

				codigo = request.getParameter("codigo");
				produto = request.getParameter("produto");
				tipo = request.getParameter("tipo");
				atePreco = request.getParameter("preco");
				loja = request.getParameter("loja");

				if(atePreco.equals("Até R$10,00"))
					preco = 10.00;
				if(atePreco.equals("Até R$20,00"))
					preco = 20.00;
				if(atePreco.equals("Mais de R$20,00"))
					preco = 20.01;

				if(pb.consulta(codigo, loja, produto, tipo, preco)){
					busca = pb.getBusca();

					if(busca != null){
						response.setContentType("text/html");
						out.println("<html>");
						out.println("<body>");
						out.println("<h4>Resultado da busca</h4>");
						out.println("<table border=\"1\">");
						out.println("<tr>");
						out.println("<td>Código</td>");
						out.println("<td>Nome</td>");
						out.println("<td>Descrição</td>");
						out.println("<td>Editar</td>");
						out.println("<td>Remover</td>");
						out.println("</tr>");

						for (int i = 0; i < busca.size(); i++) {
							Produto p = busca.get(i);
							out.println("<tr>");
							out.println("<td>"+ p.getCodigo()+"</td>");
							out.println("<td>"+ p.getNome()+"</td>");
							out.println("<td>"+ p.getDescricao()+"</td>");
							out.println("<td><a href='CadastrarProduto.jsp'>Editar</a></td>");
							out.println("<td><a href='CadastrarProduto.jsp'>Remover</a></td>");
							out.println("</tr>");
						}

						out.println("</table>");
						out.println("</body>");
						out.println("</html>");

						out.close();
					}

				}else{
					request.setAttribute("msg", "Não foi possível consultar.");
					request.getRequestDispatcher("ConsultarProduto.jsp").forward(request, response);
				}

			}else if(cmd.equalsIgnoreCase("consultarCarrinho")){
				page = "ConsultarProdutoCarrinho.jsp";
				List<Produto> busca = null;
				String codigo = "",produto = "", tipo = "",atePreco = "", loja = "";
				double preco = 0.0;
				PrintWriter out = response.getWriter();

				codigo = request.getParameter("codigo");
				produto = request.getParameter("produto");
				tipo = request.getParameter("tipo");
				atePreco = request.getParameter("preco");
				loja = request.getParameter("loja");

				if(atePreco.equals("Até R$10,00"))
					preco = 10.00;
				if(atePreco.equals("Até R$20,00"))
					preco = 20.00;
				if(atePreco.equals("Mais de R$20,00"))
					preco = 20.01;

				if(pb.consulta(codigo, loja, produto, tipo, preco)){
					busca = pb.getBusca();

					if(busca != null){
						response.setContentType("text/html");
						out.println("<html>");
						out.println("<body>");
						out.println("<h4>Resultado da busca</h4>");
						out.println("<table border=\"1\">");
						out.println("<tr>");
						out.println("<td>Imagem</td>");
						out.println("<td>Nome</td>");
						out.println("<td>Preço</td>");
						out.println("<td></td>");
						out.println("<td></td>");
						out.println("</tr>");

						for (int i = 0; i < busca.size(); i++) {
							Produto p = busca.get(i);
							out.println("<tr>");
							out.println("<td>"+ "<img src=\""+p.getImagem()+"\"/> </td>");
							out.println("<td>"+ p.getNome()+"</td>");
							out.println("<td>"+ p.getPreco()+"</td>");
							out.println("<td><a href='DetalhesProduto.jsp?codigo=\""+p.getCodigo()+"\"'>Detalhes</a></td>");
							out.println("<td><a href='ConsultarProdutoCarrinho.jsp'>Buscar Mais</a></td>");
							out.println("</tr>");
						}

						out.println("</table>");
						out.println("</body>");
						out.println("</html>");

						out.close();
					}

				}else{
					request.setAttribute("msg", "Não foi possível consultar.");
					request.getRequestDispatcher("ConsultarProdutoCarrinho.jsp").forward(request, response);
				}
			}
		}catch(Exception e){
			request.setAttribute("msg", "Erro: " + e.getMessage());
			request.getRequestDispatcher(page).forward(request, response);
		}
	} 

}
