<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.text.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
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
  		jsp页面第一次被请求的时候，服务器先判断是否是第一次请求，如果是，jsp引擎将该jsp文件转换成一个servlet，并生成字节码文件，并执行jspInit()方法。
  		然后去访问字节码文件，然后解析执行jspService()方法
  		
  		如果不是第一次请求，直接去访问字节码文件，然后解析执行jspService()方法
  		
  		jspService()方法被调用来处理客户端的请求，对每一个请求，jsp引擎创建一个新的线程来处理该请求。
  		如果有多个客户端同时请求该jsp文件，则jsp引擎会创建多个线程，每个客户端请求对应一个线程。
  		
  	 -->
    <h1>jsp生命周期</h1>
   	<hr>
   	<%
   		SimpleDateFormat sdf = new SimpleDateFormat();
   		String s = sdf.format(new Date());
   	%>
   	
   	今天是：<%=s %>
  </body>
</html>
