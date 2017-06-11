<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dayIncome.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/style.css">


  </head>
  
  <body>
   <h2>当日进账</h2>
  	<hr size="2" color="#3399ff">
   <table class="report">
   	<tr>
   		<th>入住单号</th>
   		<th>客房编号</th>
   		<th>客房类型</th>
   		<th>入住人</th>
   		<th>会员编号</th>
   		<th>付款金额</th>
   		<th>进帐方式</th>
   		<th>进账时间</th>
   	</tr>
   	<c:forEach var="co" items="${requestScope.list }">
   	<tr>
   		<td>${co.ciId }</td>
   		<td>${co.roomId }</td>
   		<td>${co.roomType }</td>
   		<td>${co.customerName }</td>
   		<td>${co.mId }</td>
   		<td>${co.allCost }</td>
   		<td>
   			<c:choose>
   				<c:when test="${co.payType==1 }">现金</c:when>
   				<c:when test="${co.payType==2 }">支票</c:when>
   				<c:when test="${co.payType==3 }">信用卡</c:when>
   				<c:when test="${co.payType==4 }">代金券</c:when>
   				<c:when test="${co.payType==5 }">其他</c:when>
   			</c:choose>
   		</td>
   		<td>${co.leaveTime }</td>
   	</tr>
   	</c:forEach>
   </table>
  </body>
</html>
