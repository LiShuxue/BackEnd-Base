<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show2.jsp' starting page</title>
    
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
    <%
    	//方法1  java获取
    	//得到请求级别 共享的数据
    	String val = request.getAttribute("reqKey").toString();
    %>
    <!-- 
    	方法2
    EL 来获取请求级别数据  	
    -->
    EL request数据: ${requestScope.reqKey }
    <!-- 方法3 
    	会在所有级别（范围）中 寻找key是reqKey的参数
    	如果 pageContext中也有  reqKey  怎么办？
    	先找pageContext --》 request  --》 session  --》 application
    	-->
    <%	pageContext.setAttribute("reqKey", "123456"); %>
    <br/> EL 获取数据： ${reqKey}
  </body>
</html>
