package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FormaPagamento;
import controller.FormaPagamentoBusiness;

//@WebServlet("/EnviaDadosFormaPagamento")
public class EnviaDadosFormaPagamento extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public EnviaDadosFormaPagamento() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String cmd = request.getParameter("cmd");
			FormaPagamentoBusiness fpb = new FormaPagamentoBusiness();
			String codigo,nome,imagem,tipo, vencimento, campoExtra;
			double juros;
			int parcelasSemJuros;

			if (cmd.equalsIgnoreCase("cadastrar")) {

				codigo = request.getParameter("codigo");
				nome = request.getParameter("nome");
				imagem = request.getParameter("imagem");
				tipo = request.getParameter("tipo");
				juros = Double.parseDouble(request.getParameter("juros"));				
				vencimento = request.getParameter("vencimento");
				parcelasSemJuros = Integer.parseInt(request.getParameter("parcelasSemJuros"));
				campoExtra = request.getParameter("campoExtra");
				
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
				Date venc = new Date(format.parse(vencimento).getTime());  
				

				if (fpb.Cadastra(codigo, nome, imagem, tipo, juros, venc, parcelasSemJuros, campoExtra )) {
					request.setAttribute("msg", "Cadastro Efetuado!");
					request.getRequestDispatcher("index.html").forward(request,
							response);
				} else {
					request.setAttribute("msg", "Não foi possível cadastrar.");
					request.getRequestDispatcher("CadastrarFormaPagamento.jsp")
							.forward(request, response);
				}
			}else if(cmd.equalsIgnoreCase("consultar")){
				
				List<FormaPagamento> busca = null;
				codigo = "";nome = "";
				PrintWriter out = response.getWriter();
				
				codigo = request.getParameter("codigo");
				nome = request.getParameter("nome");
				
				if(fpb.consulta(codigo, nome)){
					busca = fpb.getBusca();
					
					if(busca != null){
						response.setContentType("text/html");
						out.println("<html>");
						out.println("<body>");
						out.println("<h4>Resultado da busca</h4>");
						out.println("<table border=\"1\">");
						out.println("<tr>");
						out.println("<td>Código</td>");
						out.println("<td>Nome</td>");
						out.println("<td>Editar</td>");
						out.println("<td>Remover</td>");
						out.println("</tr>");
						
						for (int i = 0; i < busca.size(); i++) {
							FormaPagamento p = busca.get(i);
							out.println("<tr>");
							out.println("<td>"+ p.getCodigo()+"</td>");
							out.println("<td>"+ p.getNome()+"</td>");
							out.println("<td><a href='CadastrarFormaPagamento.jsp'>Editar</a></td>");
							out.println("<td><a href='CadastrarFormaPagamento.jsp'>Remover</a></td>");
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
			request.getRequestDispatcher("CadastrarFormaPagamento.jsp").forward(
					request, response);
		}
	}

}
