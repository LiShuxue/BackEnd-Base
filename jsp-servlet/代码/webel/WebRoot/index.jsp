
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%-- 导入自己的标签库 my自定义的名字--%>
<%@ taglib prefix="my" uri="http://www.my-tag.com/mytag" %>
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
  	 
  	 	<%-- 参数 单引，字符串 --%>
	  	调用EL函数1:${my:formatMyName('lsx') }
	  <br/>
	  	调用EL函数2:${my:add(10,20) } 
  </body>
</html>









