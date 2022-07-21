<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update page</title>
</head>
<body>
	<form action="updateStudent" method="post">
        <input type="hidden" name="id" value="${stud.id}">
		name <input type="text" name="name" value="${stud.name}"><br> 
		email <input type="email" name="email" value="${stud.email}"><br> 
		mobile <input type="text" name="mobile" value="${stud.mobile}"><br> 
		fee <input type="text" name="fee" value="${stud.fee}"><br>
		<input type="submit" value="update">
	</form>
</body>
</html>