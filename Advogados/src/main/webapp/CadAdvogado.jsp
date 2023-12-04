	<%@ include file="./_header.jsp" %>

	
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


	<%@ include file="./_footer.jsp" %>
