<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'scheduleReport.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/calendar.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
	

  </head>
  
  <body>
  	<h2>定时间段预定客人报表</h2>
  	<hr size="2" color="#3399ff">
  <form action="bookReport" method="post">
  <table>
  	<tr>
  		<td>查询报表开始日期：
  		<input id="startDate" name="startDate" onClick="SelectDate(this,'yyyy-MM-dd')" readonly="readonly"/></td>
  	</tr>
  	<tr>
  		<td>查询报表结束日期：
  		<input id="endDate" name="endDate" onClick="SelectDate(this,'yyyy-MM-dd')" readonly="readonly"/></td>
  	</tr>
  	<tr>
  		<td><input type="submit" value="生成报表"></td>
  	</tr>
  	
  </table>
	</form>
<iframe name="bossReport">

</iframe>
   
  </body>
</html>
