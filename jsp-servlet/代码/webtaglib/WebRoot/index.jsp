<%@page import="com.zyw.entity.Users"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%-- 导入自己的标签库 my自定义的名字--%>
<%@ taglib prefix="my" uri="http://www.my-tag.com/mytag" %>
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
  	 <%-- 
  	 <% 
  		Users user = new Users();
  		user.setName("zhangsan");
  		user.setAge(22);
  		user.setAddress("沈阳"); 
  		//Users user = null;
  		pageContext.setAttribute("user", user);
  	%>
    
	
	<my:showUser user="${user }"/> 
	--%>

	
	
	
	<hr/>
	
	<%
		List<Users> list = new ArrayList<Users>();
		list.add(new Users("zhangsan",20,"beijing"));
		list.add(new Users("lisi",21,"shenyang"));
		list.add(new Users("wangwu",22,"shanghai"));
		pageContext.setAttribute("list", list);
	 %>
	 
	  <table width='500px' border='1' align='center'>
	    <tr>
	        <td width='20%'>Name</td>
	        <td width='20%'>Age</td>
	        <td>Address</td>
	    </tr>
	    <!-- 自定义循环标签 根据元素的数量来循环 -->
	    <my:repeater var="u" items="${list}">
	    	<tr>
	    		<td>${u.name}</td>
	    		<td>${u.age}</td>
	    		<td>${u.address}</td>
	    	</tr>
	    </my:repeater>
	  </table> 
	  

	 <%--  
	 	<hr/>
	  		调用EL函数1:${my:formatMyName('zyw') }
	  	<br/>
	  		调用EL函数2:${my:add(10,20) } 
	  --%>
  </body>
</html>
