<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String identifiant = (String) session.getAttribute("identifiant");
	String mdp = (String) session.getAttribute("mdp");
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
<title>Bienvenue à vous</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-offset-4 col-lg-4">
				<h1>Connexion</h1><br/>
				<fieldset>
					<form method="post" action="?action=prof">
						<div class="input-group input-group-lg">
							<input class="form-control" value="<%=identifiant%>" name="identifiant" type="text" placeholder="identifiant"/>
							<div class="form-group has-error">
								<p class="control-label margtop">${form.erreurs['identifiant']}</p>
							</div>
							<input class="form-control" value="<%=mdp%>" name="mdp" type="password" placeholder="mot de passe"/>
							<div class="form-group has-error">
								<p class="control-label margtop">${form.erreurs['mdp']}</p>
							</div>
							<input class="btn btn-primary" type="submit" value="Connecter"/>
							<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
						</div>
					</form>
				</fieldset>
			</div>
		</div>
	</div>
</body>
</html>