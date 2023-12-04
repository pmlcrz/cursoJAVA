<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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

	<hr>
	<nav>
		<a href="index.jsp">Início</a> &nbsp; | &nbsp; <a
			href="CadAdvogado.jsp">Cadastro de advogados</a> &nbsp; | &nbsp; <a
			href="CadCliente.jsp">Cadastro de clientes</a> &nbsp; | &nbsp; <a
			href="#">Causas</a> &nbsp; | &nbsp; <a href="#">Contato</a>
		<hr>
	</nav>

	<div class="container">

		<div id="carouselExampleIndicators" class="carousel slide">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleIndicators"
					data-bs-slide-to="0" class="active" aria-current="true"
					aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators"
					data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators"
					data-bs-slide-to="2" aria-label="Slide 3"></button>
			</div>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="./static/img/adv.jpg" class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="./static/img/adv1.jpg" class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="./static/img/adv2.jpg" class="d-block w-100" alt="...">
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
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

	



<!-- JavaScript (Opcional) -->
	<!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>