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
    
    <title>房间管理页面</title>
    
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
		function doDelete(roomId,page){
			if(confirm("确定删除吗？")){
				location.href = "RoomDeleteServlet?roomId="+roomId+"&page="+page;
			}
		}
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
    <h2>房间管理</h2>
   
     <hr  size="2" color="#3399ff"/>
    <div style="margin:0 auto; width:700px;">
    	<table width="700" rules="none">
    		<tr id="num1" style="font-weight:bold;">
    			<td>房间编号</td>
    			<td>房间类型</td>
	    		<td>房间状态</td>
	    		<td>楼层</td>
	    		<td>标准价格</td>
	    		<td>备注</td>
	    		<td>修改</td>
	    		<td>删除</td>
    		</tr>
    		<c:forEach var="rooms" items="${requestScope.list }">
    		<tr id="num2">
    			<td>${rooms.roomId }</td>
    			<td>${rooms.roomType }</td>
	    		<c:choose>
	    			<c:when test="${rooms.status==0 }">
	    			<td>空闲</td>
	    			</c:when>
	    			<c:when test="${rooms.status==1 }">
	    			<td>预定中</td>
	    			</c:when>
	    			<c:when test="${rooms.status==2 }">
	    			<td>入住中</td>
	    			</c:when>
    			</c:choose>
	    		<td>${rooms.floor }</td>
	    		<td>${rooms.roomPrice }</td>
	    		<td>${rooms.remark }</td>
	    		<c:choose>
	    			<c:when test="${rooms.status==0 }">
	    			<td><a href="room/updateRoom.jsp?roomId=${rooms.roomId }&roomType=${rooms.roomType }&status=${rooms.status }&floor=${rooms.floor }&roomPrice=${rooms.roomPrice }&discountPrice=${rooms.discountPrice }&mprice=${rooms.mprice }&vipPrice=${rooms.vipPrice }&remark=${rooms.remark }&page=${requestScope.page}">修改</a></td>
	    			<td><a href="javascript:doDelete('${rooms.roomId }','${requestScope.page }')">删除</a></td>
	    			</c:when>
	    			<c:when test="${rooms.status!=0 }">
	    			<td>修改</td>
	    			<td>删除</td>
	    			</c:when>
    			</c:choose>
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
					 <td><a href="QueryRoom?page=1">首页</a></td>
    				<td><a href="QueryRoom?page=${requestScope.page-1 }">上一页</a></td>  			
    			</c:when>
    		</c:choose>
    		<c:choose>
    			<c:when test="${requestScope.page>=requestScope.totalPage}">
    				<td>下一页</td>
    				<td>尾页</td>
    			</c:when>
    			<c:when test="${requestScope.page<requestScope.totalPage}">
					 <td><a href="QueryRoom?page=${requestScope.page+1 }">下一页</a></td>
    				<td><a href="QueryRoom?page=${requestScope.totalPage }">尾页</a></td>  			
    			</c:when>
    		</c:choose>
    	</tr>
    </table>
    <hr/>
    <form action="ShowSelectRoomServlet" method="post">
    <table align="center" width="700">
    	<tr>
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
