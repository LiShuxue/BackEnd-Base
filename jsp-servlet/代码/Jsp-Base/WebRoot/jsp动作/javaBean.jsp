<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.lsx.bean.Users" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'javaBean.jsp' starting page</title>
    
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
  	
  	<h1>使用普通方式创建javabean的实例</h1>
  	<%
  		Users user = new Users();
  		user.setUsername("admin");
  		user.setPassword("123456");
  	%>
  	用户名：<%=user.getUsername() %><br>
  	密码：<%=user.getPassword() %><br>
  	<hr>
  	
  	<br>
  	<br>
  	<br>
  	
  	<!-- 通过useBean动作来创建 -->
  	<h1>使用useBean动作创建javabean的实例</h1>
  	<jsp:useBean id="user2" class="com.lsx.bean.Users" scope="page"/>
  	
  	用户名：<%=user2.getUsername() %><br>
  	密码：<%=user2.getPassword() %><br>
  	<hr>
    
  </body>
</html>
