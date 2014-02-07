package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClienteBusiness;

//@WebServlet("/EnviaDadosCliente")
public class EnviaDadosCliente extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public EnviaDadosCliente() {
		super();
	}
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	 }  
	  
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		   try{
			   String cmd = request.getParameter("cmd");
			   ClienteBusiness cb = new ClienteBusiness();
			   String imagem, nome, cpf, dtNasc, email, login, senha, endereco, cidade, estado, cep;
			   
			   if(cmd.equalsIgnoreCase("cadastrar")){
				   
				   imagem = request.getParameter("imagem");
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
				   
				   if(cb.Cadastra(imagem,nome, cpf, dtNasc, email, login, senha, endereco, cidade, estado, cep)){
					   request.setAttribute("msg", "Cadastro Efetuado!");
					   request.getRequestDispatcher("CadastrarCliente.jsp").forward(request, response);
				   }else{
					   request.setAttribute("msg", "Não foi possível cadastrar.");
					   request.getRequestDispatcher("CadastrarCliente.jsp").forward(request, response);
				   }
			   }
		   }catch(Exception e){
			   request.setAttribute("msg", "Erro: " + e.getMessage());
			   request.getRequestDispatcher("CadastrarCliente.jsp").forward(request, response);
		   }
	   } 

}
