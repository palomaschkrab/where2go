<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Where 2 Go - Create Province</title>
</head>
<body>
	<div class="form">
			<form action="saveProvince" method="post">
				<input name="id" type="hidden" value="${province.id}"/>
				<table>
					<tr>
						<td>Province's name</td>
						<td><input id="name" name="name" value="${province.name}"></td>
						<td>Province's abbreviation</td>
						<td><input id="shortName" name="shortName"  value="${province.shortName}"></td>
						<td><input type="submit" value="Submit"></td>
					</tr>
				</table>
			</form>		
		</div>
</body>
</html>