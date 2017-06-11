<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">

  </head>
  
  <body>
    <div id="head"><img alt="" src="images/login1.jpg">
    <a href=""></a></div>
    <hr size="2" color="#3399ff">
    <div id="left">
    	<img alt="" src="images/admin.png">
    	<span id="name" style="color:999900;">nihao</span>
    	
    	<table>
    		<tr>
    			<ul>
    				
    				
	    			<li><h3>报表管理</h3>
	    				<ul class="nav">
	    					<li><a href=""><h4>预订客人报表</h4></a>
		    				<li><a href=""><h4>在住客人报表</h4>
		    				<li><a href=""><h4>离店客人报表</h4>
		    				<li><a href=""><h4>财务进账报表</h4></a>	
	    				</ul>
	    			
	    			
	    				
    			</ul>
    		
    	</table>
    </div>
    <div id="no"><img alt="" src="images/out.gif" align="right" ></div>
    <div id="line"></div>
    <div id="main">
    	<table width="100%" height="100%" border="1">
    	</table>
    </div>
    <div id="foot">foot</div>
  </body>
</html>
