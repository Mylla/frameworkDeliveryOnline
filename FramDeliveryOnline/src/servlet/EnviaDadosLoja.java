package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.AdmBusiness;
import controller.LojaBusiness;

//@WebServlet("/EnviaDadosAdm")
public class EnviaDadosLoja extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EnviaDadosLoja() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			   String cmd = request.getParameter("cmd");
			   LojaBusiness lb = new LojaBusiness();
			   String nome, cpf, dtNasc, email, login, senha, endereco, cidade, estado, cep,delivery;
			   
			   if(cmd.equalsIgnoreCase("cadastrar")){
				   
				   nome = request.getParameter("nome");
				   cpf = request.getParameter("cpf");
				   dtNasc = request.getParameter("dtNasc");
				   email = request.getParameter("email");
				   login = request.getParameter("login");
				   senha = request.getParameter("senha");
				   endereco = request.getParameter("endereco");
				   cidade = request.getParameter("cidade");
				   estado = request.getParameter("estado");
				   cep = request.getParameter("cep");
				   delivery = request.getParameter("delivery");
				   
				   if(lb.cadastra(nome, cpf, dtNasc, email, login, senha, endereco, cidade, estado, cep, delivery)){
					   request.setAttribute("msg", "Cadastro Efetuado!");
					   request.getRequestDispatcher("index.html").forward(request, response);
				   }else{
					   request.setAttribute("msg", "Não foi possível cadastrar.");
					   request.getRequestDispatcher("CadastrarAdministrador.jsp").forward(request, response);
				   }
			   }
		   }catch(Exception e){
			   request.setAttribute("msg", "Erro: " + e.getMessage());
			   request.getRequestDispatcher("CadastrarAdministrador.jsp").forward(request, response);
		   }
	}

}
