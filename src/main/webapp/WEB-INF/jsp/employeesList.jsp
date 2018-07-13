<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Email</th><th>Location</th></tr>  
   <c:forEach var="emp" items="${empList}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td>  
   <td>${emp.email}</td>  
   <td>${emp.location}</td>  
   </tr>  
   </c:forEach>  
   </table>  

</body>
</html>