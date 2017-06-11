<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'book.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript" src="js/calendar.js"></script>
	<script type="text/javascript">
		function showMessage(){
			var map = new Map();
			var ajax = new MyAjax();
			ajax.invoke("ShowBookIdServlet", map, "POST", true, function(responseText){
				$("bookId").value = responseText;
			});
		}
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body onload="showMessage()">
    <h2>预定页面</h2>
    <hr size="2" color="#3399ff">
    <c:choose>
    	<c:when test="${param.result==1 }">
    		<font color="red">预定成功</font>
    	</c:when>
    	<c:when test="${param.result==0 }">
    		<font color="red">预定失败!!</font>
    	</c:when>
    </c:choose>
    <form action="AddBookServlet" method="post" >
    <table border="0" width="350px" rules="none" height="600px">
    	<tr id="num1">
    		<td width="27%">预定单号:</td>
    		<td>
    			<input name="bookId" id="bookId" size="16" value="" readonly="readonly"/>
    		</td>
    	</tr>
    	<tr id="num2">
    		<td>客房编号:</td>
    		<td>
    			<input name="roomId" size="16" value="${param.roomId }" readonly="readonly"/>
    		</td>
    	</tr>
    	<tr>
    		<td>客房类型:</td>
    		<td>
    			<input name="roomType" size="16" value="${param.roomType }" readonly="readonly"/>
    		</td>
    	</tr>
    	<tr  id="num1">
    		<td>标准价格:</td>
    		<td><input name="roomPrice" size="16" value="${param.roomPrice }" readonly="readonly"/></td>
    	</tr>
    	<tr id="num2">
    		<td>折后价:</td>
    		<td><input name="discountPrice" size="16" value="${param.discountPrice }" readonly="readonly"/></td>
    	</tr>
    	<tr >
    		<td>押金:</td>
    		<td><input name="pledge" id="pledge" size="16"/></td>
    	</tr>
    	<tr id="num1">
    		<td>预定人:</td>
    		<td><input name="customerName" id="customerName" size="16"/></td>
    	</tr>
    	<tr id="num2">
    		<td>证件类型:</td>
    		<td><select id="cardType" name="cardType">
    			<option value=1>身份证</option>
    			<option value=2>军人证</option>
    		</select></td>
    	</tr>
    	<tr id="">
    		<td>证件号码:</td>
    		<td><input name="cardId" id="cardId" size="16"/></td>
    	</tr>
    	<tr id="num1">
    		<td>联系电话:</td>
    		<td><input name="customerPhone" id="customerPhone" size="16"/></td>
    	</tr>
    	<tr id="num2">
    		<td>抵店时间:</td>
    		<td><input name="arriveTime" id="arriveTime" onClick="SelectDate(this,'yyyy-MM-dd')" readonly="readonly" size="16"/></td>
    	</tr>
    	<tr id="">
    		<td>离店时间:</td>
    		<td><input name="leaveTime" id="leaveTime" onClick="SelectDate(this,'yyyy-MM-dd')" readonly="readonly" size="16"/></td>
    	</tr>
    	<tr id="num1">
    		<td>入住人数:</td>
    		<td><input name="checkinNum" id="checkinNum" size="16"/></td>
    	</tr>
    	<tr id="num2">
    		<td>操作员:</td>
    		<td><input name="operator" id="operator" size="16" readonly="readonly" value="${sessionScope.operator }"/></td>
    	</tr>
    	<tr id="">
    		<td>会员编号:</td>
    		<td><input name="mId" id="mId" size="16"/></td>
    	</tr>
    	<tr id="num1">
    		<td>会员价:</td>
    		<td><input name="mPrice" id="mPrice" value="${param.mprice }" size="16" readonly="readonly"/></td>
    	</tr>
    	<tr id="num2">
    		<td>备注:</td>
    		<td><input name="remark" id="remark" size="16"/></td>
    	</tr>
    	<tr id="">
    		<td align="center" colspan=2>
    			<input type="submit" value="预定" />&nbsp;&nbsp;&nbsp;&nbsp;
    			<input type="reset" value="重置"/>&nbsp;
    			
    		</td>
    	</tr>
    </table>
    </form>
  </body>
</html>
