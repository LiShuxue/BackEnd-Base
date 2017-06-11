<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>预定信息界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body>
    <h2>预定信息</h2>
  
    <hr  size="2" color="#3399ff"/>
    <div style="margin:0 auto; width:700px;">
    	<table width="700" rules="none" >
    		<tr id="num1" style="font-weight:bold;">
    			<td>预定单号</td>
    			<td>客房编号</td>
	    		<td>客房类型</td>
	    		<td>预定人</td>
	    		<td>标准价格</td>
	    		<td>备注</td>
	    		<td>查看、转入住</td>
    		</tr>
    		<c:forEach var="bookInfo" items="${requestScope.list }">
    		<tr id="num2">
    			<td>${bookInfo.bookId }</td>
    			<td>${bookInfo.roomid }</td>
    			<td>${bookInfo.roomType }</td>
	    		<td>${bookInfo.customerName }</td>
	    		<td>${bookInfo.roomPrice }</td>
	    		<td>${bookInfo.remark }</td>
	    		<td><a href="room/bookToCi.jsp?bookId=${bookInfo.bookId }&roomId=${bookInfo.roomid }&roomType=${bookInfo.roomType }&roomPrice=${bookInfo.roomPrice }&discountPrice=${bookInfo.discountPrice }&pledge=${bookInfo.pledge }&customerName=${bookInfo.customerName }&cardType=${bookInfo.cardType }&cardId=${bookInfo.cardId }&customerPhone=${bookInfo.customerPhone }&arriveTime=${bookInfo.arriveTime }&leaveTime=${bookInfo.leaveTime }&checkinNum=${bookInfo.checkinNum }&mId=${bookInfo.mId }&mPrice=${bookInfo.mPrice }&remark=${bookInfo.remark }&page=${requestScope.page}">查看、转入住</a></td>
	    		</tr>
    		</c:forEach>
    	</table>
    </div>
    <hr/>
    <table align="center" width="700">
    	<tr id="num1">
    		<c:choose>
    			<c:when test="${requestScope.page<=1}">
    				<td>首页</td>
    				<td>上一页</td>
    			</c:when>
    			<c:when test="${requestScope.page>1}">
					 <td><a href="QueryORoom?page=1">首页</a></td>
    				<td><a href="QueryORoom?page=${requestScope.page-1 }">上一页</a></td>  			
    			</c:when>
    		</c:choose>
    		<c:choose>
    			<c:when test="${requestScope.page>=requestScope.totalPage}">
    				<td>下一页</td>
    				<td>尾页</td>
    			</c:when>
    			<c:when test="${requestScope.page<requestScope.totalPage}">
					<td><a href="QueryORoom?page=${requestScope.page+1 }">下一页</a></td>
					<td><a href="QueryORoom?page=${requestScope.totalPage }">尾页</a></td>  			
    			</c:when>
    		</c:choose>
    	</tr>
    </table>
    <hr/>
  </body>
</html>
