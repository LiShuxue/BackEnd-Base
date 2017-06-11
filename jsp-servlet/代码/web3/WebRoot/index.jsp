<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
    <h2>请求转发案例演示</h2>
    <hr>
    <%
    	//获取tip
    	Object tip = request.getAttribute("tip");
    	if(tip != null ) {
    	//tip被输出的时候会默认调用toString()方法
    %>    	
    	<span style="color:red;"><%=tip %></span>
    <%
    	}
    %>
    <form action="DemoServlet" method="post">
    	UserName:<input type="text" name="username"><br>
    	PassWord:<input type="password" name="password"><br>
    	<input type="submit" value="登录" />
    </form>
  </body>
</html>
