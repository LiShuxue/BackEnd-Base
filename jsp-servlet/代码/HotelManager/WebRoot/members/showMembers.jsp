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
    
    <title>My JSP 'showMembers.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
		function doDelete(mid, page){
			if(confirm("确定删除吗？")){
				location.href = "DeleteMemberServlet?mid="+mid+"&page="+page;
			}
		}
	</script>
	<link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  
  <body>
    <h2>显示会员信息</h2>
    
    <hr size="2" color="#3399ff">
    <div style="margin:0 auto; width: 1000px;">
    	<table width="1000" border="0" cellpadding="0" cellspacing="0" rules="none">
	    	<tr style="font-weight:bold;" id="num1">
	    		<td>会员ID</td>
	    		<td>姓名</td>
	    		<td>性别</td>
	    		<td>联系方式</td>
	    		<td>地址</td>
	    		<td>邮箱</td>
	    		<td>积分</td>
	    		<td>会员类型</td>
	    		<td>最后一次预定时间</td>
	    		<td>最后一次入住时间</td>
	    		<td>备注</td>
	    		<td>修改</td>
	    		<td>删除</td>
	    	</tr>
	    	<c:forEach var="member" items="${requestScope.list }">
	    	
	    		<tr id="num2">
	    			<td>${member.mid }</td>
		    		<td>${member.mname }</td>
		    		<td>${member.msex }</td>
		    		<td>${member.mphone }</td>
		    		<td>${member.maddress }</td>
		    		<td>${member.memail }</td>
		    		<td>${member.mpoints }</td>
		    		<td>${member.mtype }</td>
		    		<td>${member.mbookTime }</td>
		    		<td>${member.mpresetTime }</td>
		    		<td>${member.remark }</td>
		    		<td><a href="members/updateMember.jsp?mid=${member.mid }&mname=${member.mname }&msex=${member.msex }&mphone=${member.mphone }&maddress=${member.maddress }&memail=${member.memail }&mpoints=${member.mpoints }&mtype=${member.mtype }&mbookTime=${member.mbookTime }&mpresetTime=${member.mpresetTime }&remark=${member.remark }">修改</a></td>
		    		<td><a href="javascript:doDelete('${member.mid }','${requestScope.page}')">删除</a></td>
	    		</tr>
	    	</c:forEach>
    	</table>
    </div>
    <hr/>
    <c:if test="${requestScope.totalPage != 0 }">
    	<table align="center" width="700">
    	<tr id="num1">
    		<c:choose>
    			<c:when test="${requestScope.page <= 1}">
    				<td align="center">首页</td>
    				<td align="center">上一页</td>
    			</c:when>
    			<c:when test="${requestScope.page > 1}">
    				<td align="center"><a href="QueryMembersServlet?page=1">首页</a></td>
    				<td align="center"><a href="QueryMembersServlet?page=${requestScope.page-1}">上一页</a></td>
    			</c:when>
    		</c:choose>
    		
    		
    		
    		
    		<c:choose>
    			<c:when test="${requestScope.page >= requestScope.totalPage}">
    				<td align="center">下一页</td>
    				<td align="center">尾页</td>
    			</c:when>
    			<c:when test="${requestScope.page < requestScope.totalPage}">
    				<td align="center"><a href="QueryMembersServlet?page=${requestScope.page+1}">下一页</a></td>
    				<td align="center"><a href="QueryMembersServlet?page=${requestScope.totalPage }">尾页</a></td>
    			</c:when>
    		</c:choose>
    	</tr>
    </table>
    </c:if>
  </body>
</html>
