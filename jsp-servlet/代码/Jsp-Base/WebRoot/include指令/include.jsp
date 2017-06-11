<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'include.jsp' starting page</title>
    
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
    <h1>include指令</h1>
    <hr>
    
    <!-- 
    	include指令和include动作的区别：
    		1.语法格式
    		2.发生作用的时间不同，include指令发生在页面转换期间，include动作发生在请求期间
    		3.包含的内容不同，指令包含文件的实际内容，动作包含的是页面的输出
    		4.指令编译时间慢，动作编译时间快
    		5.指令执行时间稍快，动作执行时间较慢
    		6.指令主页面和包含页面转换为一个servlet，动作主页面和包含页面转换为独立的servlet
     -->
     
     
    <!-- include指令，file属性，包含一个页面 -->
    <%@ include file="date.jsp" %>
  </body>
</html>
