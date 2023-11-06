<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import = "model.Advogado"%>
<%@page import = "java.util.ArrayList"%>  

<%ArrayList<Advogado> lista = (ArrayList<Advogado>) request.getAttribute("advogado");%>   
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<title>Lista de advogados cadastrados</title>


	<style>
	
	body{
	background-color: #87CEFA;
	align-items: center;
	color: #fff;
	}
	
	</style>
</head>
<body>


<br>
<br>
<br>


	<div class="container">
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">Número OAB:</th>
	      <th scope="col">Nome</th>
	      <th scope="col">Telefone</th>
	      <th scope="col">Causas(tipo):</th>
	      <th scope="col">Opções:</th>
	      
	    </tr>
	  </thead>
	  <tbody>
	   
	  <%
	  for(int i=0;i<lista.size();i++){
	  %>
	  
	    <tr>
	      <td><%=lista.get(i).getOab()%></td>
	      <td><%=lista.get(i).getNome() %></td>
	      <td><%=lista.get(i).getTelefone()%></td>
	      <td><%=lista.get(i).getTipocausas()%></td>
	      <td>
	      <a href="#">Editar</a> 
	      	&nbsp;|&nbsp;
	      <a href="#">Deletar</a>
	      
	      </td>
	    </tr>
	    
	 <% } %>
	  
	  </tbody>
	</table>
</div>





    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>
</body>
</html>