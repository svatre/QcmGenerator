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
<title>Créer une question</title>
</head>
<body>
<div class="container">
	<button type="button" class="btn btn-sm btn-info btn-deco">Déconnexion</button>
	<div class="row">
		<div class="col-lg-offset-1 col-lg-10 margtop cadre">
			<h3>Créer une question</h3>	
			<div class="input-group input-group-lg">
				<div class="row">
					<div class="col-lg-4">
						<select class="form-control margbott">
							<option>Thème</option>
							<option>J2EE</option>
		                </select>
					</div>
					<div class="col-lg-2">
						<span>Barème</span>
					</div>
					<div class="col-lg-2">
						<input class="form-control" type="number" name="bareme"/>
					</div>
					<div class="col-lg-2">
						<span>Point négatif</span>
					</div>
					<div class="col-lg-2">
						<input class="form-control" type="number" name="pt_negatif"/>
					</div>
				</div>
				<textarea class="form-control margtop" rows="4" cols="50" placeholder="Intitulé"></textarea>
				<label class="checkbox-inline margtop halfwidth">
		        	<input type="checkbox">Réponse 1
		        </label>
		        <label class="checkbox-inline margtop halfwidth">
		        	<input type="checkbox">Réponse 2
		        </label>
		        <label class="checkbox-inline margtop halfwidth">
		        	<input type="checkbox">Réponse 3
		        </label>
		        <label class="checkbox-inline margtop halfwidth">
		        	<input type="checkbox">Réponse 4
		        </label>
		        <input class="btn btn-primary margtop" type="submit" value="Valider"/>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-offset-1 col-lg-10 margtop">
			<button type="button" class="btn btn-sm btn-info" style="margin-top:30px;">Voir toutes les questions</button>
		</div>
	</div>
</div>
</body>
</html>