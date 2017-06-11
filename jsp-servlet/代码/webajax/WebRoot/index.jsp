<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<script type="text/javascript" src="js/script.js"></script>
	
	<!-- 
	<script type="text/javascript">

	    var xmlHttp = null;		//定义请求对象
	    
	    function ajaxRequest(){
	    	
	    	/*
	    		1.创建请求对象XMLHttpRequest
	    		2.建立一个连接open()
	    		3.设置回调方法，处理响应  onreadystatechange
	    		4.发送一个请求  xmlHttp.send(null);
	    	*/
	    	
	    	
			//实例化该请求对象
			if(window.XMLHttpRequest){	//如果浏览器支持XMLHttpRequest
				xmlHttp = new XMLHttpRequest();
			}else{
				if(window.ActiveXObject){
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
				}
			}
		    var uname = document.getElementById("username").value;
		    //1.请求的方式  get/post
		    //2.请求的 url
		    //3.异步/同步 true异步   发送请求
			xmlHttp.open("POST","ValidateServlet?uname="+uname,true);		//建立一个新请求
			//在响应结束后，才会调用这个方法
			xmlHttp.onreadystatechange = callback;		//设置响应结束后调用的方法（回调方法）
			//发送一个请求
			xmlHttp.send(null);
	    }
		
		
		function callback(){
			if(xmlHttp.readyState == 4){		//如果请求已经成功发送了，并且响应也成功了
				if(xmlHttp.status == 200){
					// xmlHttp.responseText; 获取响应的内容
					document.getElementById("msg").innerHTML = xmlHttp.responseText;
				}else{
					//alert("Request Error," + xmlHttp.statusText);
				}
			}
		}
		
    </script>
    -->
    
    <script type="text/javascript">
    	function btnOnClick() {
    		var ajax = new myAjax();
    		var map = new Map();
    		map.put("uname", document.getElementById("username").value);
    		ajax.invoke("ValidateServlet", map, "POST", true, 
    				function(resText){
    					document.getElementById("msg").innerHTML = resText;
    				});
    	}
    </script>
  </head>
  
  <body>
     UserName:<input type="text" name="username" id="username"/>
     <span id="msg"></span>
     <br/>
     <input type="button" value="提交" onclick="btnOnClick()"/>
  </body>
</html>










