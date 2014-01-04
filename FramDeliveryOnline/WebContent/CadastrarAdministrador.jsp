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
       <h4>* Preenchimento obrigatório</h4>
       <br /><br /> 
   <form action="EnviarDados?cmd=cadastrar" method="post">  <!-- fazer o metodo enviar dados e cadastrar -->
     
      <input type="submit" value="ESCOLHER IMAGEM" />
      <br /><br />
      *Nome: <input type="text" name="nome" />  
      <br /><br />  
      *CPF: <input type="text" name="" />  
      <br /><br />  
      Data de nascimento: <input type="text" name="idade" />  
      <br /><br />
      *E-mail: <input type="text" name="email" />  
      <br /><br />
      *Login: <input type="text" name="login" />  
      <br /><br /> 
      *Senha: <input type="text" name="senha" />  
      <br /><br />  
      Endereço: <input type="text" name="endereco" />  
      <br /><br />
      Cidade: <input type="text" name="cidade" />  
      <br /><br />
      Estado: <input type="text" name="estado" />  
      <br /><br />
      *CEP: <input type="text" name="cep" />  
      <br /><br />
      
      <input type="submit" value="SALVAR" />
      <input type="submit" value="VOLTAR" />  
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
