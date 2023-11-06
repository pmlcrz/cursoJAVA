<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@page import="model.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%
ArrayList<Cliente> lista = (ArrayList<Cliente>) request.getAttribute("clientes");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Clientes</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
	
	<style>
	body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
  background: #ffffff;
}

a {
  transition: .3s;
}

a:hover,
a:active,
a:focus {
  outline: none;
  text-decoration: none;
}

.footer {
  position: relative;
  padding-top: 45px;
  background: #0275d8;
}

.footer .footer-blog,
.footer .footer-insta,
.footer .footer-tags,
.footer .footer-newsletter {
  position: relative;
  margin-bottom: 45px;
}

.footer .footer-blog h3,
.footer .footer-insta h3,
.footer .footer-tags h3,
.footer .footer-newsletter h3 {
  position: relative;
  margin-bottom: 20px;
  padding-bottom: 10px;
  font-size: 18px;
  font-weight: 400;
  color: #ffffff;
}

.footer .footer-blog h3::after,
.footer .footer-insta h3::after,
.footer .footer-tags h3::after,
.footer .footer-newsletter h3::after {
  position: absolute;
  content: "";
  width: 50px;
  height: 2px;
  left: 0;
  bottom: 0;
  background: #ffffff;
}

.footer .footer-blog div {
  position: relative;
}

.footer .footer-blog div a {
  display: block;
  margin-bottom: 5px;
  font-size: 16px;
  color: #cccccc;
}

.footer .footer-blog div a:hover {
  color: #0085ff;
}

.footer .footer-blog div p {
  padding-left: 20px;
  color: #757575;
  font-size: 13px;
  font-weight: 600;
  letter-spacing: 1px;
}

.footer .footer-blog div p::before {
  position: absolute;
  content: "\f017";
  font-family: "Font Awesome 5 Free";
  font-weight: 400;
  color: #757575;
  left: 15px;
}

.footer .footer-insta {
  float: left;
  font-size: 0;
}

.footer .footer-insta a {
  padding: 0 5px 5px 0;
  display: block;
  width: 33.33%;
  float: left;
}

.footer .footer-insta a img {
  width: 100%;
}

.footer .footer-tags {
  font-size: 0;
}

.footer .footer-tags a {

  display: inline-block;
  margin: 0 5px 5px 0;
  padding: 2px 7px;
  font-size: 15px;
  color: #fff;
  text-transform: capitalize;
  border: 1px solid #fff;
  border-radius: 6px;

}

.footer .footer-tags a:hover {
  color: #ffffff;
  background: #0085ff;
  border-color: #0085ff;
}

.footer .footer-newsletter .form {
  
  position: relative;
  width: 100%;

}

.footer .footer-newsletter .campo {
  
  width: 100%;
  height: 45px;
  float: left;
  border: 1px solid #05488a;
  background: #05488a;
  margin-bottom: 15px;
  border-radius: 6px;
  outline: none;
  padding: 5px 10px;
  color: #cccccc;

}

.footer .footer-newsletter .campo:focus {
  
  color:#cccccc!important;

}

.footer .footer-newsletter .btn {

  display: block;
  width: 100%;
  height: 45px;
  padding: 8px 20px;
  font-size: 16px;
  font-weight: 400;
  text-transform: uppercase;
  color: #cccccc;
  background: #0085ff;
  border-radius: 0;
  border: 1px solid #0085ff;
  transition: .3s;
  border-radius: 6px;

}

.footer .footer-newsletter .btn:hover {
  color: #ffffff;
  background: #222121;
  border-color: #222121;
}

.footer .footer-newsletter .btn:focus {
  box-shadow: none;
}

.footer .footer-contact {
  position: relative;
  padding: 25px 0;
  text-align: center;
  border-top: 1px solid rgba(256, 256, 256, .1);
}

.footer .footer-contact h4 {
  position: relative;
  margin-bottom: 10px;
  font-size: 18px;
  font-weight: 600;
  letter-spacing: 1px;
  color: #ffffff;
}

.footer .footer-contact p {
  margin: 0;
  font-size: 16px;
  color: #ffffff;
}

.footer .footer-contact a {
  display: inline-block;
}

.footer .footer-contact a i {
  margin-right: 10px;
  font-size: 18px;
  color: #ffffff;
}

.footer .footer-contact a:last-child i {
  margin: 0;
}

.footer .footer-contact a:hover i {
  color: #0085ff;
}

@media (max-width: 767.98px) {
  .footer .footer-contact .col-md-4 {
    margin-bottom: 25px;
  }

  .footer .footer-contact .col-md-4:last-child {
    margin: 0;
  }
}

.footer .copyright {
  position: relative;
  padding: 30px 0;
  background: #032e59;
}

.footer .copyright .copy-text p {
  margin: 0;
  font-size: 16px;
  font-weight: 400;
  color: #ffffff;
}

.footer .copyright .copy-text p a {
  color: #dddddd;
}

