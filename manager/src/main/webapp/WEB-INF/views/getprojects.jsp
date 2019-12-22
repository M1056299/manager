<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Spring Boot</title>
<body>
	<div class="form">
		<form method="post" action="/get">
			 <table class="table table-striped">
			
				<tr class="table-primary">
					<td>Manager Name:</td>

					<td><select name="managerId">
							<c:forEach var="manager" items="${managers}">
								<option value="${manager.managerName}">${manager.managerName}</option>
							</c:forEach>
					</select></td>

				</tr>
				<tr>
					<td><input type="submit" value="View Details" /><a href="/getform">back to home</a></td>
					</tr>
					
			</table>

		</form>
	</div>
	<div>
		<c:if test="${manager != null }">
			 <table class="table table-striped">
			 			<tr>
					<th>MANAGER ID</th>

					<th>MANAGER NAME</th>
					<th>PROJECT ID</th>

					<th>PROJECT NAME</th>

					<th>PROJECT REVENUE</th>
					
					<th>DELETE PROJECT</th>
				
					<th>UPDATE PROJECT</th>
				</tr>
				<tr>
					

				
				<c:forEach var="project" items="${manager.projects}">
					
<td>${manager.managerId}</td>
					<td>${manager.managerName}</td>
				
					<td>${project.projectId}</td>
					<td>${project.projectName}</td>
					<td>${project.revenue}</td>

					
					<td><a href="/delete/${project.projectId}">Delete</a></td>
<td><a
						href="/update/${manager.managerId}/${project.projectId}">Update</a></td>

					</tr>
				</c:forEach>
			</table>
			<a href="/getform">back to home</a>
		</c:if>
	</div>
</body>
</html>

