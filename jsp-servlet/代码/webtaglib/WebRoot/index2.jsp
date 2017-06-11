<%@page import="com.zyw.entity.Users"%>
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
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   		<h2>JSTL 标签库</h2>
   		<hr/>
   		<%-- test判断条件  var用一个变量来保存判断结果 --%>
   		<c:if test="${ 3 < 1 }" var="boo">
   			3 &lt; 1结果为真
   		</c:if>
   		<c:if test="${!boo }">
   			3 &lt; 1结果为假
   		</c:if>
   		<hr/>
   		
   		<%-- set 在指定范围中 声明一个变量  等同于  session.setAttribute()  --%>
   		<c:set var="myParam" value="hellowrold" scope="session"/>
   		在会话范围获取myParam:  ${sessionScope.myParam }
   		
   		<hr/>
   		<%-- c:forEach  循环数组 和 集合  
   			var 表示每次循环的操作 元素
   			items  集合 或  数组
   			begin  从索引n 开始
   			end 到 索引n结束
   			step 循环的间隔  默认是 1
   			varStatus 可以自己提供一个变量，名随意
   				属性index  获取正在循环的元素的索引
   				属性count  当前元素是第几个
   				属性first  当前元素是不是第一个
   				last  是不是最后一个
   		 --%>
   		 <%
   		 	String[] strs = {"a","b","c","d","e","f"};
   		 	//可以存到page范围
   		 %>
   		<c:forEach var="p" items="<%=strs %>" varStatus="s">
   			 ${s.index } ${s.count }  ${s.first } ${s.last } ${p } <br/>
   		</c:forEach>
   		
   		<hr/>
   		
   		<%-- 重定向 --%>
   		<%-- <c:redirect url=""/> --%>
   		<%-- 删除指定范围  数据  删除上面session存的 --%>
   		<c:remove var="myParam" scope="session"/>
   		
   		<%-- 多重判断  只有一个会执行 --%>
   		<c:choose>
   			<c:when test="${false }">
   				1
   			</c:when>
   			<c:when test="${true }">
   				2
   			</c:when>
   			<c:when test="${true }">
   				3
   			</c:when>
   		</c:choose>
  </body>
</html>












