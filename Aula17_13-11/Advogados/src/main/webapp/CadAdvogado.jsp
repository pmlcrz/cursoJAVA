<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<title>Cadastro de Advogados</title>
<style>

body{
background-color: #CEDBEA;
	align-items: center;
	color: #fff;
}

</style>
</head>
<body>

<h1>TC Advogados</h1>
<hr>
<nav>
	<a href="index.jsp">Início</a>
	&nbsp; | &nbsp;
	<a href="CadAdvogado.jsp">Cadastro de advogados</a>
	&nbsp; | &nbsp;
	<a href="CadCliente.jsp">Cadastro de clientes</a>
	<hr>
	
<br>
<br>
<br>

	
<div class="container">

	<h2>Cadastro de advogados</h2>
	
	<hr>
	
<form action="novoadvogado">

	  <div class="form-group" >
	    <label for="oab">Número OAB:</label>
	    <input type="text" class="form-control" id="" name="oab">
	  </div>
	  
	  <div class="form-group">
	    <label for="nome">Nome:</label>
	    <input type="text" class="form-control" id="" name="nome">
	  </div>
	  
	  	  <div class="form-group">
	    <label for="email">Email:</label>
	    <input type="text" class="form-control" id="" name="email">
	  </div>
	  
	  <div class="form-group">
	    <label for="telefone">Telefone:</label>
	    <input type="text" class="form-control" id="" name="telefone">
	  </div>
	  
	  <br>
	  
	  <div class="form-group" >
	  <input type="submit" class="btn btn-outline-light" value="Enviar">
	  </div>
	 
	<br>
		 	
	
	
</form>
</div>

<div class="container-fluid">
			<div class="row">
			<div class="col-md-12">
			<a href="buscaadvogados"><button class="btn btn-info"> Lista de advogados</button></a>
		</div>
	</div>
</div>	





    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>
</body>
</html>