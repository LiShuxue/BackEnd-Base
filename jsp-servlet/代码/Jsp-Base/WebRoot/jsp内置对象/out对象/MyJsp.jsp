<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
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
    <h1>out内置对象</h1>
    <%
    	out.println("out打印<br>");
    	out.println("out打印<br>");
    	out.println("out打印<br>");
    	out.flush();//将上面的一次性打印出来
    	//out.clear();//清除缓冲区的内容，在flush之后调用会抛出异常
    	out.clearBuffer();//不会抛出异常
    	out.println("out打印<br>");
    	out.println("out打印<br>");
    %>
    
      	缓冲区大小：<%=out.getBufferSize() %><br>             
      	缓冲区剩余大小：<%=out.getRemaining() %><br>
     	是否自动清空缓冲区：<%=out.isAutoFlush() %><br>
   
  </body>
</html>
