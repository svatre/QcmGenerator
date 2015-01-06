<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="styles/styles.css"/>
<link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/assets/bootstrap/2.2.2/css/bootstrap.min.css" media="all"/>
<title>Bienvenue à vous</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-offset-4 col-lg-4">
				<h1>Connexion</h1>
				<div class="input-group input-group-lg">
					<input class="form-control" type="text" name="identifiant" placeholder="identifiant"/>
					<input class="form-control" type="password" name="mdp" placeholder="mot de passe"/>
					<input class="btn btn-primary" type="submit" value="Connecter"/>
				</div>
			</div>
		</div>
	</div>
</body>
</html>