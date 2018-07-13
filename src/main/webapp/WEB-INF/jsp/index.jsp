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

<form action="/save" modelAttribute="employeeDetails" method="post">
  Employee ID :<br>
  <input type="text" name="id" >
  <br>
  Name :<br>
  <input type="text" name="name" >
  <br>
  Email :<br>
  <input type="text" name="email" >
  <br>
  Location :<br>
  <input type="text" name="location" >
  <br><br>
  <input type="submit" value="Submit">
</form> 


</body>
</html>
