<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar Produto</title>
</head>  
<body>  
   <h3>Consultar Produto</h3>     
    <h4>Escolha um item em pelo menos um dos filtros</h4>
       
   <form action="EnviaDadosProduto?cmd=consultar" method="post">  
      <br />
      C�digo: <input type="text" name="codigo" />   
      <br /><br />
      Produto: <input type="text" name="produto" /> 
      <br /><br />
      Pre�o: <select name="preco">
		  		<option>At� R$10,00</option>
		  		<option>At� R$20,00</option>
		  		<option>Mais de R$20,00</option>
			 </select> 
      <br /><br /> 
      Tipo: <select name="tipo">
  				<option>Doce</option>
  				<option>Pizza</option>
  				<option>Refrigerante</option>
			</select>  
      <br /><br />
     
      Loja: <select name="loja">
      			<option>Loja1</option>
		  		<option>LojaACP</option>
		  		<option>Massas Mia</option>
		  		<option>Beba gelado</option>
			 </select> 
      <br /><br />
      
      <input type="submit" value="Buscar" />
      <a href="indexAdm.jsp">Voltar</a>  
      
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
