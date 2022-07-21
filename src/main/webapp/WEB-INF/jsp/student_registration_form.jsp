<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student registration form</title>
</head>
<body>
	<form action="saveStudent" method="post">
    name <input type="text" name="name"><br>
    email <input type="email" name="email"><br>
    mobile <input type="text" name="mobile"><br>
    fee <input type="text" name="fee"><br>
    <input type="submit" value="save">
	</form>
</body>
</html>