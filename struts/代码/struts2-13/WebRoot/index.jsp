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
  	<h2>Struts2 自动的类型转换</h2>
  	<hr/>
    <form action="convert" method="post">
    	整数：<input name="intnum"/><br/>
    	小数：<input name="doublenum"/><br/>
    	布尔：<input name="bool"/><br/>
    	字符：<input name="ch"/><br/>
    	日期：<input name="da"/><br/>
    	数组1：<input type="checkbox" name="check" value="0"/>0
    		<input type="checkbox" name="check" value="1"/>1
    		<input type="checkbox" name="check" value="2"/>2
    		<input type="checkbox" name="check" value="3"/>3
    		<br/>
    	数组2(输入a,b,c):<input name="arr"/><br/>
    	集合:<input name="list[0]"/>
    		<input name="list[1]"/>
    		<input name="list[2]"/><br/>
    	Map:<input name="map.k1"/>
    		<input name="map.k2"/>
    		<input name="map.k3"/>
    	
    	<p>
    		<input type="submit" value="提交Action，自动转换"/>
    	</p>
    </form>
  </body>
</html>











