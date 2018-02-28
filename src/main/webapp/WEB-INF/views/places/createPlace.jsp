<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Where 2 Go - Create Place</title>
</head>
<body>
	<form action="savePlace" method="post">
		<input name="id" type="hidden" value="${place.id}"/>
		<table>
			<tr>
				<td>Place's name:</td>
				<td><input id="name" name="name" value="${place.name}"></td>
			</tr>
			<tr>
				<td>Website:</td>
				<td><input id="webSite" name="webSite" value="${place.webSite}"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input id="phone" name="phone" value="${place.phone}"></td>
			</tr>
			<tr>
				<td><b>Place's address</b></td>
			</tr>
			<tr>
				<td>Suite:</td>
				<td><input id="address.suite" name="address.suite" value="${place.address.suite}"></td>
			</tr>
			<tr>
				<td>Street Number:</td>
				<td><input id="addressStreetNumber" name="addressStreetNumber" value="${place.address.streetNumber}"></td>
			</tr>
			<tr>
				<td>Street:</td>
				<td><input id="addressStreet" name="addressStreet" value="${place.address.street}"></td>
			</tr>
			<tr>
				<td>Postal Code:</td>
				<td><input id="addressPostalCode" name="addressPostalCode" value="${place.address.postalCode}"></td>
			</tr>	
			<tr>
			<td><input type="submit" value="Submit"></td>
			</tr>		
		</table>		
	</form>
	${place.address}
</body>
</html>