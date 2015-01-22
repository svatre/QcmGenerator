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
<title>Nom Eleve</title>
</head>
<body>

<div class="container">
		<button type="button" class="btn btn-sm btn-info btn-deco">Déconnexion</button>
		<div class="row">
			<div class="col-lg-offset-1 col-lg-10 margtop">				
				<h3>QCM à faire / en cours</h3>
				<div class="table-responsive">
			    	<table class="table table-bordered table-hover table-striped">
			           <thead>
			             <tr>
			               <th>Nom</th>
			               <th>Matière</th>
			               <th>Professeur</th>
			               <th>Date</th>
			               <th></th>
			             </tr>
			           </thead>
			           <tbody>
			             <tr>
			               <td>QCM2</td>
			               <td>JSP</td>
			               <td>A. De Villedon</td>
			               <td>22/01/2014</td>
			               <td><button type="button" class="btn btn-xs btn-default">Commencer</button></td>
			             </tr>
			             <tr>
			           </tbody>
			         </table>
			     </div>
			  </div>
		</div>
		<div class="row">
			<div class="col-lg-offset-1 col-lg-10 margtop">				
				<h3>QCM à faire / en cours</h3>
				<div class="table-responsive">
			    	<table class="table table-bordered table-hover table-striped">
			           <thead>
			             <tr>
			               <th>Nom</th>
			               <th>Matière</th>
			               <th>Professeur</th>
			               <th>Date</th>
			               <th>Note</th>
			             </tr>
			           </thead>
			           <tbody>
			             <tr>
			               <td>QCM1</td>
			               <td>Servlet</td>
			               <td>A. De Villedon</td>
			               <td>09/01/2014</td>
			               <td>12/20</td>
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