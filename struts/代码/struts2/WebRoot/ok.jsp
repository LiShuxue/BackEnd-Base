<%@page import="com.lsx.service.UserService"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ok.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<!-- 
  		获取到username和password，是LoginAction那个类中传过来的，并且是相当于请求转发的，而不是index.jsp传过来的 ，从页面获取是${param.username}
  		如果不指定范围的话,依次从page,request,session,application
  		获取的时候并不是根据属性名，而是根据get方法名	
  	-->
    Username:${requestScope.username }<br>
    <%=request.getAttribute("username") %><br>
    Password:${password }<br>
  </body>
</html>
