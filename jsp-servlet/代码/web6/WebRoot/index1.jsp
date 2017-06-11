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
    <%-- JSP注释，在客户端是看不见的 --%>
    <!-- 网页注释，客户端可见 -->
    <%-- 嵌入的Java脚本 --%>
    <%
    	Date time = new Date();
    	SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
    	String strTime = format.format(time);
    %>
    <%-- 表达式 输出变量 strTime--%>
    <%=strTime %>
  </body>
</html>












