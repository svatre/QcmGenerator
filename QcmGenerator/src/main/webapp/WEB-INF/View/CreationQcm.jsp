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
			<a href="#" class="btn btn-sm btn-warning"
			   data-toggle="modal"
			   data-target="#basicModal"
			   style="margin-top:30px; position:fixed; right:12%;">Associer une classe</a>
		</div>
	</div>
</div>
<div class="modal fade" id="basicModal" tabindex="-1" role="dialog" aria-labelledby="basicModal" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
            <h4 class="modal-title" id="myModalLabel">Associer une classe</h4>
            </div>
            <div class="modal-body">
				<div class="table-responsive">
				    <table class="table table-bordered table-hover">
				          <thead>
				            <tr>
				              <th>Nom</th>
				            </tr>
				          </thead>
				          <tbody>
				            <tr>
				              <td><input id="id_classe" type="checkbox"/> Expert2 Développement</td>
				            </tr>
				            <tr>
				              <td><input id="id_classe" type="checkbox"/> Expert1 Développement</td>
				            </tr>
				          </tbody>
				    </table>
				 </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
                <button type="button" class="btn btn-primary">Sauvegarder</button>
        </div>
    </div>
  </div>
</div>
<script src="https://code.jquery.com/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>