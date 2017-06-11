<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showItems.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
 	<script type="text/javascript">
		function doDelete(itemCode, page){
			if(confirm("确定删除吗？")){
				location.href = "DeleteItemServlet?itemCode="+itemCode+"&page="+page;
			}
		}
	</script>
	
  </head>
  
  <body>
    <h2>显示商品信息</h2>
    <a href="#">返回</a>
    <hr/>
    <div style="margin:0 auto; width: 700px;">
    	<table width="700" border="1" cellpadding="0" cellspacing="0">
	    	<tr style="font-weight:bold;">
	    		<td>商品编号</td>
	    		<td>商品名称</td>
	    		<td>所属类别编号</td>
	    		<td>价格</td>
	    		<td>单位</td>
	    		<td>备注</td>
	    		<td>修改</td>
	    		<td>删除</td>
	    	</tr>
	    	<c:forEach var="item" items="${requestScope.list }">
	    		<tr>
	    			<td>${item.itemCode }</td>
		    		<td>${item.itemName }</td>
		    		<td>${item.typeCode }</td>
		    		<td>${item.itemPrice }</td>
		    		<td>${item.itemUnit }</td>
		    		<td>${item.remark }</td>
		    		<td><a href="items/updateItem.jsp?itemCode=${item.itemCode }&itemName=${item.itemName }&typeCode=${item.typeCode }&itemPrice=${item.itemPrice}&itemUnit=${item.itemUnit}&remark=${item.remark }">修改</a></td>
		    		<td><a href="javascript:doDelete('${item.itemCode}','${requestScope.page}')">删除</a></td>
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
    	</tr>
    </table> 
  </body>
</html>
