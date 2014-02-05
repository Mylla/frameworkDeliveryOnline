<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  <!-- PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Administrador</title>
</head>  
<body>  
   <h3>Cadastro de Administrador</h3> 
       <h4>* Preenchimento obrigatório</h4>
       <br /><br /> 
   <form action="EnviaDadosAdm?cmd=cadastrar" method="post">  
   	  Imagem: <input type="file" name="imagem"/>
      <br /><br />
      *Nome: <input type="text" name="nome" required/>  
      <br /><br />  
      *CPF: <input type="text" name="cpf" required/>  
      <br /><br />  
      Data de nascimento: <input type="date" name="dtNasc" />  
      <br /><br />
      *E-mail: <input type="email" name="email" required/>  
      <br /><br />
      *Login: <input type="text" name="login" required/>  
      <br /><br /> 
      *Senha: <input type="text" name="senha" required/>  
      <br /><br />  
      Endereço: <input type="text" name="endereco" />  
      <br /><br />
      Cidade: <input type="text" name="cidade" />  
      <br /><br />
      Estado: <input type="text" name="estado" />  
      <br /><br />
      *CEP: <input type="text" name="cep" required/>  
      <br /><br />
      *Delivery: <input type="text" name="delivery" required/>  
      <br /><br />
      
      <input type="submit" value="SALVAR" />
      <a href="indexAdm.jsp">Voltar</a>  
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
