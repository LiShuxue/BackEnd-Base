<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

    	<p>演示Session监听器</p>
    	<%-- 在你创建session对象，和销毁的时候，执行HttpSessionListener中的方法 --%>
    	<p><a href="DemoServlet">演示功能HttpSessionListener</a></p>
    	
    	<%-- 在你向session中存储，修改，删除数据的时候，执行HttpSessionAttributeListener --%>
    	<p><a href="DemoServlet?attr=true">演示功能HttpSessionAttributeListener</a></p>
  </body>
</html>
