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
    
    <title>My JSP 'countItems.jsp' starting page</title>
    
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
			if(confirm("确定结账吗？")){
				location.href="index.jsp?sum=" + sum;
			}
		}
	</script>

  </head>
  
  <body>
    <h2>统计商品的消费信息</h2>
    <a href="#">返回</a>
    <hr/>
    <div style="margin:0 auto; width: 700px;">
    	<table width="700" border="1" cellpadding="0" cellspacing="0">
	    	<tr style="font-weight:bold;">
	    		<td>商品编号</td>
	    		<td>商品名称</td>
	    		<td>价格</td>
	    		<td>单位</td>
	    		<td>消费数量</td>
	    	</tr>
	    	<c:forEach var="item" items="${requestScope.list }">
	    		<tr>
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
    	<tr>
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
    		
    		<td><input type="button" value="结账" onclick="count()"/></td>
    	</tr>
    </table> 
  </body>
</html>
