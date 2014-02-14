<%@page import="controller.ProdutoBusiness"%>
<%@page import="model.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Produto</title>
</head>  
<body>  

	<%
		String codigo = request.getParameter("codigo");
		ProdutoBusiness pb = new ProdutoBusiness();
		Produto p = pb.getProduto(codigo);
	%>
	
   <h3>Editar Produto</h3>     
    <h4>* Preenchimento obrigatório</h4>
       <br /><br /> 
   <form action="EnviaDadosProduto?cmd=editar" method="post">
   	  <img alt="imagem do produto" src="<%=p.getImagem()%>" />
   	  Imagem: <input type="file" name="imagem" />
      <br />
      *Tipo: <select name="tipo" value="<%=p.getTipo()%>">
  				<option>Doce</option>
  				<option>Pizza</option>
  				<option>Refrigerante</option>
			</select>  
      <br /><br />
      *Código: <input type="text" name="codigo" value="<%=p.getCodigo()%>" disabled="disabled" />  
      <br /><br />  
      *Nome: <input type="text" name="nome" value="<%=p.getNome()%>"/>  
      <br /><br />  
      
      *Descrição: <input type="text" name="descricao" value="<%=p.getDescricao()%>" />  
      <br /><br />
      *Quantidade em Estoque: <input type="text" name="qtdEstoque" value="<%=p.getQtdEstoque()%>"/>  
      <br /><br /> 
      *Preço R$: <input type="text" name="preco" value="<%=p.getPreco()%>" />  
      <br /><br />  
      *Desconto: <input type="text" name="desconto" value="<%=p.getDesconto()%>" />  
      <br /><br />
      *Peso em gramas: <input type="text" name="peso" value="<%=p.getPeso()%>" />  
      <br /><br />
      *Nome da loja: <select name="nomeLoja" value="<%=p.getLoja()%>" >
		  				<option>LojaACP</option>
		  				<option>Loja1</option>
		  				<option>Massas Mia</option>
		  				<option>Beba gelado</option>
					</select> 
      <br /><br />
      
      <input type="submit" value="Salvar" />
      <a href="index.html">Voltar</a>  
      
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
