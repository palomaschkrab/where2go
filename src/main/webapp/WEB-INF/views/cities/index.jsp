<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Where 2 Go - Cities</title>
</head>
<body>

	<a href="createCity">Add a new City</a>
	<table>
		<tr>
		    <th>Name</th>
		    <th>Province</th> 
		    <th>Delete/Edit</th>
		  </tr>
		
		<c:forEach items="${cityList}" var="city">
		    <tr>
		        <td><c:out value="${city.name}"/></td>
		        <td><c:out value="${city.province.shortName}"/></td>  
		        <td>
		        	<form action="deleteCity" method="post">
		        		<button name="id" value="${city.id}">Delete</button>
		        	</form>
		        	<form action="editCity" method="get">
		        		<button name="id" value="${city.id}">Edit</button>
		        	</form>
		        </td>
		    </tr>
		</c:forEach>
	</table>
</body>
</html>