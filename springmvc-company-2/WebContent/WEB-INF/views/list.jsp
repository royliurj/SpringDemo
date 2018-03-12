<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:if test="${empty requestScope.employees}">
		没有任何员工信息
	</c:if>
	<c:if test="${!empty requestScope.employees }">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Department</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="emp" items="${requestScope.employees }">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.email}</td>
					<td>${emp.department.name}</td>
					<td><a href="">Edit</a></td>
					<td><a href="">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<br><br>
	<a href="emp">Add new Employee</a>
</body>
</html>