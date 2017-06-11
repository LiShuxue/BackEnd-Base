<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'paramAction.jsp' starting page</title>
    
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
    <h1>param动作</h1>
    <hr>
    <!-- 
    	<jsp:param name="参数名" value="参数值"/> 
    	常与forward动作一起使用，作为其子标签
    	forward动作是跳转，param动作相当于跳转的时候传参数
    	
    	这里可以添加新的参数，也可以修改原来的参数
    -->
    <jsp:forward page="">
    	<jsp:param value="" name=""/>
    </jsp:forward>
  </body>
</html>
