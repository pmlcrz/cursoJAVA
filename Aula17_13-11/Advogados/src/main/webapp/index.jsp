<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style>
body{
background-color:#CEDBEA;
}
nav{
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

@keyframes typing {
  from {
    width: 0
  }
}
    
@keyframes blink {
  50% {
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
	<a href="index.jsp">Início</a>
	&nbsp; | &nbsp;
	<a href="CadAdvogado.jsp">Cadastro de advogados</a>
	&nbsp; | &nbsp;
	<a href="CadCliente.jsp">Cadastro de clientes</a>
	&nbsp; | &nbsp;
	<a href="#">Causas</a>
	&nbsp; | &nbsp;
	<a href="#">Contato</a>
	<hr>
</nav>
</body>
</html>