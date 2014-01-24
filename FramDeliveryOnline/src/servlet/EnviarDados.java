package servlet;

import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import controller.LoginBusiness;

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

				if(lb.Login(login, senha) == "cliente"){
					request.getRequestDispatcher("index.html").forward(request, response);
				}
				
				if(lb.Login(login, senha) == "adm"){
					request.getRequestDispatcher("index.html").forward(request, response);
				}
				
				if(lb.Login(login, senha) == "deslogado"){
					request.setAttribute("msg", "Login e/ou Senha incorretos.Primeira vez? Cadastre-se agora.");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
		}catch(Exception e){
			request.setAttribute("msg", "Erro: " + e.getMessage());
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	} 
}
