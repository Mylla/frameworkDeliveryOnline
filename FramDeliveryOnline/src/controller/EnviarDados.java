package controller;

import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EnviarDados")
public class EnviarDados extends HttpServlet{
	private static final long serialVersionUID = 1L;  
	
	 public EnviarDados() {  
	        super();  
	    }  
	  
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	   }  
	  
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		   try{
			   String cmd = request.getParameter("cmd");
			   LoginBusiness lb = new LoginBusiness();
			   String login, senha;
			   
			   if(cmd.equalsIgnoreCase("login")){
				   login = request.getParameter("login");
				   senha = request.getParameter("senha");
				   
				   if(lb.Login(login, senha)){
					   request.setAttribute("msg", "Login Efetuado!");
					   request.getRequestDispatcher("login.jsp").forward(request, response);
				   }else{
					   request.setAttribute("msg", "Login e/ou Senha incorretos.Primeira vez? Cadastre agora.");
					   request.getRequestDispatcher("login.jsp").forward(request, response);
				   }
			   }
		   }catch(Exception e){
			   request.setAttribute("msg", "Erro: " + e.getMessage());
			   request.getRequestDispatcher("login.jsp").forward(request, response);
		   }
	   } 
}
