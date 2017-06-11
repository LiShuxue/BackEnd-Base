<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="helloword">hello word</a>
	<br>
	<br>
	
	<a href="springmvc/test">test</a>
	<br>
	<br>
	
	<a href="springmvc/testMethod">testMethod</a>
	<br>
	<br>
	
	<form action="springmvc/testMethod" method="post">
		<input type="submit" value="submit"/>
	</form>
	<br>
	<br>
	
	<a href="springmvc/testParam?username=lishuxue&age=22">testParam</a>
	<br>
	<br>
	
	<form action="springmvc/testPOJO" method="post">
		username:<input type="text" name="username"/><br>
		password:<input type="password" name="password"/><br>
		email:<input type="text" name="email"/><br>
		
		<!-- 注意这里运用级联属性的时候前面要写清楚 -->
		province:<input type="text" name="Address.province"/><br>
		city:<input type="text" name="Address.city"/><br>
		<input type="submit" value="submit">
	</form>
	<br>
	<br>
	
	<a href="springmvc/testModelAndView">testModelAndView</a>
	<br>
	<br>
	
	<a href="springmvc/testMap">testMap</a>
	<br>
	<br>
	
	<a href="springmvc/testSessionAttributes">testSessionAttributes</a>
	<br>
	<br>
	
	<a href="springmvc/testView">testView</a>
	<br>
	<br>
	
	<a href="springmvc/testRedirect">testRedirect</a>
	<br>
	<br>
</body>
</html>