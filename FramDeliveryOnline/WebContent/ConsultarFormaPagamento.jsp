<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar Forma de Pagamento</title>
</head>  
<body>  
   <h3>Consultar Forma de Pagamento</h3>     
    <h4>Escolha um item em pelo menos um dos filtros</h4>
       
   <form action="EnviaDadosFormaPagamento?cmd=consultar" method="post">  
      <br />
      C�digo: <input type="text" name="codigo" />   
      <br /><br />
      Nome: <input type="text" name="nome" /> 
      <br /><br />
      
      <input type="submit" value="Buscar" />
      <a href="indexAdm.jsp">Voltar</a>  
      
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
