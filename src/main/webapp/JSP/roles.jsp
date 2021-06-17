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
							href="<%=request.getContextPath()%>/rol"
							class="nav-link">Roles</a></li>
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

				<select class="form-select" aria-label="Default select example"
					name="estamentoId">
					<option selected>Seleccione el estamento</option>
					<c:forEach var="i" items="${roles}">
						<option value="${i.id}">"${i.description}"</option>

					</c:forEach>
</select>
<br>
				<button type="submit" class="btn btn-danger">Registrar
					rol</button>
			</form>

			
		</div>
	</div>

</body>
</html>