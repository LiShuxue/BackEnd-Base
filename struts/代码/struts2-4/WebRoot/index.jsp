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
  	<h2>通过ModelDriven的方法 接收请求参数</h2>
  	<hr/>
  	<%--
  		Action 必须要实现 ModelDriven<T> 接口 ，实例化一个实体 属性
  		页面上控件名 不用对象.属性
  		控件名，必须要和实体中的 属性名 对应，相同
  	 --%>
    <form action="my" method="post">
    	UserName:<input type="text" name="username"/>
    	<br/><br/>
    	Password:<input type="password" name="password"/>
    	<br/><br/>
    	<input type="submit" value="Submit"/>
    </form>
  </body>
</html>









