<%@ include file="./_header.jsp" %>


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
				class="sr-only">Anterior</span>
			</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Próximo</span>
			</a>

		</div>

		&nbsp;

		<div class="row align-items-start">
			<div class="col">
				<div class="card">
					<img src="./static/img/adv.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<p class="card-text">Civil</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card">
					<img src="./static/img/adv1.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<p class="card-text">Trabalhista</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card">
					<img src="./static/img/adv2.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<p class="card-text">Criminal</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="./_footer.jsp" %>
	