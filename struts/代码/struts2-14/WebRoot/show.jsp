<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  	<!--  如果show显示了这个时间，说明在Action中属性mytime已经成功的保存了来自index的参数 
  		struts 提供了 String  --  java.sql.Date 的转换
  		
  		显示的yyyy-MM-dd 格式不满足我的要求，我要显示 yyyy年MM月dd日
  		自己创建一个转换器
  		
  		注意： 只有使用struts标签库<s:property> 才会触发 date 转 string 行为
  	-->
    <s:property value="mytime"/>
  </body>
</html>












