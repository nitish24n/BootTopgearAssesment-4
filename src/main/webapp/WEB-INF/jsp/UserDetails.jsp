<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Location</th>
		</tr>
		<tr>
			<td><c:out value="${emp.id}" /></td>
			<td><c:out value="${emp.name}" /></td>
			<td><c:out value="${emp.email}" /></td>
			<td><c:out value="${emp.location}" /></td>
		</tr>
	</table>

</body>
</html>