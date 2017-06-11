<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sessionLifeCycle.jsp' starting page</title>
    
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
    <h1>session生命周期</h1>
    <hr>
    
     
    	创建：当客户端第一次访问某个jsp或者servlet的时候，服务器会为当前的会话创建一个sessionId，
    		每次客户端向服务器端发送请求时，都会将此sessionId携带过去，服务端会对此sessionId进行校验
    		
    	活动：某次会话当中通过超链接打开的新页面属于同一次会话
    		只要当前会话页面没有全部关闭，重新打开新的浏览器窗口访问同一项目资源时属于同一次会话。
    		除非本次会话的所有页面都关闭后再重新访问某个jsp或者servlet将会创建新的会话。
    			注意：原有会话还存在，只是这个旧的sessionId仍然存在于服务端，只不过再也没有客户端会携带它然后交于服务器校验。
    			
    	销毁：1.调用session.invalidate()方法
    		2.session过期（超时）
    		3.服务器重新启动
     
     
     
    
    
  </body>
</html>
