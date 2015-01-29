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
<title>Résultats QCM : Nom QCM</title>
</head>
<body>
<div class="container">
	<button type="button" class="btn btn-sm btn-info btn-deco">Déconnexion</button>
	<div class="row">
		<div class="col-lg-offset-1 col-lg-10 margtop">
			<h3 class="nomargtop">Résultats QCM : Servlet 16/01/2015</h3>
			<div class="table-responsive margtop">
			    <table class="table table-bordered table-hover table-striped">
			          <thead>
			            <tr>
			              <th>Elève</th>
			              <th>Date de début examen</th>
			              <th>Date de fin examen</th>
			              <th>Durée</th>
			              <th>Note</th>
			            </tr>
			          </thead>
			          <tbody>
			            <tr>
			              <td>Pierre Dupont</td>
			              <td>05/01/2015 14:00</td>
			              <td>05/01/2015 14:30</td>
			              <td>30mn</td>
			              <td>9/20</td>
			            </tr>
			            <tr>
			          </tbody>
			    </table>
			 </div>
			 <button type="button" class="btn btn-sm btn-info" style="margin-top:30px;">Valider les résultats</button> 
		</div>
	</div>
</div>
</body>
</html>