.footer .copyright .copy-text p a:hover {
  color: #0085ff;
}

.footer .copyright .copy-menu {
  position: relative;
  font-size: 0;
  text-align: right;
}

.footer .copyright .copy-menu a {
  color: #ffffff;
  font-size: 16px;
  font-weight: 400;
  margin-right: 15px;
  padding-right: 15px;
  border-right: 1px solid rgba(255, 255, 255, .3);
}

.footer .copyright .copy-menu a:hover {
  color: #0085ff;
}

.footer .copyright .copy-menu a:last-child {
  margin-right: 0;
  padding-right: 0;
  border-right: none;
}

@media (max-width: 767.98px) {
  .footer .copyright .copy-text,
  .footer .copyright .copy-menu {
    text-align: center;
  }

  .footer .copyright .copy-text p {
    margin-bottom: 5px;
  }

}
	</style>
	
	
</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">TC Advogados</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(página atual)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Ação</a>
          <a class="dropdown-item" href="#">Outra ação</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Algo mais aqui</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Desativado</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" aria-label="Pesquisar">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
    </form>
  </div>
</nav>
	
	




	<div class="container">
		<table class="table table-dark mt-5 mb-4">
			<thead>
				<tr>
					<th scope="col">Código</th>
					<th scope="col">Data</th>
					<th scope="col">Cliente</th>
					<th scope="col">Telefone</th>
					<th scope="col">Opções</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (int i = 0; i < lista.size(); i++) {
				%>

				<tr>
					<td><%=lista.get(i).getIdcliente()%></td>
					<td><%=lista.get(i).getData()%></td>
					<td><%=lista.get(i).getNome()%></td>
					<td><%=lista.get(i).getTelefone()%></td>
					<td><a href="">Editar</a> &nbsp;|&nbsp; <a href="">Apagar</a>
					</td>
				</tr>

				<%
				}
				%>

			</tbody>
		</table>

	</div>



<footer class="footer">
  
  <div class="container">
  
    <div class="row">
      
      <div class="col-md-6 col-lg-4">
        
        <div class="footer-blog">
        
          <h3>Menu</h3>

          <div>
            <a href="#">Códigos Html</a>
          </div>

          <div>
            <a href="#">Códigos Css</a>
          </div>

          <div>
            <a href="#">jQuery</a>
          </div>

          <div>
            <a href="#">WordPress</a>
          </div>
        
        </div>

      </div><!--Coluna 1-->
      

      <div class="col-md-6 col-lg-4">
      
        <div class="footer-tags">
          <h3>Tags</h3>
          <a href="#">html</a>
          <a href="#">css</a>
          <a href="#">jquery</a>
          <a href="#">h1</a>
          <a href="#">article</a>
          <a href="#">footer</a>
          <a href="#">slide</a>
          <a href="#">menus</a>
          <a href="#">picture</a>
          <a href="#">nav</a>
          <a href="#">ul</a>
          <a href="#">li</a>
          <a href="#">header</a>
          <a href="#">aside</a>
          <a href="#">form</a>
          <a href="#">label</a>
          <a href="#">input</a>
        </div>
      
      </div><!--Coluna 2-->


      <div class="col-md-6 col-lg-4">
        
        <div class="footer-newsletter">
          
          <h3>Newsletter</h3>
          <form class="form" action="#" method="post">
            <input class="campo" placeholder="Nome" required="">
            <input class="campo" placeholder="E-mail" required="">
            <button class="btn">Assinar</button>
          </form>

        </div>

      </div><!--Coluna 3-->

    </div><!--row-->

  </div><!--container-->

  <div class="container">
    <div class="footer-contact">
      <div class="row align-items-center">
        

        <div class="col-md-6">
          <h4>E-mail</h4>
          <p>contato@loopnerd.com.br</p>
        </div>
        
        <div class="col-md-6">
        
          <h4>Redes Sociais</h4>
          <a href="https://twitter.com/"><i class="fab fa-twitter"></i></a>
          <a href="https://www.facebook.com/"><i class="fab fa-facebook-f"></i></a>
          <a href="https://www.instagram.com/"><i class="fab fa-instagram"></i></a>
          <a href="https://br.pinterest.com/"><i class="fab fa-pinterest"></i></a>
        
        </div>

      </div>
    </div>
  </div>

  <div class="copyright">
    <div class="container">
    
      <div class="row align-items-center">
        
        <div class="col-md-6">
          <div class="copy-text">
            <p>&copy; <a href="#">Seu site</a> - Todos os Direitos Reservados.</p>
          </div>
        </div>
        
        <div class="col-md-6">
          <div class="copy-menu">
            <a href="#">Termos de Uso</a>
            <a href="#">Privacidade</a>
            <a href="#">Loop Nerd</a>
          </div>
        </div>
      
      </div>
    
    </div><!--container-->
  </div><!--copyright-->

</footer>







	<!-- JavaScript (Opcional) -->
	<!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>