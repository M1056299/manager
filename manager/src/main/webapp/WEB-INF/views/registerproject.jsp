<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html">

<title>Insert</title>
</head>
<body>
<div class="form">
<form action="insertprojects" method="post" >
<table>
<tr>
<td>Enter Project Name:</td>
<td><input type="text" id="projectName" name="projectName"></td>
</tr>

<tr>
<td>Enter Project Revenue:</td>
<td><input type="number" id="revenue" name="revenue"></td>
</tr>
<tr>
<td><input type="submit" value="insert"/></td>
</tr>
</table>
</form>

<a href="/getform">back to home</a>
</div>
</body>
</html>