<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
		内置对象 pageContext 通常我们把它理解成   “页面级别”
		可以通过方法  set/getAttribute 方法来保存/获取数据
		操作数据作用范围 只在当前页面中有效
		当数据存储好后，任意位置都可以使用该数据
		通过pageContext对象指定的get方法，可以获取到其他内置对象
	 -->
	 <%
	 	//键值对 保存数据
	 	pageContext.setAttribute("key", "value");
	 	//通过键来获取数据
	 %>
	 
	 <%=pageContext.getAttribute("key") %>
	 <!-- 通过EL表达式 来访问key非常方便 -->
	 <br/> EL访问key: ${key }
	 

  </body>
</html>












