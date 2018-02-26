<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello World

	<a href="hello">Hello</a>
	
	<br><br>
	
	
	<a href="testPathVariable/2">Path Variable</a>

	<br><br>
	<a href="tetRest/1">Test Rest Get</a>	
	<br><br>
	<form action="tetRest" method="post">
		<input type="submit" value="Test Rest Post"/>
	</form>	
	<br><br>
	<form action="tetRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="Test Rest Delete"/>
	</form>
	<br><br>
	<form action="tetRest/1" method="post">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="Test Rest PUT"/>
	</form>

</body>
</html>