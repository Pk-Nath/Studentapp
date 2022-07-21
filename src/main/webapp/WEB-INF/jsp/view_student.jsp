<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>list of students</h2>
<table border="1">
  <tr>
  <th>name</th>
  <th>email</th>
  <th>mobile</th>
  <th>fee</th>
  <th>Delete</th>
  <th>Update</th>
  </tr>
  
  <c:forEach items="${studs}" var="s">
  <tr>
  <td>${s.name}</td>
  <td>${s.email}</td>
  <td>${s.mobile}</td>
  <td>${s.fee}</td>
  <td> <a href="deleteStud?id=${s.id}">delete</a> </td>
  <td> <a href="updateStud?id=${s.id}">update</a> </td>
  </tr>
  </c:forEach>
  
</table>
</body>
</html>