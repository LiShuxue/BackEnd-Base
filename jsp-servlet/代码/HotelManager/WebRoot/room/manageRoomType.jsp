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
    
    <title>房间类型管理页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script>
		function doDelete(roomType,page){
			if(confirm("确定删除吗？")){
				location.href = "RoomTypeDeleteServlet?roomType="+roomType+"&page="+page;
			}
		}
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body>
    <h2>房间类型管理</h2>
    
    <hr  size="2" color="#3399ff"/>
    <div style="margin:0 auto; width:700px;">
    	<table width="700" rules="none">
    		<tr id="num1" style="font-weight:bold;">
    			<td>房间类型</td>
	    		<td>额定人数</td>
	    		<td>房间价格</td>
	    		<td>类型备注</td>
	    		<td>修改</td>
	    		<td>删除</td>
    		</tr>
    		<c:forEach var="rType" items="${requestScope.list }">
    		<tr id="num2">
    			<td>${rType.roomType }</td>
	    		<td>${rType.roomPeopleNum }</td>
	    		<td>${rType.typPrice }</td>
	    		<td>${rType.remark }</td>
	    		<td><a href="room/updateRoomType.jsp?roomType=${rType.roomType }&roomPeopleNum=${rType.roomPeopleNum }&typPrice=${rType.typPrice }&remark=${rType.remark }&page=${requestScope.page}">修改</a></td>
	    		<td><a href="javascript:doDelete('${rType.roomType }','${requestScope.page }')">删除</a></td>
    		</tr>
    		</c:forEach>
    	</table>
    </div>
    <hr/>
    <table align="center" width="700">
    	<tr>
    		<c:choose>
    			<c:when test="${requestScope.page<=1}">
    				<td>首页</td>
    				<td>上一页</td>
    			</c:when>
    			<c:when test="${requestScope.page>1}">
					 <td><a href="QueryRoomType?page=1">首页</a></td>
    				<td><a href="QueryRoomType?page=${requestScope.page-1 }">上一页</a></td>  			
    			</c:when>
    		</c:choose>
    		<c:choose>
    			<c:when test="${requestScope.page>=requestScope.totalPage}">
    				<td>下一页</td>
    				<td>尾页</td>
    			</c:when>
    			<c:when test="${requestScope.page<requestScope.totalPage}">
					 <td><a href="QueryRoomType?page=${requestScope.page+1 }">下一页</a></td>
    				<td><a href="QueryRoomType?page=${requestScope.totalPage }">尾页</a></td>  			
    			</c:when>
    		</c:choose>
    	</tr>
    </table>
  </body>
</html>
