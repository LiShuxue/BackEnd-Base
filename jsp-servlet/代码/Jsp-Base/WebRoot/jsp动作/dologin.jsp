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
    <h1>setProperty动作元素的使用方法</h1>
    
    <jsp:useBean id="user3" class="com.lsx.bean.Users" scope="page"/>
    
    <!-- 根据表单自动匹配所有属性 -->
    <%--
    <jsp:setProperty property="*" name="user3"/>
    --%>
    
    <!-- 根据表单匹配部分属性 -->
    <%--
    <jsp:setProperty property="username" name="user3"/>
    --%>
    
    <!-- 手工设置属性值，跟表单无关-->
    <%--
    <jsp:setProperty name="user3" property="username" value="lisi"/>
    <jsp:setProperty name="user3" property="password" value="888888"/>
    --%>
    
    <!-- 通过URL传参数来设置属性值-->
    <jsp:setProperty name="user3" property="username" param="myuser"/>
    <jsp:setProperty name="user3" property="password" param="mypass"/>
    
    <!-- 使用传统的表达式方式获取用户名密码 -->
  	用户名：<%=user3.getUsername() %><br>
  	密码：<%=user3.getPassword() %><br>
  	<hr>
  	<br>
  	<br>
  	
  	<h1>getProperty动作元素的使用方法</h1>
  	<!-- 使用getProperty获取用户名密码 -->
  	用户名：<jsp:getProperty property="username" name="user3"/><br>
  	密码：<jsp:getProperty property="password" name="user3"/><br>
  	<hr>
  </body>
</html>
