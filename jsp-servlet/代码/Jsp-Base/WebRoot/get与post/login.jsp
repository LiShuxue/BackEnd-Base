<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
    <h1>用户登陆</h1>
    <hr>
    <!-- get方式：以明文的方式通过URL提交数据，数据在URL中可以看到，提交的数据最多不超过2KB。安全性较低但效率比post方式高
    			适合提交数据量不大，安全性不高的数据，如：搜索，查询功能
    			
    	 post方式：将用户提交的信息封装在HTML HEADER内。
    	 		适合提交数据量大，安全性高的用户信息，如：注册，修改，上传等功能
     -->
    <form action="get与post/dologin.jsp" name="loginForm" method="post">
    	<table>
    		<tr>
    			<td>用户名：</td>
    			<td><input type="text" name="username"/></td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td><input type="password" name="password"/></td>
    		</tr>
    		<tr>
    			<td colspan="2"><input type="submit" value="登录"/></td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
