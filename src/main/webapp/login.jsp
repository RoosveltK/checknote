<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=0,minimal-ui" />
<title>Connexion</title>
<meta content="Admin Dashboard" name="description" />
<meta content="Themesbrand" name="author" />
<link rel="shortcut icon" href="assets/images/favicon.ico" />
<link href="assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets/css/metismenu.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets/css/icons.css" rel="stylesheet" type="text/css" />
<link href="assets/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div class="home-btn d-none d-sm-block">
		<a href="check" class="text-white"><i class="fas fa-home h2"></i></a>
	</div>
	<div class="wrapper-page">
		<div class="card overflow-hidden account-card mx-3">
			<div class="bg-primary p-4 text-white text-center position-relative">
				<h4 class="font-20 m-b-5">Bon retour!</h4>
				<p class="text-white-50 mb-4"></p>
				<a href="check" class="logo logo-admin"><img
					src="assets/images/logo-sm.png" height="24" alt="logo" /></a>
			</div>
			<div class="form-horizontal m-t-30" style="padding: 30px">
				<div class="form-group">
					<label for="username">Username</label> <input type="text"
						class="form-control" id="username"
						placeholder="Entrer le username" />
				</div>
				<div class="form-group">
					<label for="userpassword">Mot de passe</label> <input
						type="password" class="form-control" id="userpassword"
						placeholder="Entrer le mot de passe" />
				</div>
				<div class="row">
					<div class="col" id="info"
						style="text-align: center; color: #DA2C46;"></div>
				</div>
				<div class="form-group row m-t-20">
					<div class="col-sm-6"></div>
					<div class="col-sm-6 text-right">
						<button class="btn btn-primary w-md waves-effect waves-light"
							onclick="login()">Connexion</button>
					</div>
				</div>
				<div class="form-group m-t-10 mb-0 row"></div>
			</div>
		</div>
	</div>
	</div>
	<!-- end wrapper-page -->
	<!-- jQuery  -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/bootstrap.bundle.min.js"></script>
	<script src="assets/js/metisMenu.min.js"></script>
	<script src="assets/js/jquery.slimscroll.js"></script>
	<script src="assets/js/waves.min.js"></script>
	<script src="assets/js/mainLogin.js"></script>

	<!-- App js -->
	<script src="assets/js/app.js"></script>
</body>
<body></body>
</html>
