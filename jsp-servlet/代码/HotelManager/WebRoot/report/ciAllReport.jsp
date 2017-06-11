<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ciAllReport.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/style.css">
	

  </head>
  
  <body>
   <table class="report">
    	<tr>
    		<th>入住单号</th>
    		<th>客房编号</th>
    		<th>客房类型</th>
    		<th>预定人姓名</th>
    		<th>会员编号</th>
    		<th>抵店时间</th>
    		<th>离店时间</th>
    		<th>联系电话</th>
    	</tr>
    	<c:forEach var="ci" items="${requestScope.list }">
    		
    	<tr>
    		<td>${ci.ciId}</td>
    		<td>${ci.roomId}</td>
    		<td>${ci.roomType }</td>
    		<td>${ci.customerName }</td>
    		<td>${ci.mid }</td>
    		<td>${ci.arriveTime }</td>
    		<td>${ci.leaveTime }</td>
    		<td>${ci.customerPhone }</td>
    	</tr>
    	</c:forEach>
    </table>
  </body>
</html>
