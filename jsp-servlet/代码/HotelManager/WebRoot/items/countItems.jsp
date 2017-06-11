<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>统计商品价格页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function count(){
			var a = document.getElementsByName("price");
			var b = document.getElementsByName("count");
			var sum =0;
			for(var i=0;i<a.length;i++){
				sum = sum + parseInt(a[i].value)*parseInt(b[i].value);
			}
			document.getElementById("sum").value = sum;
		}
	</script>
<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body>
    <h2>统计商品的消费信息</h2>
   
    <hr size="2" color="#3399ff"/>

    <div style="margin:0 auto; width: 700px;">
    	<table width="700" border="0" cellpadding="0" cellspacing="0" rules="none">
	    	<tr style="font-weight:bold;">
	    		<td>商品编号</td>
	    		<td>商品名称</td>
	    		<td>价格</td>
	    		<td>单位</td>
	    		<td>消费数量</td>
	    	</tr>
	    	<c:forEach var="item" items="${requestScope.list }">
	    		<tr id="num2">
	    			<td>${item.itemCode }</td>
		    		<td>${item.itemName }</td>
		    		<td><input name='price' value="${item.itemPrice }" readonly="readonly"/></td>
		    		<td>${item.itemUnit }</td>
		    		<td><input name='count' value="0"/></td>
	    		</tr>
	    	</c:forEach>
    	</table>
    </div>
    <hr/>
    <table align="center" width="700">
    	<tr id="num1">
    		<c:choose>
    			<c:when test="${requestScope.page <= 1}">
    				<td align="center">首页</td>
    				<td align="center">上一页</td>
    			</c:when>
    			<c:when test="${requestScope.page > 1}">
    				<td align="center"><a href="QueryItemsServlet?page=1">首页</a></td>
    				<td align="center"><a href="QueryItemsServlet?page=${requestScope.page-1}">上一页</a></td>
    			</c:when>
    		</c:choose>
 		
    		<c:choose>
    			<c:when test="${requestScope.page >= requestScope.totalPage}">
    				<td align="center">下一页</td>
    				<td align="center">尾页</td>
    			</c:when>
    			<c:when test="${requestScope.page < requestScope.totalPage}">
    				<td align="center"><a href="QueryItemsServlet?page=${requestScope.page+1}">下一页</a></td>
    				<td align="center"><a href="QueryItemsServlet?page=${requestScope.totalPage }">尾页</a></td>
    			</c:when>
    		</c:choose>
    		
    		<td>
    		<form action="GoToCoServlet" method="post">
    			 <input type="hidden" name="ciId" value="${param.ciId }">
			     <input type="hidden" name="roomId" value="${param.roomId }">
			     <input type="hidden" name="roomType" value="${param.roomType }">
			     <input type="hidden" name="roomPrice" value="${param.roomPrice }">
			     <input type="hidden" name="discountPrice" value="${param.discountPrice }">
			     <input type="hidden" name="pledge" value="${param.pledge }">
			     <input type="hidden" name="arriveTime" value="${param.arriveTime }">
			     <input type="hidden" name="leaveTime" value="${param.leaveTime }">
			     <input type="hidden" name="mId" value="${param.mId }">
			     <input type="hidden" name="mPrice" value="${param.mPrice }">
			     <input type="hidden" name="remark" value="${param.remark }">
			     <input type="hidden" name="page" value="${param.page }">
			     <input type="hidden" id="sum" name="sum" value="">
			     <input type="submit" value="结账" onmouseover="count()"/>
    		</form>
    		</td>
    	</tr>
    </table>
  </body>
</html>
