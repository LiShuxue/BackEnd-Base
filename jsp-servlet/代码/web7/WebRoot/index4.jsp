<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index4.jsp' starting page</title>
    
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
    	<%--
    		application 应用级别
    		当服务器启动，就可以向application范围来存储数据，该范围的数据，服务器 和所有的用户共享。
    		服务器关闭，这些数据才会消失，也可以通过函数删除这些数据。
    		
    		每一个客户端都会看到累加的结果。所有用户共享了 count
    	 --%>
    	 
    	 <%
    	 	Object count = application.getAttribute("count");
    	 	if(count == null){
    	 		count = 0;
    	 	}
    	 	count = ((Integer)count) + 1;
    	 	application.setAttribute("count", count);
    	 %>
    	 当前访问的人数是: <%=count %>
  </body>
</html>















