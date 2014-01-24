package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.FormaEntregaBusiness;

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
			}
		} catch (Exception e) {
			request.setAttribute("msg", "Erro: " + e.getMessage());
			request.getRequestDispatcher("CadastrarFormaEntrega.jsp").forward(
					request, response);
		}
	}

}
