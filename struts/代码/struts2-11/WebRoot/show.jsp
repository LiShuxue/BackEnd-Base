<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
  	<!-- 判断user对象是否为空，如果为空就跳到登录页面 -->
  	<s:if test="#session.user == null">
  		<jsp:forward page="index.jsp"/>
  	</s:if>
  	<!-- struts2中的标签库中的迭代标签，用来循环 -->
    <s:iterator var="item" value="#request.list">
    	<!-- 直接写这个标签就可以取值并显示出来 -->
    	<s:property/>
    </s:iterator>
  </body>
</html>
