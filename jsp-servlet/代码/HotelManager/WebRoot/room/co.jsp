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
    
    <title>退房页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript">
		function showMessage(){
			var str1 = $("arriveTime").value;
			var str2 = $("leaveTime").value;
			str1 = str1.replace(/-/,"/");
			str2 = str2.replace(/-/,"/");
			var arriveTime = new Date(str1);
			var leaveTime = new Date(str2);
			var second=leaveTime.getTime()-arriveTime.getTime();  //时间差的毫秒数
			var days=Math.floor(second/(24*3600*1000));
			$("days").value = days;
			var roomCost = days * $("discountPrice").value;
			$("roomCost").value=roomCost;
		}
		function roomCost(){
			$("roomCost").value= $("discountPrice").value * $("days").value;
		}
		function count(){
			$("allCost").value = parseInt($("roomCost").value) + parseInt($("otherCost").value) + parseInt($("foodCost").value) + parseInt($("phoneCost").value);
		}
		
		function jiesuan() {
			$("backMoney").value = parseInt($("getMoney").value) - parseInt($("allCost").value);
			
		}
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body onload="showMessage()">
    <h2>退房页面</h2>
    <hr  size="2" color="#3399ff"/>
    <c:choose>
    	<c:when test="${param.result==1 }">
    		<font color="red">退房成功</font>
    	</c:when>
    	<c:when test="${param.result==0 }">
    		<font color="red">退房失败!!</font>
    	</c:when>
    </c:choose>
    <form action="AddCoServlet" method="post" >
    <input type="hidden" id="arriveTime" value="${requestScope.ci.arriveTime }"/>
	<input type="hidden" id="leaveTime" value="${requestScope.ci.leaveTime }"/>
    <table border="0" width="350px" rules="none" height="600px">
    	<tr id="num1">
    		<td width="27%">入住单号:</td>
    		<td>
    			<input name="ciId" id="ciId" size="16" value="${requestScope.ci.ciId }" readonly="readonly"/>
    		</td>
    	</tr>
    	<tr id="num2">
    		<td>客房编号:</td>
    		<td>
    			<input name="roomId" size="16" value="${requestScope.ci.roomId }" readonly="readonly"/>
    		</td>
    	</tr>
    	<tr>
    		<td>客房类型:</td>
    		<td>
    			<input name="roomType" size="16" value="${requestScope.ci.roomType }" readonly="readonly"/>
    		</td>
    	</tr>
    	<tr id="num1">
    		<td>房间价格:</td>
    		<td><input id="discountPrice" name="discountPrice" size="16" value="${requestScope.ci.discountPrice }" readonly="readonly"/></td>
    	</tr>
    	<tr id="num2">
    		<td>押金:</td>
    		<td><input name="pledge" id="pledge" value="${requestScope.ci.pledge }" size="16"  readonly="readonly"/></td>
    	</tr>
    	<tr>
    		<td>住宿天数:</td>
    		<td><input name="days" id="days" size="16" readonly="readonly"/></td>
    	</tr>
    	<tr id="num1">
    		<td>住宿费:</td>
    		<td><input name="roomCost" id="roomCost" size="16" readonly="readonly"/></td>
    	</tr>
    	<tr id="num2">
    		<td>店内消费:</td>
    		<td><input name="otherCost" id="otherCost" value="${requestScope.sum }" size="16" readonly="readonly"/></td>
    	</tr>
    	<tr>
    		<td>餐费:</td>
    		<td><input name="foodCost" id="foodCost" value=0 size="16"/></td>
    	</tr>
    	<tr id="num1">
    		<td>电话费:</td>
    		<td><input name="phoneCost" id="phoneCost" value=0 size="16"/></td>
    	</tr>
    	<tr id="num2">
    		<td>实际应收:</td>
    		<td><input name="allCost" id="allCost" readonly="readonly" size="16"/>
    			<input type="button" value="结算" onclick="count()">
    		</td>
    	</tr>
    	<tr>
    		<td>应退押金:</td>
    		<td><input name="pledge" id="pledge" value="${requestScope.ci.pledge }" readonly="readonly" size="16"/></td>
    	</tr>
    	<tr id="num1"r>
    		<td>付款方式:</td>
    		<td>
    			<select name="payType" id="payType">
    				<option value="1">请选择付款方式</option>
    				<option value="1">现金</option>
    				<option value="2">支票</option>
    				<option value="3">信用卡</option>
    				<option value="4">代金券</option>
    				<option value="5">其他</option>
    			</select>
    		</td>
    	</tr>
    	<tr id="num2">
    		<td>实收:</td>
    		<td><input name="getMoney" id="getMoney"  size="16" onblur="jiesuan()"/></td>
    	</tr>
    	<tr >
    		<td>找零:</td>
    		<td><input name="backMoney" id="backMoney" size="16" readonly="readonly" value="0"/></td>
    	</tr>
    	<tr id="num1">
    		<td>操作员:</td>
    		<td><input name="operator" id=""operator" size="16" readonly="readonly" value="${sessionScope.operator }"/></td>
    	</tr>
    	<tr id="num2">
    		<td>备注:</td>
    		<td><input name="remark" id="remark" size="16"/></td>
    	</tr>
    	<tr>
    		<td align="center" colspan=2>
    			<input type="submit" value="退房" />&nbsp;&nbsp;&nbsp;&nbsp;
    			<input type="reset" value="重置"/>&nbsp;
    			
    		</td>
    	</tr>
    </table>
    </form>
  </body>
</html>
