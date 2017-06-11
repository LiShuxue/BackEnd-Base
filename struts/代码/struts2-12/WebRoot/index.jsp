<%@ page language="java" contentType="text/html; charset=utf-8"%>


<%-- 导入struts标签库 --%>
<%@ taglib prefix="s" uri="/struts-tags" %>



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
  	<!-- form默认post提交， 页面控件会采用默认的模板 -->
    <s:form action="ognlAction">
    	<s:textfield name="username" label="username"/>
    	<s:password name="password" label="password"/>
    	<s:submit/>
    </s:form>
  </body>
</html>
