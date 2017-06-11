<%@page import="com.zyw.bean.Users"%>
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
    <h2>EL 表达式</h2>
    <%
    	//必须向指定范围中保存一个对象，才能够通过el来访问该对象。
    	//通常情况，你会从 Servlet 转发  （转发数据   通过setAttribute）  默认就是在request范围
    	// 请求参数（表单、url）   必须通过 ${param.XXX} 来获取
    	// 转发数据   什么类型都可以。
    	// 请求参数  只能是字符串
    	Users user = new Users(1,"zhangsan",22);
    	pageContext.setAttribute("user", user);
    %>
    ${user }
  </body>
</html>






