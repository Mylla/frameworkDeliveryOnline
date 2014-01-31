package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.LojaBusiness;



//@WebServlet("/EnviaDadosLoja")
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
			   String codigo, logotipo, nome, tipo, endereco, bairro, cep, estado, cidade, telefone, cnpj, responsavel, email,site, ae ;
			   ArrayList <String> areasEntrega = null; //TO COM DUVIDA DE COMO MANIPULAR ESSE ARRAY
			   
			   if(cmd.equalsIgnoreCase("cadastrar")){
				   
				   
				   codigo = request.getParameter("codigo");
				   logotipo = request.getParameter("logotipo");
				   nome = request.getParameter("nome");
				   tipo = request.getParameter("tipo");
				   endereco = request.getParameter("endereco");
				   bairro = request.getParameter("bairro");
				   cep = request.getParameter("cep");
				   cidade = request.getParameter("cidade");
				   estado = request.getParameter("estado");
				   telefone = request.getParameter("telefone");
				   cnpj = request.getParameter("cnpj");
				   responsavel = request.getParameter("responsavel");
				   email = request.getParameter("email");
				   site = request.getParameter("site");
				   
				   for (int i = 0; i <3; i++ ){ // verificar  CadastroLoja.jsp
					   ae = request.getParameter("areasEntrega");
					   areasEntrega.add(i, ae);	   
				   }
				   
				  
				   
				   if(lb.cadastra(codigo, logotipo, nome, tipo, endereco, bairro, cep, estado, cidade, telefone, cnpj, responsavel, email, areasEntrega, site )){
					   request.setAttribute("msg", "Cadastro Efetuado!");
					   request.getRequestDispatcher("index.html").forward(request, response);
				   }else{
					   request.setAttribute("msg", "Não foi possível cadastrar.");
					   request.getRequestDispatcher("CadastrarLoja.jsp").forward(request, response);
				   }
			   }
		   }catch(Exception e){
			   request.setAttribute("msg", "Erro: " + e.getMessage());
			   request.getRequestDispatcher("CadastrarLoja.jsp").forward(request, response);
		   }
	}

}
