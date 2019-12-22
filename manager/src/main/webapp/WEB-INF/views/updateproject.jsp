<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html">
<body>
<div class="form">
<form action="/addnewproject/${managerId}" method="get" >
<table>
<tr>
<td>Manager Id</td>
<td>${managerId}</td>
</tr>
<tr>
<td>Old Assigned Project</td>
<td>${project.projectName}</td>
</tr>
<tr>
<td>Select new project</td>
<td>
<c:if test="${project!=null}">
<select name="projectId">
<c:forEach var="project" items="${projects}">
<option value="${project.projectName}"></option>
</c:forEach>
</select>
</c:if>
</td>
</tr>
</table>
<input type="submit" value="update"/>
</form>
</div>
<a href="/getform">Home</a>
</body>
</html>