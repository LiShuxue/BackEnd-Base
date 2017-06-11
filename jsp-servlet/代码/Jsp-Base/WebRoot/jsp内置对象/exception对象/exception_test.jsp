<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" errorPage="exception.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'exception_test.jsp' starting page</title>
    
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
    <h1>测试异常的页面</h1>
    <hr>
    <!-- errorPage="exception.jsp" 要设置一个属性，这个属性表示当前页面抛出异常时交给哪个页面处理-->
     
     <%
     	System.out.println(100/0);     //抛出运行时异常
     %>
  </body>
</html>
