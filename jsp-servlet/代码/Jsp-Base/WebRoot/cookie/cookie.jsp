<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'cookie.jsp' starting page</title>
    
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
    <h1>cookie技术</h1>
  
    	创建Cookie对象：Cookie cookie = new Cookie(String key, Object value);
    	写入Cookie对象：response.addCookie(cookie);
    	读取Cookie对象：Cookie[] cookies = request.getCookies();
     <hr>
     <br>
     
     <h1>session和cookie的对比</h1>
     
     	共同点：都是用来保存用户状态的
     		都会过期，即都有生存期限
     		
     	不同点：session保存在服务器端的内存里，cookie以文本文件保存在客户端
     		session保存的是Object类型，cookie保存的是String类型
     		session随会话的结束而销毁，cookie可以长期保存在客户端
     		session保存重要的信息，安全性高，cookie保存不重要的信息，安全性较低
     <hr>
  </body>
</html>
