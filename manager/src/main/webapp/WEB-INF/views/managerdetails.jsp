<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html">
<title>Insert</title>
</head>
<body>
<div class="form">
<form:form action="insertmanagerproject" method="Post">
<table>
<tr>
<td>Enter Manager Name:</td>
<td><input type="text" id="managerName" name="managerName"></td>
</tr>
<tr>
<td>Enter year of Experience:</td>
<td>
<input type="number" id="yearOfExp" name="yearOfExp"></td>
</tr>
<c:if test="${projects!=null }">
<table class="table table-striped">
			
				<tr class="table-primary">
<c:forEach var="project" items="${projects}">
<tr>
<td>${project.projectName}</td>
<td><input type="checkbox" name="projects" value="${project.projectId}" id=${project}></td>
</tr>
</c:forEach>
</tr>
</c:if>
<tr>
<td><input type="Submit" value="insert details"></td>
</tr>
</table>
</form:form>

<a href="/getform">back to home</a>
</body>
</html>




