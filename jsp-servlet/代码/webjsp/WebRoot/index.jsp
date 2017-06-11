<%@ page language="java" contentType="text/html; charset=utf-8"%>
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
    <h2>动作 useBean</h2>
    <%-- 创建一个Users对象   并且对属性赋值
    	jsp:useBean 的属性 scope 默认 page			调用Users 无参构造 创建一个对象
    	jsp:setProperty的属性：					调用属性们的 setXXX 方法 来对属性赋值
    		property  指定对象的属性名
    		name 	指定操作的对象
    		value   属性值
    	jsp:getProperty 的属性：					调用属性的 getXXX 来获取数据
    		property  属性名
    		name	对象名
    --%>
    <jsp:useBean id="user" class="com.zyw.bean.Users"/>
    <jsp:setProperty property="id" name="user" value="1"/>
    <jsp:setProperty property="name" name="user" value="zhangsan"/>
    <jsp:setProperty property="age" name="user" value="20"/>
    
    <%-- 显示user对象的属性值    访问对象的属性--%>
    id是:<jsp:getProperty property="id" name="user"/><br/>
    name是:<jsp:getProperty property="name" name="user"/><br/>
    age是:<jsp:getProperty property="age" name="user"/>
  </body>
</html>












