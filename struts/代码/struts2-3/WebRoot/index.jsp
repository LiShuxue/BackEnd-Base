<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  	<h2>通过DomainModel的方法 接收请求参数</h2>
  	<hr/>
  	<%--
  		主要在Action中定义一个对象，表单控件名 通过对象.属性来指定
  		会将请求数据 通过 user对象来调用它属性的set方法 来保存
  	 --%>
    <form action="my" method="post">
    	UserName:<input type="text" name="user.username"/>
    	<br/><br/>
    	Password:<input type="password" name="user.password"/>
    	<br/><br/>
    	<input type="submit" value="Submit"/>
    </form>
  </body>
</html>









