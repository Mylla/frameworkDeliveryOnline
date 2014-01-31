<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Produto</title>
</head>  
<body>  
   <h3>Cadastro de Produto</h3>     
    <h4>* Preenchimento obrigatório</h4>
       <br /><br /> 
   <form action="EnviaDadosProduto?cmd=cadastrar" method="post">  <!-- fazer o metodo enviar dados e cadastrar -->
      <!--  <input type="text" value="Caminho da imagem" name="imagem" />
      <img alt="sua imagem" src="images/cliente.png">-->
      <br />
      *Tipo: <select name="tipo">
  				<option>Doce</option>
  				<option>Pizza</option>
  				<option>Refrigerante</option>
			</select>  
      <br /><br />
      *Código: <input type="text" name="codigo" />  
      <br /><br />  
      *Nome: <input type="text" name="nome" />  
      <br /><br />  
      
      *Descrição: <input type="text" name="descricao" />  
      <br /><br />
      *Quantidade em Estoque: <input type="text" name="qtdEstoque" />  
      <br /><br /> 
      *Preço R$: <input type="text" name="preco" />  
      <br /><br />  
      *Desconto: <input type="text" name="desconto" />  
      <br /><br />
      *Peso em gramas: <input type="text" name="peso" />  
      <br /><br />
      *Nome da loja: <select name="nomeLoja">
		  				<option>LojaACP</option>
		  				<option>Massas Mia</option>
		  				<option>Beba gelado</option>
					</select> 
      <br /><br />
      
      <input type="submit" value="Salvar" />
      <a href="index.html">Voltar</a>  
      
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
