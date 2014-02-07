package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cliente;
import model.ItemProduto;
import model.Produto;
import controller.CarrinhoBusiness;
import controller.ClienteBusiness;
import controller.ProdutoBusiness;

@WebServlet("/EnviaDadosCarrinho")
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
							carb.criaCarrinho(cliente, item);
							
							request.setAttribute("msg", "Adcionou.");
							request.getRequestDispatcher(page).forward(request, response);
						}else{
							request.setAttribute("msg", "Não há produto disponível.");
							request.getRequestDispatcher(page).forward(request, response);
						}
					}else{
						request.setAttribute("msg", "O produto não existe.");
						request.getRequestDispatcher(page).forward(request, response);
					}
			   }else if(cmd.equalsIgnoreCase("finalizarCompra")){
				   PrintWriter out = response.getWriter();
				   
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
				   
			   }
		   }catch(Exception e){
			   request.setAttribute("msg", "Erro: " + e.getMessage());
			   request.getRequestDispatcher(page).forward(request, response);
		   }
	}

}
