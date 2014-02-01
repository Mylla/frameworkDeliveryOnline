package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FormaEntrega;
import controller.FormaEntregaBusiness;

//@WebServlet("/EnviaDadosFormaEntrega")
public class EnviaDadosFormaEntrega extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public EnviaDadosFormaEntrega() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String cmd = request.getParameter("cmd");
			FormaEntregaBusiness feb = new FormaEntregaBusiness();
			String codigo, nome, descricao, tipo, campoExtra;

			if (cmd.equalsIgnoreCase("cadastrar")) {

				codigo = request.getParameter("codigo");
				nome = request.getParameter("nome");
				descricao = request.getParameter("descricao");
				tipo = request.getParameter("tipo");
				campoExtra = request.getParameter("campoExtra");
				

				if (feb.Cadastra(codigo, nome, descricao, tipo, campoExtra )) {
					request.setAttribute("msg", "Cadastro Efetuado!");
					request.getRequestDispatcher("index.html").forward(request,
							response);
				} else {
					request.setAttribute("msg", "Não foi possível cadastrar.");
					request.getRequestDispatcher("CadastrarFormaEntrega.jsp")
							.forward(request, response);
				}
			}else if(cmd.equalsIgnoreCase("consultar")){
				
				List<FormaEntrega> busca = null;
				codigo = "";nome = "";tipo = "";
				PrintWriter out = response.getWriter();
				
				codigo = request.getParameter("codigo");
				nome = request.getParameter("nome");
				tipo = request.getParameter("tipo");
				
				if(feb.consulta(codigo, nome, tipo)){
					busca = feb.getBusca();
					
					if(busca != null){
						response.setContentType("text/html");
						out.println("<html>");
						out.println("<body>");
						out.println("<h4>Resultado da busca</h4>");
						out.println("<table border=\"1\">");
						out.println("<tr>");
						out.println("<td>Código</td>");
						out.println("<td>Nome</td>");
						out.println("<td>Tipo de produto</td>");
						out.println("<td>Editar</td>");
						out.println("<td>Remover</td>");
						out.println("</tr>");
						
						for (int i = 0; i < busca.size(); i++) {
							FormaEntrega fe = busca.get(i);
							out.println("<tr>");
							out.println("<td>"+ fe.getCodigo()+"</td>");
							out.println("<td>"+ fe.getNome()+"</td>");
							out.println("<td>"+ fe.getTipoProduto()+"</td>");
							out.println("<td><a href='CadastrarFormaEntrega.jsp'>Editar</a></td>");
							out.println("<td><a href='CadastrarFormaEntrega.jsp'>Remover</a></td>");
							out.println("</tr>");
						}
						
						out.println("</table>");
						out.println("</body>");
						out.println("</html>");
						
						out.close();
					}
					
					request.setAttribute("msg", out);
					
				}else{
					request.setAttribute("msg", "Não foi possível consultar.");
					request.getRequestDispatcher("ConsultarFormaPagamento.jsp").forward(request, response);
				}
				
			}
		} catch (Exception e) {
			request.setAttribute("msg", "Erro: " + e.getMessage());
			request.getRequestDispatcher("CadastrarFormaEntrega.jsp").forward(
					request, response);
		}
	}

}
