<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body class="bg-light">
<header>
		<div class="container">
			<div class="row">
				<nav class="navbar navbar-expand-md navbar-dark bg-dark">
					<ul class="navbar-nav">
						<li><a
							href="<%=request.getContextPath()%>/registro"
							class="nav-link">Inscripcion Usuario</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</header>

	<br>

	<div class="container">
		<div class="row">
			<h2>Registro de usuario</h2>

			<form action="insertarUsuario" method="post">

<hr>
				<fieldset class="form-group">
					<label>Usuario</label> <input type="text" class="form-control"
						name="usuario" required="required" maxlength="20">
				</fieldset>

				<br>

				<fieldset class="form-group">
					<label>Pass</label> <input type="text" class="form-control"
						name="pass" required="required" maxlength="100">
				</fieldset>

				<br>

				<fieldset class="form-group">
					<label>Email</label> <input type="text" class="form-control"
						name="email" required="required" maxlength="50">
				</fieldset>
<br>
				<select class="form-select" aria-label="Default select example"
					name="estamentoId">
					<option selected>Seleccione el estamento</option>
					<c:forEach var="i" items="${roles}">
						<option value="${i.id}">"${i.descripcion}"</option>
					</c:forEach>


				<button type="submit" class="btn btn-danger">Registrar
					Votante</button>
			</form>

			<c:if test="${registrado == true }">
				<div class="alert alert-success" role="alert">El Usuario ha
					realizado su registro de forma correcta</div>
			</c:if>
		</div>
	</div>

</body>
</html>