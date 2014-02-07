<%@page import="controller.ProdutoBusiness"%>
<%@page import="model.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> <!-- PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detalhes Produto</title>
</head>
<body>
	<%
		String codigo = request.getParameter("codigo");
		ProdutoBusiness pb = new ProdutoBusiness();
		Produto p = pb.getProduto(codigo);
	%>
	 <h4>Detalhes Produto</h4>
	 <form action="EnviaDadosCarrinho?cmd=addCarrinho" method="post">
   	  	<img src="<%=p.getImagem()%>"/>
   	  	<p>Nome:<%=p.getNome()%></p>
   	  	<p>Tipo:<%=p.getTipo()%></p>
   	  	<p>Descrição:<%=p.getDescricao()%></p>
   	  	<p>Preço (R$):<%=p.getPreco()%></p>
   	  	<p>Desconto:<%=p.getDesconto()%></p>
   	  	<p>Peso (em gramas):<%=p.getPeso()%></p>
   	  	<p>Loja:<%=p.getLoja()%></p>
   	  	<input type="hidden" name="codigo" value="<%=p.getCodigo()%>"> 
   	  	
   	  	<input type="submit" value="Adicionar ao Carrinho" />
   </form>
   
   <a href="consultarProdutoCarrinho.jsp">Voltar</a>  
   <br /><br />  
   ${msg }
</body>
</html>