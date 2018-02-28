<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Where 2 Go - Create City</title>
</head>
<body>
	<form action="saveCity" method="post">
	<input name="id" type="hidden" value="${city.id}"/>
		<table>
			<tr>
				<td>City's name</td>
				<td><input id="name" name="name" value="${city.name}"></td>
				<td>
					<select name="provinceId" id="provinceId">
						<option value="" disabled selected>Select province</option>
						<c:forEach items="${provinceList}" var="province">
							<option value="${province.id}" <c:if test="${province.id eq city.province.id}">selected="selected"</c:if>>${province.shortName}</option>
						</c:forEach>
					</select>	
				</td>							
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>