<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" isErrorPage="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'exception.jsp' starting page</title>
    
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
    <h1>exception内置对象</h1>
    <hr>
    <!-- exception 对象是一个异常对象，当一个页面在运行过程中发生了异常，就产生这个对象。
    		如果一个JSP页面要使用此对象，就必须把isErrorPage设为true，否则无法编译。
    		它实际上是java.lang.Throwable的对象
    		
    		异常处理页面也要设置一个属性：isErrorPage="true"。
     -->
     	异常消息是：<%=exception.getMessage() %><br>
     	异常的字符串描述：<%=exception.toString() %><br>`
     
  </body>
</html>
