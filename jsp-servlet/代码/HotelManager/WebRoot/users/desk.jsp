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
    	<span id="name" style="color:ffcc33;"></span>
    	
    	<table>
    		<tr>
    			<ul>
    				<li><h3>消费管理 </h3>
    					<ul class="nav">
    						<li class="navtop"><a href=""><h4>附加消费入账</h4></a>
    					</ul>
	    			
	    			
	    			<li><h3>房客管理</h3>
	    				<ul class="nav">
	    					<li class="navtop"><a href=""><h4>客人预订管理</h4>
	    						<ul>
	    							<li><a href=""><h5>客房查询</h5>
	    							<li><a href=""><h5>修改预订信息</h5>
	    							<li><a href=""><h5>取消预订信息</h5>
	    							<li><a href=""><h5>查询预订信息</h5>
	    							<li><a href=""><h5>手工转入住</h5>
	    						</ul>
		    				<li class="navtop"><a href=""><h4>入住登记管理</h4>
		    				<li class="navtop"><a href=""><h4>预订转入住管理</h4>
		    					<ul>
		    						<li><a href=""><h5>客房预订信息查询</h5>
		    					</ul>
		    				<li class="navtop"><a href=""><h4>转房管理</h4>
		    					<ul>
		    						<li><a href=""><h5>登记信息查询</h5>
		    					</ul>
		    				<li class="navtop"><a href=""><h4>结帐管理</h4></a>
		    
	    				</ul>
	    			
	    			
    			</ul>
    		
    	</table>
    </div>
    <div id="no"><img alt="" src="images/out.gif" align="right" ></div>
    <div id="line"></div>
    <div id="main">main</div>
    <div id="foot">foot</div>
  </body>
</html>
