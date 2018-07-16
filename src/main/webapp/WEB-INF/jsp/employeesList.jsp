<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Location</th>
		</tr>
		<c:forEach var="emp" items="${empList}">
			<tr>
				<td><c:out value="${emp.name}" /></td>
				<td><c:out value="${emp.email}" /></td>
				<td><c:out value="${emp.location}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>