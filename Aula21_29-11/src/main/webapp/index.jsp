<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Escritório de Advocacia</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<style>
body {
	background-color: #CEDBEA;
}

nav {
	/*background-color:#fff;*/
	
}

.wrapper {
	height: 30vh;
	/*This part is important for centering*/
	display: grid;
	place-items: center;
}

.typing-demo {
	width: 24ch;
	animation: typing 2s steps(22), blink .5s step-end infinite alternate;
	white-space: nowrap;
	overflow: hidden;
	border-right: 3px solid;
	font-family: monospace;
	font-size: 2em;
}

@
keyframes typing {from { width:0
	
}

}
@
keyframes blink { 50% {
	border-color: transparent
}
}
</style>

<title>TC Advogados</title>
</head>
<body>
	<div class="wrapper">
		<div class="typing-demo">
			<h1>TC Advogados</h1>
		</div>
	</div>
<body>
	<hr>
	<nav style="text-align: center">
		<a href="index.jsp">Início</a> &nbsp;|&nbsp; <a href="buscaadvogados">Cadastro
			de Advogado</a> &nbsp;|&nbsp; <a href="buscacliente">Cadastro de
			Cliente</a>
	</nav>
	<hr>

	<div class="container">

		<div id="carouselExampleIndicators" class="carousel slide"
			data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carouselExampleIndicators" data-slide-to="0"
					class="active"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img class="d-block w-100" src="./static/img/adv.jpg"
						alt="First slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="./static/img/adv1.jpg"
						alt="Second slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="./static/img/adv2.jpg"
						alt="Third slide">
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleIndicators"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>

		</div>

		&nbsp;

		<div class="row align-items-start">
			<div class="col">
				<div class="card">
					<img src="./static/img/adv.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<p class="card-text">lorem ipsum</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card">
					<img src="./static/img/adv1.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<p class="card-text">lorem ipsum</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card">
					<img src="./static/img/adv2.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<p class="card-text">lorem ipsum</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<hr>
	<div>
	<h6>@ 2023 - TC Advogados</h6>
	</div>
	<hr>

	<!-- JavaScript (Opcional) -->
	<!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</body>
</html>