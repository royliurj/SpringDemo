<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="testUser">Test Add User</a>

<br><br>


<a href="testRedirect">testRedirect</a>
<br>
<a href="testView">testView</a>
<br>


	<form action="testModelAttribute" method="post">
	
		<input type="hidden" name="id" value="1">
		<br>
		<input type="text" name="name" value="tom">		
		
		<input type="submit" value="submit">
	
	</form>

	<br>
	<a href="hello">hello</a>
	<br>
	<a href="testMap">test Map</a>
	<br>
	<a href="testSession">test Session</a>

</body>
</html>