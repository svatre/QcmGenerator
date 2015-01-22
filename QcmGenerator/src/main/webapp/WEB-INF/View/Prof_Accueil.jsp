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
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<title>Nom Prof</title>

</head>
<body>
<div class="container">
	<button type="button" class="btn btn-sm btn-info btn-deco">Déconnexion</button>
	<div class="row">
		<div class="col-lg-offset-1 col-lg-10 margtop cadre">	
			<h3>Création d'un QCM</h3><br/>
			<div class="input-group input-group-lg">
				<input class="form-control margbott" type="text" name="nom_QCM" placeholder="Nom du questionnaire"/>
				<select class="form-control margbott">
					<option>Java</option>
					<option>J2EE</option>
                </select>
                <div class="row">
	                <div class="col-lg-2">
	                	<span>Date de début :</span>
	                </div>
	                <div class="col-lg-4">
	                	<input class="form-control margbott" type="text" placeholder="29/04/2015 14:00" id="date1">
	                </div>
	                <div class="col-lg-2">
	                	<span>Date de fin :</span>
	                </div>
	                <div class="col-lg-4">
	                	<input class="form-control margbott" type="text" placeholder="29/04/2015 15:15" id="date2">
	                </div>
                </div>
                <input class="btn btn-primary" type="submit" value="Créer"/>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-offset-1 col-lg-10 margtop margbott">
			<h3>Partie questions</h3><br/>
			<div class="row">
				<div class="col-lg-5">
					<button type="button" class="btn btn-sm btn-info">Liste des questions</button>
				</div>
				<div class="col-lg-5">
					<button type="button" class="btn btn-sm btn-info">Ajouter une question</button>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-offset-1 col-lg-10 margtop bordertop">
			<div class="row margtop">
				<div class="col-lg-3">
					<h3 class="nomargtop">QCM créés</h3>
				</div>
				<div class="col-lg-3">
					<button type="button" class="btn btn-sm btn-warning">Modification</button>
				</div>
				<div class="col-lg-3">
					<button type="button" class="btn btn-sm btn-danger">Suppression</button>
				</div>
				<div class="col-lg-3">
					<button type="button" class="btn btn-sm btn-success">Statistiques</button>
				</div>
			</div>
			<div class="table-responsive margtop">
			    <table class="table table-bordered table-hover table-striped">
			          <thead>
			            <tr>
			              <th>Nom</th>
			              <th>Matière</th>
			              <th>Date de création</th>
			              <th>Date de début</th>
			              <th>Date de fin</th>
			              <th>Etat</th>
			            </tr>
			          </thead>
			          <tbody>
			            <tr>
			              <td><input id="id_QCM" type="checkbox" checked=""/> QCM2</td>
			              <td>JSP</td>
			              <td>05/01/2015</td>
			              <td>22/01/2015 13:30:00</td>
			              <td>22/01/2015 15:15:00</td>
			              <td>Actif</td>
			            </tr>
			            <tr>
			          </tbody>
			    </table>
			 </div>
		</div>
	</div>
</div>

</body>
</html>