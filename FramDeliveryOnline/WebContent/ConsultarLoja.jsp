<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta Loja</title>
</head>  
<body>  
   <h3>Consulta Loja</h3>     
    <h4>Escolha um item em pelo menos um dos filtros</h4>
       
   <form action="EnviaDadosLoja?cmd=consultar" method="post">  
      <br />
      C�digo: <input type="text" name="codigo" />   
      <br /><br />
      Nome: <input type="text" name="nome" /> 
      <br /><br />
      Tipo de produto: <input type="text" name="tipo" /> 
      <br /><br />
      
      <input type="submit" value="Buscar" />
      <a href="indexAdm.jsp">Voltar</a>  
      
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
