<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body class="text-center">
    <form class="form-signin">
  <img class="mb-4" src="/docs/4.4/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
  <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
  <label for="inputEmail" class="sr-only">Email address</label>
		<fieldset class="form-group">
						<label>Nombre:</label> <input type="text" class="form-control"
							name="nombre" required="required" maxlength="100"
							value="${votante.usuario}" readonly>
					</fieldset>
  <label for="inputPassword" class="sr-only">Password</label>
<fieldset class="form-group">
						<label>Email</label> <input type="email" class="form-control"
							name="email" required="required" maxlength="50"
							value="${ususario.clave}" readonly>
					</fieldset>
  <div class="checkbox mb-3">
    <label>
      <input type="checkbox" value="remember-me"> Remember me
    </label>
  </div>
  <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>

</form>



</body>
</html>