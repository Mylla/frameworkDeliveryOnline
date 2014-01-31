package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
			}
		} catch (Exception e) {
			request.setAttribute("msg", "Erro: " + e.getMessage());
			request.getRequestDispatcher("CadastrarFormaPagamento.jsp").forward(
					request, response);
		}
	}

}
