<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dayLeave.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>当日离店
    <table>
    	 <tr>
    		<td>入住单号</td>
    		<td>客房编号</td>
    		<td>客房类型</td>
    		<td>入住人</td>
    		<td>会员编号</td>
    		<td>抵店时间</td>
    		<td>离店时间</td>
    		<td>联系电话</td>
    	</tr>
    	<tr>
	   		<td></td>
	   		<td></td>
	   		<td></td>
	   		<td></td>
	   		<td></td>
	   		<td></td>
	   		<td></td>
	   		<td></td>
	   		<td></td>
   		</tr>
    </table>
  </body>
</html>
