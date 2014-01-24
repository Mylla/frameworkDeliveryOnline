<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Forma de Entrega</title>
</head>  
<body>  
   <h3>Cadastro de Forma de Entrega</h3> 
       <h4>* Preenchimento obrigatório</h4>
       <br /><br /> 
   <form action="EnviaDadosFormaEntrega?cmd=cadastrar" method="post">  <!-- fazer o metodo enviar dados e cadastrar -->
       <!--  <input type="text" value="Caminho da imagem" name="imagem" />
      <img alt="sua imagem" src="images/formaEntrega1.png">-->
      <br /><br />
      *Código: <input type="text" name="codigo" />  
      <br /><br />  
      *Nome: <input type="text" name="nome" />  
      <br /><br />  
      Descrição: <input type="text" name="descricao" />  
      <br /><br />
      *Tipo: <input type="text" name="tipo" />  
      <br /><br />
      
      <input type="submit" value="SALVAR" />
      <a href="index.html">Voltar</a>  
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
