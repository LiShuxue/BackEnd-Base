<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload.jsp' starting page</title>
    
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
  	<%-- enctype非常重要，指定表单支持文件上传 --%>
    <form action="UploadServlet" method="post" enctype="multipart/form-data">
    	<p>文件描述:<input type="text" name="msg1"/></p>
    	<p>选择文件:<input type="file" name="file1"/></p>
    	<p>文件描述:<input type="text" name="msg2"/></p>
    	<p>选择文件:<input type="file" name="file2"/></p>
    	<p><input type="submit" value="点击上传"/></p>
    </form>
  </body>
</html>
