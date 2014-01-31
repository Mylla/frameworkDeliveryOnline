<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Loja</title>
</head>  
<body>  
   <h3>Cadastro de Loja</h3>     
    <h4>* Preenchimento obrigatório</h4>
       <br /><br /> 
   <form action="EnviaDadosLoja?cmd=cadastrar" method="post">  <!-- fazer o metodo enviar dados e cadastrar -->
      <!--  <input type="text" value="Caminho da imagem" name="imagem" />
      <img alt="sua imagem" src="images/cliente.png">-->
      <br />
      *Código: <input type="text" name="codigo" />  
      <br /><br />  
      *Nome: <input type="text" name="nome" />  
      <br /><br />  
      *Tipo: <select name="tipo">
  				<option>Comida</option>
  				<option>Bebidas</option>
  				<option>Artesanato</option>
			</select>  
      <br /><br />
      *Endereço: <input type="text" name="endereco" />  
      <br /><br />
      *Bairro: <input type="text" name="bairro" />  
      <br /><br /> 
      *CEP: <input type="text" name="cep" />  
      <br /><br />  
      *Estado: <input type="text" name="estado" />  
      <br /><br />
      *Telefone: <input type="text" name="telefone" />  
      <br /><br />
      *CNPJ: <input type="text" name="cnpj" />  
      <br /><br />
      *Responsável: <input type="text" name="responsavel" />  
      <br /><br />
      *E-mail: <input type="text" name="email" />  
      <br /><br />
      *Áreas de Entrega: <select name="areaEntrega">
		  				<option>Cabula VI</option>
		  				<option>Rio Vermelho</option>
		  				<option>Cidade Baixa</option>
					</select> 
      <br /><br />
      *Site: <input type="text" name="site" />  
      <br /><br />
      
      <input type="submit" value="Salvar" />
      <a href="index.html">Voltar</a>  
      
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
