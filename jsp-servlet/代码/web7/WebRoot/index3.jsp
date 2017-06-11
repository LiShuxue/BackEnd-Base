<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index3.jsp' starting page</title>
    
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
    <%-- session 会话级别
    	当一个客户端，连接服务器（对服务器发出请求），双方会建立 一个会话。
    	通过会话，服务器才能够辨认出每一个客户端。
    	服务器会为每一个客户端 分配一个 ID ， 根据时间形成，不会重复。
    	在客户端也会保存一个文件（cookie） 里面保存着这个ID
    	
    	当客户端离开站点 ， 或关闭浏览器 ，会话就会结束。
    	会话默认会持续20分钟（无操作），之后会失效。（可以设置）
    	
    	使用session，主要在连接与断开这个期间 ，使服务器和客户端之间共享数据
    	不会限制某一个页面，以及转发。在连接期间任何位置都能够获取session级别的数据（站点内）
    	**** 只是“一个用户” 和  服务器之间的共享，用户之间不能共享。
     --%>
     
     <!-- session id 会话期间id是不会变的，-->
     <%=session.getId() %>
     <!-- 设置会话有效期 秒为单位 -->
     <%
     	session.setMaxInactiveInterval(10);
     %>
  </body>
</html>












