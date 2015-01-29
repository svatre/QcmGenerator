<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">>
<title>Liste des questions</title>
</head>
<body>
<div class="container">
	<button type="button" class="btn btn-sm btn-info btn-deco">Déconnexion</button>
	<div class="row">
		<div class="col-lg-offset-1 col-lg-10 margtop">
			<div class="row margtop">
				<div class="col-lg-6">
					<h3 class="nomargtop">Liste des questions</h3>
				</div>
				<div class="col-lg-3">
					<button type="button" class="btn btn-sm btn-warning">Modification</button>
				</div>
				<div class="col-lg-3">
					<button type="button" class="btn btn-sm btn-danger">Suppression</button>
				</div>
			</div>
			<div class="table-responsive margtop">
			    <table class="table table-bordered table-hover table-striped">
			          <thead>
			            <tr>
			              <th>Question</th>
			              <th>Thème</th>
			              <th>Date de création</th>
			              <th>Barème</th>
			            </tr>
			          </thead>
			          <tbody>
			            <tr>
			              <td><input id="id_QCM" type="checkbox" checked=""/> Java est un langage..</td>
			              <td>JEE</td>
			              <td>05/01/2015</td>
			              <td>3 pts</td>
			            </tr>
			            <tr>
			          </tbody>
			    </table>
			 </div>
			 <button type="button" class="btn btn-sm btn-info" style="margin-top:30px;">Ajouter une question</button> 
		</div>
	</div>
</div>
</body>
</html>