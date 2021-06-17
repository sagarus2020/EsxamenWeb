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
	<div class="container">
		<div class="py-5 text-center">
			<img class="d-block mx-auto mb-4"
				src="/docs/4.4/assets/brand/bootstrap-solid.svg" alt="" width="72"
				height="72">
			<h2>Checkout form</h2>
			<p class="lead">Below is an example form built entirely with
				Bootstrap’s form controls. Each required form group has a validation
				state that can be triggered by attempting to submit the form without
				completing it.</p>
		</div>-

		<div class="row">
			<div class="col-md-4 order-md-2 mb-4"></div>
			<div class="col-md-8 order-md-1">
				<h4 class="mb-3">Registro</h4>
				<form class="needs-validation" novalidate="">
					<div class="row">
						<div class="col-md-6 mb-3">
							<label for="firstName">First name</label> <input type="text"
								class="form-control" id="firstName" placeholder="" value=""
								required="">
							<div class="invalid-feedback">Valid first name is required.
							</div>
						</div>
						<div class="col-md-6 mb-3">
							<label for="lastName">Last name</label> <input type="text"
								class="form-control" id="lastName" placeholder="" value=""
								required="">
							<div class="invalid-feedback">Valid last name is required.
							</div>
						</div>
					</div>

					<div class="mb-3">
						<label for="username">Username</label>
						<div class="input-group">
							<div class="input-group-prepend">
								<span class="input-group-text">@</span>
							</div>
							<input type="text" class="form-control" id="username"
								placeholder="Username" required="">
							<div class="invalid-feedback" style="width: 100%;">Your
								username is required.</div>
						</div>
					</div>

					<div class="mb-3">
						<label for="email">Email <span class="text-muted">(Optional)</span></label>
						<input type="email" class="form-control" id="email"
							placeholder="you@example.com">
						<div class="invalid-feedback">Please enter a valid email
							address for shipping updates.</div>
					</div>


					<div class="row">
						<div class="col-md-5 mb-3">
							<label for="country">Country</label> <select
								class="custom-select d-block w-100" id="country" required="">
								<option value=""></option>
								<option></option>
							</select>
							<div class="invalid-feedback">Please select a valid
								country.</div>
						</div>
						<div class="col-md-4 mb-3">
							<label for="state">State</label> <select
								class="custom-select d-block w-100" id="state" required="">
								<option value="">Choose...</option>
								<option>California</option>
							</select>
							<div class="invalid-feedback">Please provide a valid state.
							</div>
						</div>
						<div class="col-md-3 mb-3">
							<label for="zip">Zip</label> <input type="text"
								class="form-control" id="zip" placeholder="" required="">
							<div class="invalid-feedback">Zip code required.</div>
						</div>
					</div>
			</div>
		</div>
		<hr class="mb-4">
		<button class="btn btn-primary btn-lg btn-block" type="submit">Registrar</button>
		</form>
	</div>
	</div>

	<footer class="my-5 pt-5 text-muted text-center text-small">
		<p class="mb-1"></p>
		<ul class="list-inline">
			<li class="list-inline-item"><a href="#">Privacy</a></li>
			<li class="list-inline-item"><a href="#">Terms</a></li>
			<li class="list-inline-item"><a href="#">Support</a></li>
		</ul>
	</footer>
	</div>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="/docs/4.4/assets/js/vendor/jquery.slim.min.js"><\/script>')
	</script>
	<script src="/docs/4.4/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-6khuMg9gaYr5AxOqhkVIODVIvm9ynTT5J4V1cfthmT+emCG6yVmEZsRHdxlotUnm"
		crossorigin="anonymous"></script>
	<script src="form-validation.js"></script>

</body>
</html>