<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>success page</h3>
	<!-- time在request范围中 -->
	time:${requestScope.time }
	<br>
	<br>
	names:${requestScope.names }
	<br>
	<br>
	request user:${requestScope.user }
	<br>
	<br>
	session user:${sessionScope.user }
	<br>
	<br>
	request school:${requestScope.school }
	<br>
	<br>
	session school:${sessionScope.school }
	<br>
	<br>
</body>
</html>