<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="com.lsx.bean.Users" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testScope.jsp' starting page</title>
    
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
    <h1>javaBean的四个作用域范围</h1>
    <hr>
    
    <!-- 如果能够找到id和scope相同的Bean实例，jsp:useBean动作将使用已有的Bean实例而不是创建新的实例 -->
    <!-- 这里的scope也要依次改为application，session，request，page -->
    <jsp:useBean id="user3" class="com.lsx.bean.Users" scope="application" />
   	 用户名：<jsp:getProperty property="username" name="user3"/><br>
  	 密码：<jsp:getProperty property="password" name="user3"/><br>
  	 
  	<br>
  	
  	<hr>
  	<!-- 使用内置对象来获取 -->
  	<%--
  	用户名：<%=((Users)application.getAttribute("user3")).getUsername() %><br>
  	 密码：<%=((Users)application.getAttribute("user3")).getPassword() %><br> 
  	--%>
  	
  	<%--
  	用户名：<%=((Users)session.getAttribute("user3")).getUsername() %><br>
  	 密码：<%=((Users)session.getAttribute("user3")).getPassword() %><br> 
  	--%>
  	
  	<%--
  	用户名：<%=((Users)request.getAttribute("user3")).getUsername() %><br>
  	 密码：<%=((Users)request.getAttribute("user3")).getPassword() %><br> 
  	--%>
    
  </body>
</html>
