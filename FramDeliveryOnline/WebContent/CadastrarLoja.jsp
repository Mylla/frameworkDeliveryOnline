<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> <!-- PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Loja</title>
</head>  
<body>  
   <h3>Cadastro de Loja</h3>     
    <h4>* Preenchimento obrigatório</h4>
       <br /><br /> 
   <form action="EnviaDadosLoja?cmd=cadastrar" method="post">  
   	  Logotipo: <input type="file" name="logotipo">
      <br /><br />
      *Código: <input type="text" name="codigo" />  
      <br /><br />  
      *Nome: <input type="text" name="nome" />  
      <br /><br />  
      *Tipo: <select name="tipo" size="3">
  				<option>Comida</option>
  				<option>Bebidas</option>
  				<option>Artesanato</option>
  				<option>Roupas</option>
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
      *Telefone: <input type="tel" name="telefone" />  
      <br /><br />
      *CNPJ: <input type="text" name="cnpj" />  
      <br /><br />
      *Responsável: <input type="text" name="responsavel" />  
      <br /><br />
      *E-mail: <input type="email" name="email" />  
      <br /><br />
      *Áreas de Entrega: <select multiple name="areaEntrega" size="3">
		  				<option value="cabula6">Cabula VI</option>
		  				<option value="rioVermelho">Rio Vermelho</option>
		  				<option value="cidadeBaixa">Cidade Baixa</option>
		  				<option value="imbui">Imbui</option>
					</select> 
      <br /><br />
      *Site: <input type="text" name="site" />  
      <br /><br />
      
      <input type="submit" value="Salvar" />
      <a href="indexAdm.jsp">Voltar</a>  
      
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
