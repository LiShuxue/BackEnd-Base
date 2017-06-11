<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'pageContext.jsp' starting page</title>
    
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
    <h1>pageContext内置对象</h1>
    <hr>
    <!-- 
    	pageContext对象提供了对JSP页面所有的对象及名字空间的访问，它的范围是最大的
     -->
     
     <!-- 访问其他页面中的内容 -->
  	 用户名是：<%=pageContext.getSession().getAttribute("username") %><br>
  	 
  	 <!-- 跳转到其他页面.forward,跳到注册页面 -->
  	 <%
  	 	//pageContext.forward("../request对象/registe.jsp");
  	 %><br>
  	 
  	 <!-- 包含其他页面.include-->
     <%
     	pageContext.include("include.jsp");
     %>   
  </body>
</html>
