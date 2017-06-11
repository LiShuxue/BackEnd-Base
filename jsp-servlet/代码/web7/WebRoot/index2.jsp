<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
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
    	request 请求级别
    	当Jsp中产生“请求转发”时，需要通过request set/getAttribute方法来设置/获取数据
    	请求转发，在源位置保存数据，  在转发目标位置来获取数据
    	所以request（请求级别）获取数据是在 第二个位置才能获取数据的
    	总结： request 转发，是两个页面之间 共享数据 的功能
     -->
     <%
     	request.setAttribute("reqKey", "reqValue");
     	request.getRequestDispatcher("show2.jsp").forward(request, response);
     %>
  </body>
</html>




