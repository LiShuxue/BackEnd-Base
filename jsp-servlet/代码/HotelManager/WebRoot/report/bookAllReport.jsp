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
    
    <title>My JSP 'bookAllReport.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/style.css">
	

  </head>
  
  <body>
  	<h2>预定所有客人报表</h2>
  	<hr size="2" color="#3399ff">
    <table class="report">
    	<tr>
    		<th>预定单号</th>
    		<th>客房编号</th>
    		<th>客房类型</th>
    		<th>预定人姓名</th>
    		<th>会员编号</th>
    		<th>抵店时间</th>
    		<th>离店时间</th>
    		<th>联系电话</th>
    	</tr>
    	<c:forEach var="bookInfo" items="${requestScope.list }">
    	<tr>
    		<td>${bookInfo.bookId}</td>
    		<td>${bookInfo.roomid}</td>
    		<td>${bookInfo.roomType }</td>
    		<td>${bookInfo.customerName }</td>
    		<td>${bookInfo.mId }</td>
    		<td>${bookInfo.arriveTime }</td>
    		<td>${bookInfo.leaveTime }</td>
    		<td>${bookInfo.customerPhone }</td>
    	</tr>
    	</c:forEach>
    </table>
  </body>
</html>
