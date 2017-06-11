<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'session_page2.jsp' starting page</title>
    
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
  	<h1>session内置对象</h1>
    <hr>
  	<!-- 依然是上个页面的session -->
     session的ID编号：<%=session.getId() %><br>
                 从session中获取用户名：<%=session.getAttribute("username") %><br>
     session中保存的属性有：<%
     	String[] names = session.getValueNames();
     	for(int i=0; i<names.length; i++) {
     		out.println(names[i] + "&nbsp;&nbsp");
     	}
     	
     %>
  </body>
</html>
