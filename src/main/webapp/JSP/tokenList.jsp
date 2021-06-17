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
<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="#" class="navbar-brand">Gestión de tokens</a>
			</div>
			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Tokens</a></li>
			</ul>
		</nav>
	</header>
	<br />
	<div class="row">
		<div class="contaier">
			<h3 class="text-center">Listado de tokens</h3>
			<hr>
			<div class="container text-left">
				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Agregar
					Nuevo token</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>host</th>
						<th>Userdb</th>
						<th>Pass</th>
						<th>db</th>
						<th>Token</th>
						<th>Port</th>
						<th>state</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="usuario" items="${listTokens}">
						<tr>
							<td><c:out value="${usuario.id}" /></td>
							
							<td><c:out value="${usuario.host}" /></td>
							<td><c:out value="${usuario.userdb}" /></td>
							
							<td><c:out value="${usuario.pass}" /></td>
							<td><c:out value="${usuario.db}" /></td>
							<td><c:out value="${usuario.token}" /></td>
							<td><c:out value="${usuario.port}" /></td>
							<td><c:out value="${usuario.state}" /></td>
							<td><a href="edit?id=<c:out value='${usuario.id}'/>">Editar</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
								href="delete?id=<c:out value='${usuario.id}'/>">eliminar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>