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
    
    <title>楼层信息管理页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script>
		function doDelete(floor,page){
			if(confirm("确定删除吗？")){
				location.href = "FloorDeleteServlet?floor="+floor+"&page="+page;
			}
		}
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">

  </head>
  
  <body>
    <h2>楼层管理</h2>
    <hr  size="2" color="#3399ff"/>
   
    <div style="margin:0 auto; width:700px;">
    	<table width="700" rules="none">
    		<tr id="num1" style="font-weight:bold;">
    			<td>楼层</td>
	    		<td>楼层价格</td>
	    		<td>备注</td>
	    		<td>修改</td>
	    		<td>删除</td>
    		</tr>
    		<c:forEach var="floors" items="${requestScope.list }">
    		<tr id="num2">
    			<td>${floors.floor }</td>
	    		<td>${floors.floorPrice }</td>
	    		<td>${floors.remark }</td>
	    		<td><a href="room/updateFloor.jsp?floor=${floors.floor }&floorPrice=${floors.floorPrice }&remark=${floors.remark }&page=${requestScope.page}">修改</a></td>
	    		<td><a href="javascript:doDelete('${floors.floor }','${requestScope.page }')">删除</a></td>
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
					 <td><a href="QueryFloor?page=1">首页</a></td>
    				<td><a href="QueryFloor?page=${requestScope.page-1 }">上一页</a></td>  			
    			</c:when>
    		</c:choose>
    		<c:choose>
    			<c:when test="${requestScope.page>=requestScope.totalPage}">
    				<td>下一页</td>
    				<td>尾页</td>
    			</c:when>
    			<c:when test="${requestScope.page<requestScope.totalPage}">
					 <td><a href="QueryFloor?page=${requestScope.page+1 }">下一页</a></td>
    				<td><a href="QueryFloor?page=${requestScope.totalPage }">尾页</a></td>  			
    			</c:when>
    		</c:choose>
    	</tr>
    </table>
  </body>
</html>
