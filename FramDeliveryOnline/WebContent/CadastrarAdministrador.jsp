<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Administrador</title>
</head>  
<body>  
   <h3>Cadastro de Administrador</h3> 
       <h4>* Preenchimento obrigat�rio</h4>
       <br /><br /> 
   <form action="EnviaDadosAdm?cmd=cadastrar" method="post">  <!-- fazer o metodo enviar dados e cadastrar -->
       <!--  <input type="text" value="Caminho da imagem" name="imagem" />
      <img alt="sua imagem" src="images/cliente.png">-->
      <br /><br />
      *Nome: <input type="text" name="nome" />  
      <br /><br />  
      *CPF: <input type="text" name="" />  
      <br /><br />  
      Data de nascimento: <input type="text" name="dtNasc" />  
      <br /><br />
      *E-mail: <input type="text" name="email" />  
      <br /><br />
      *Login: <input type="text" name="login" />  
      <br /><br /> 
      *Senha: <input type="text" name="senha" />  
      <br /><br />  
      Endere�o: <input type="text" name="endereco" />  
      <br /><br />
      Cidade: <input type="text" name="cidade" />  
      <br /><br />
      Estado: <input type="text" name="estado" />  
      <br /><br />
      *CEP: <input type="text" name="cep" />  
      <br /><br />
      *Delivery: <input type="text" name="delivery" />  
      <br /><br />
      
      <input type="submit" value="SALVAR" />
      <a href="login.jsp">Voltar</a>  
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
