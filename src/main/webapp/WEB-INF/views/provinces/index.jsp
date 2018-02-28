<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Where 2 Go - Provinces</title>
</head>
<body>
	<h3>Provinces</h3>
	<a href="createProvince">Create Province</a>
	<table>
		<tr>
		    <th>Name</th>
		    <th>Abbreviation</th> 
		    <th>Delete/Edit</th>
		  </tr>
	
		<c:forEach items="${provinceList}" var="province">
		    <tr>
		        <td><c:out value="${province.name}"/></td>
		        <td><c:out value="${province.shortName}"/></td>  
		        <td>
		        	<form action="deleteProvince" method="post">
		        		<button name="id" value="${province.id}">Delete</button>
		        	</form>
		        	<form action="editProvince" method="get">
		        		<button name="id" value="${province.id}">Edit</button>
		        	</form>
		        </td>
		    </tr>
		</c:forEach>
	</table>
</body>
</html>