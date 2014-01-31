<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Forma de Pagamento</title>
</head>  
<body>  
   <h3>Cadastro de Forma de Pagamento</h3> 
       <h4>* Preenchimento obrigatório</h4>
       <br /><br /> 
   <form action="EnviaDadosFormaPagamento?cmd=cadastrar" method="post">  
       <!--  <input type="text" value="Caminho da imagem" name="imagem" />
      <img alt="sua imagem" src="images/formaPagamento1.png">-->
      <br /><br />
      *Código: <input type="text" name="codigo" />  
      <br /><br />  
      *Nome: <input type="text" name="nome" />  
      <br /><br />  
      Imagem: <input type="text" name="imagem" />  
      <br /><br />
      Tipo: <input type="text" name="tipo" />  
      <br /><br /> 
      Juros: <input type="text" name="juros" />  
      <br /><br /> 
      Vencimento: <input type="text" name="vencimento" />  
      <br /><br /> 
      Número de parcelas sem juros: <input type="text" name="parcelasSemJuros" />  
      <br /><br />      
      Campo Extra: <input type="text" name="campoExtra" />  
      <br /><br />
      
      <input type="submit" value="SALVAR" />
      <a href="index.html">Voltar</a>  
   </form>  
   <br /><br />  
   ${msg }     
</body>  
</html>  
