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
    
    <title>预定、入住界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/script.js"></script>
	<script>
		function showRoomType(){
			var map = new Map();
			var ajax = new MyAjax();
			var ajax1 = new MyAjax();
			ajax.invoke("showRoomTypeServlet", map, "POST", true, function(responseText){
				$("roomTypes").innerHTML = responseText;
			});
			ajax1.invoke("ShowFloorServlet", map, "POST", true, function(responseText){
				$("floors").innerHTML = responseText;
			});
		}

	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body onload="showRoomType()">
    <h2>预定、入住</h2>
    
    <hr  size="2" color="#3399ff"/>
    <div style="margin:0 auto; width:700px;">
    	<table width="700">
    		<tr style="font-weight:bold;" id="num1">
    			<td>房间编号</td>
    			<td>房间类型</td>
	    		<td>楼层</td>
	    		<td>标准价格</td>
	    		<td>备注</td>
	    		<td>预定</td>
	    		<td>入住</td>
    		</tr>
    		<c:forEach var="rooms" items="${requestScope.list }">
    		<tr id="num2">
    			<td>${rooms.roomId }</td>
    			<td>${rooms.roomType }</td>
	    		<td>${rooms.floor }</td>
	    		<td>${rooms.roomPrice }</td>
	    		<td>${rooms.remark }</td>
	    		<td><a href="room/book.jsp?roomId=${rooms.roomId }&roomType=${rooms.roomType }&status=${rooms.status }&floor=${rooms.floor }&roomPrice=${rooms.roomPrice }&discountPrice=${rooms.discountPrice }&mprice=${rooms.mprice }&vipPrice=${rooms.vipPrice }&remark=${rooms.remark }&page=${requestScope.page}">预定</a></td>
	    		<td><a href="room/ci.jsp?roomId=${rooms.roomId }&roomType=${rooms.roomType }&status=${rooms.status }&floor=${rooms.floor }&roomPrice=${rooms.roomPrice }&discountPrice=${rooms.discountPrice }&mprice=${rooms.mprice }&vipPrice=${rooms.vipPrice }&remark=${rooms.remark }&page=${requestScope.page}">入住</a></td>
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
					 <td><a href="QueryZRoom?page=1">首页</a></td>
    				<td><a href="QueryZRoom?page=${requestScope.page-1 }">上一页</a></td>  			
    			</c:when>
    		</c:choose>
    		<c:choose>
    			<c:when test="${requestScope.page>=requestScope.totalPage}">
    				<td>下一页</td>
    				<td>尾页</td>
    			</c:when>
    			<c:when test="${requestScope.page<requestScope.totalPage}">
					<td><a href="QueryZRoom?page=${requestScope.page+1 }">下一页</a></td>
					<td><a href="QueryZRoom?page=${requestScope.totalPage }">尾页</a></td>  			
    			</c:when>
    		</c:choose>
    	</tr>
    </table>
    <hr/>
    <form action="ShowSelectRoomServlet" method="post">
    <table align="center" width="700" rules="none">
    	<tr id="num1">
    		<td align="right">客房类型:</td><td id="roomTypes"></td>
			<td align="right">楼层:</td><td id="floors"></td>
			<td align="right">价格:</td>
			<td>
			<select name="price">
				<option value="0">
					1000以下
				</option>
				<option value="1">
					1000-5000
				</option>
				<option value="2">
					5000以上
				</option>
			</select>
			</td>
			<td><input type="submit" value="查询"/></td>
    	</tr>
    </table>
    </form>
  </body>
</html>
