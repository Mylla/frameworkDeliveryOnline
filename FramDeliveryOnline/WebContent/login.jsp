<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h3>Login</h3>
	<h4>* Preenchimento Obrigatório</h4>
	<form action="EnviarDados?cmd=login" method="post">
		
		*Usuário: <input type="text" name="login" value="" />
		<br/> <br/>
		*Senha: <input type="password" name="senha" value="" />
		<br/> <br/>
		<input type="submit" value="Acessar"/>
		<a href="CadastrarCliente.jsp">Cadastre-se</a>
	</form>
	<br/> <br/>
	${msg}
</body>
</html>