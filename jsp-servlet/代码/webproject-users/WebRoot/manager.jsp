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
    
    <title>My JSP 'manager.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript">
		function doDelete(id,page){
			if(confirm("确定删除吗？")){
				location.href = "DeleteServlet?id="+id+"&page="+page;
			}
		}
	</script>
  </head>
  
  <body>
    <h2>用户管理</h2>
    <a href="index.jsp">返回</a>
    <hr/>
    <div style="margin:0 auto; width: 700px;">
    	<table width="700">
	    	<tr style="font-weight:bold;">
	    		<td>用户名</td>
	    		<td>密码</td>
	    		<td>生日</td>
	    		<td>电话</td>
	    		<td>修改</td>
	    		<td>删除</td>
	    	</tr>
	    	
	    	<c:forEach var="user" items="${requestScope.list }">
	    		<tr>
	    			<td>${user.username }</td>
		    		<td>${user.password }</td>
		    		<td>${user.birthday }</td>
		    		<td>${user.phone }</td>
		    		<td><a href="update.jsp?username=${user.username }&password=${user.password }&birthday=${user.birthday }&phone=${user.phone}&page=${requestScope.page}">修改</a></td>
		    		<td><a href="javascript:doDelete('${user.id}','${requestScope.page}')">删除</a></td>
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
    				<td align="center"><a href="QueryUsers?page=1">首页</a></td>
    				<td align="center"><a href="QueryUsers?page=${requestScope.page-1}">上一页</a></td>
    			</c:when>
    		</c:choose>
    		
    		
    		
    		
    		<c:choose>
    			<c:when test="${requestScope.page >= requestScope.totalPage}">
    				<td align="center">下一页</td>
    				<td align="center">尾页</td>
    			</c:when>
    			<c:when test="${requestScope.page < requestScope.totalPage}">
    				<td align="center"><a href="QueryUsers?page=${requestScope.page+1}">下一页</a></td>
    				<td align="center"><a href="QueryUsers?page=${requestScope.totalPage }">尾页</a></td>
    			</c:when>
    		</c:choose>
    	</tr>
    </table>
    
    
  </body>
</html>
