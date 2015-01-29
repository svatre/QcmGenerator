<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
<title>Création d'un QCM</title>
</head>
<body>
<div class="container">
	<button type="button" class="btn btn-sm btn-info btn-deco">Déconnexion</button>
	<div class="row">
		<h3>Création du QCM Servlet</h3>
		<div class="col-lg-8 margtop margbott cadre"> <!-- Boucle -->
			<span class="alignR rouge">4 pts</span>
			<p class="margtop bold">Java est un langage..</p>
			<label class="margtop halfwidth">
		       	<span class="vert">Réponse 1</span>
		    </label>
		    <label class="margtop halfwidth">
		        <span class="noBold">Réponse 2</span>
		    </label>
		    <label class="margtop halfwidth">
		        <span class="noBold">Réponse 3</span>
		    </label>
		    <label class="margtop halfwidth">
		        <span class="noBold">Réponse 4</span>
		    </label>
		    <input class="btn btn-primary margtop" type="submit" value="Ajouter"/>
		</div>
		<div class="col-lg-4 margtop fixedR">
			<h3 style="text-align:center;">Total</h3>
			<div class="table-responsive">
				<table class="table">
					<tbody>
						<tr>
							<td><span class="glyphicon glyphicon-trash"
								aria-hidden="true"></span></td>
							<td>Que signifie le sigle</td>
							<td>4pts</td>
						<tr>
					</tbody>
				</table>
			</div>
			<p class="total">4 / 20</p>
			<button type="button" class="btn btn-sm btn-warning" style="margin-top:30px; position:fixed; right:12%;">
				Associer une classe</button> 
		</div>
	</div>
</div>
</body>
</html>