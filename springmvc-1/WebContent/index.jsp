<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="helloWorld">Hello World</a>
	<br>
	<a href="springmvc/test">test</a>
	<br>
	
	<form action="springmvc/testMehod" method="post">
		<input type="submit" value="submit"/>
	</form>
	
	<br>
	<a href="springmvc/testParamtersAndHeaders?username=roy&age=11">testParamtersAndHeaders</a>
	
</body>
</html>