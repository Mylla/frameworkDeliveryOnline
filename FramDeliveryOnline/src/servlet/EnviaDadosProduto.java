package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ProdutoBusiness;

//@WebServlet("/EnviaDadosProduto")
public class EnviaDadosProduto extends HttpServlet{

        private static final long serialVersionUID = 1L;

        public EnviaDadosProduto() {
                super();
        }
        
         protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
         }  
          
         protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
                   try{
                           String cmd = request.getParameter("cmd");
                           ProdutoBusiness pb = new ProdutoBusiness();
                           String observers, codigo, nomeLoja, imagem, nome, tipo, descricao;
                           int qtdEstoque;
                           double preco, desconto, peso;
                           
                           if(cmd.equalsIgnoreCase("cadastrar")){
                                   
                                   codigo = request.getParameter("codigo");
                                   nomeLoja = request.getParameter("nomeLoja");
                                   nome = request.getParameter("nome");
                                   tipo = request.getParameter("tipo");
                                   descricao = request.getParameter("descricao");
                                   qtdEstoque = Integer.parseInt(request.getParameter("qtdEstoque"));
                                   preco = Double.parseDouble(request.getParameter("preco"));
                                   desconto = Double.parseDouble(request.getParameter("desconto"));
                                   peso = Double.parseDouble(request.getParameter("peso"));
                                   observers = "";
                                   imagem = "";
                                   
                                   if(pb.cadastra(observers, codigo, nomeLoja, imagem, nome, tipo, descricao, qtdEstoque, preco, desconto, peso)){
                                           request.getRequestDispatcher("index.html").forward(request, response);
                                   }else{
                                           request.setAttribute("msg", "Não foi possível cadastrar.");
                                           request.getRequestDispatcher("CadastrarProduto.jsp").forward(request, response);
                                   }
                           }
                   }catch(Exception e){
                           request.setAttribute("msg", "Erro: " + e.getMessage());
                           request.getRequestDispatcher("CadastrarProduto.jsp").forward(request, response);
                   }
           } 

}
