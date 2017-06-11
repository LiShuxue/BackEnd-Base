<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dologin.jsp' starting page</title>
    
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
    <!-- 将scope依次改为application，session，request，page,来测试每个范围是否可以传过去值 -->
    <jsp:useBean id="user3" class="com.lsx.bean.Users" scope="application"/>
    
    <!-- 根据表单自动匹配所有属性 -->
    <jsp:setProperty property="*" name="user3"/>

  	<!-- 使用getProperty获取用户名密码 -->
  	用户名：<jsp:getProperty property="username" name="user3"/><br>
  	密码：<jsp:getProperty property="password" name="user3"/><br>
  	<hr>
  	<br>
  	<a href="jsp作用域/testScope.jsp">测试javabean的四个作用域范围</a>
  </body>
</html>
