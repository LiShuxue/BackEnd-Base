<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'user.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/script.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css">


</head>

<body>
	<c:choose>
		<c:when test="${requestScope.usertype == 1 }">
			<div id="head">
				<img alt="" src="images/login1.jpg"> <a href=""></a>
			</div>
			<hr size="2" color="#3399ff">
			<div id="left">
				<img alt="" src="images/admin.png"> 
				<input id="operator" type="button" value="${requestScope.username }"/>
				<table>
					<tr>
						<ul>
							<li><h3>基础信息管理</h3></li>
								<ul class="nav">
									<li class="navtop"><h4>客房类型管理</h4>
											<ul>
												<li><a href="room/addRoomType.jsp" target="main"><h5>新建客房类型</h5>
														<li><a href="QueryRoomType?page=1" target="main"><h5>管理客房类型</h5></a>
											</ul>

											<li class="navtop"><h4>楼层管理</h4>
													<ul>
														<li><a href="room/addFloor.jsp" target="main"><h5>新建楼层信息</h5>
																<li><a href="QueryFloor?page=1" target="main"><h5>管理楼层信息</h5></a></li>
													</ul>
													<li class="navtop"><a><h4>商品类别管理</h4></a>
															<ul>
																<li><a href="items/addItemType.jsp" target="main"><h5>新建商品类别</h5>

																		<li><a href="items/queryItemTypeByTypecode.jsp"
																			target="main"><h5>按商品编码查询商品类别</h5>
																				<li><a href="QueryItemTypesServlet"
																					target="main"><h5>管理商品类别</h5></a>
															</ul>
															<li class="navtop"><h4>商品管理</h4>
																	<ul>
																		<li><a href="items/addItem.jsp" target="main"><h5>新建商品</h5>

																				<li><a href="items/queryItemByCode.jsp"
																					target="main"><h5>按商品编码查询商品</h5>
																						<li><a href="items/queryItemByTypecode.jsp"
																							target="main"><h5>按商品类型编码查询商品</h5>
																								<li><a href="QueryItemsServlet"
																									target="main"><h5>管理所有商品</h5></a>
																	</ul>
																	<li class="navtop"><h4>会员管理</h4>
																			<ul>
																				<li><a href="members/addMember.jsp"
																					target="main"><h5>新建会员</h5>

																						<li><a href="members/queryMemberByMid.jsp"
																							target="main"><h5>按id查询会员</h5>
																								<li><a
																									href="members/queryMemberByMname.jsp"
																									target="main"><h5>按会员姓名查询会员</h5>
																										<li><a
																											href="members/queryMemberByMtype.jsp"
																											target="main"><h5>按会员类型查询会员</h5>
																												<li><a href="QueryMembersServlet"
																													target="main"><h5>查询所有会员</h5></a>
																			</ul>
								</ul>
							<li><h3>房客管理</h3>
								<ul class="nav">
									<li class="navtop"><a href="QueryZRoom?page=1" target="main"><h4>客人预订
												入住管理</h4></a>
											<li class="navtop"><a href="QueryORoom?page=1"
												target="main"><h4>客房预订信息查询</h4>
													<li class="navtop"><a href="QueryCiInfo"  target="main"><h4>结帐管理</h4></a>
								</ul>
							<li><h3>客房管理</h3>
								<ul class="nav">
									<li class="navtop"><h4>房客信息管理</h4>
											<ul>
												<li><a href="room/addRoom.jsp" target="main"><h5>新建客房</h5>
														<li><a href="QueryRoom?page=1" target="main"><h5>管理客房</h5>
														</a>
											</ul>
								</ul>
							<li><h3>系统管理</h3>
								<ul class="nav">
									<li class="navtop"><h4>用户管理</h4>
										<ul>
											<li><a href="users/addUser.jsp" target="main"><h5>新建用户</h5></a>
											<li><a href="QueryUsersServlet" target="main"><h5>查询所有用户</h5></a>
											<li><a href="users/queryUserByID.jsp" target="main"><h5>按id查询用户</h5></a>
											<li><a href="users/queryUserByName.jsp" target="main"><h5>按用户名查询用户</h5></a>
											<li><a href="users/queryUsersByUsertype.jsp"
												target="main"><h5>按用户类型查询用户</h5></a>
										</ul>
									<li class="navtop"><a href=""><h4>日志管理</h4></a>
										<ul>
											<li><a href=""><h5>查看日志</h5></a>
													
										</ul>
								</ul>
							<li><h3>报表管理</h3>
								<ul class="nav">
									<li><a href="report/dayReport.jsp" target="main"><h4>定时间段预订客人报表</h4></a>
									<li><a href="bookAllReport" target="main"><h4>所有预定客人报表</h4>
									
									<li><a href="report/dayCi.jsp" target="main"><h4>定时间段入住客人报表</h4>
									<li><a href="ciAllReport" target="main"><h4>所有入住客人报表</h4>
									<li><a href="report/coReportTime.jsp" target="main"><h4>财务进账报表</h4></a>
								</ul>
							
							
						</ul>
				</table>
			</div>
			<div id="no">
				<a href=""><img alt="" src="images/out.gif" align="right"></a>
			</div>
			<div id="line"></div>
			<div id="main">
				<div align="right">
					<table border="0" align="left">
						<tr>
							<td><img alt="" src="images/地球.jpg"></td>
							<td><img alt="" src="images/welcome.jpg"></td>
						</tr>
					</table>
				</div>
				<iframe align="right" name="main" width="100%" height="130%">
				</iframe>
			</div>


			<div id="right" align="right">

				<div id="demo" style="overflow:hidden;height:120%;width:180px; background-image: images/20.jsp">
<div id="demo1">
<!-- 定义图片 -->
	<a href="#">
	<img src="images/00M58PICqSr_1024_副本.jpg">
	</a>&nbsp;
	
	<a href="#">
	<img src="images/201210140124_840_560_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/2327411_102618832000_2_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/240425-12101222154964_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/3149472_1405577629gQrZ_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/3415498_100128291156_2_副本.jpg">
	</a>&nbsp;<a href="#">
	<img src="images/5c544735-7bfe-486e-bfc8-df56ec0b9f98_副本.jpg">
	</a>&nbsp;<a href="#">
	<img src="images/8192548_084109540118_2_副本.jpg">
	</a>&nbsp;<a href="#">
	<img src="images/CgQCs1NQjAuAdMNNAACVV3d24gE71900_副本.jpg">
	</a>&nbsp;
</div>
<div id="demo2"></div>
       
      </div>   
				

			</div>
			<script>
var speed=30;
demo2.innerHTML=demo1.innerHTML;
demo.scrollTop=demo.scrollHeight;
function Marquee(){
if(demo1.offsetTop-demo.scrollTop>=0)
demo.scrollTop+=demo2.offsetHeight;
else{
demo.scrollTop--;
}
}
var MyMar=setInterval(Marquee,speed);
demo.onmouseover=function() {clearInterval(MyMar)}
demo.onmouseout=function() {MyMar=setInterval(Marquee,speed);}
</script>
		</c:when>


		<c:when test="${requestScope.usertype == 2 }">
			<div id="head">
				<img alt="" src="images/login1.jpg"> <a href=""></a>
			</div>
			<hr size="2" color="#3399ff">
			<div id="left">
				<img alt="" src="images/admin.png"> 
				<input id="operator" type="button" value="${requestScope.username }"/>
				<table>
					<tr>
						<ul>
							<li><h3>报表管理</h3>
								<ul class="nav">
									<li><a href="report/dayReport.jsp" target="main"><h4>定时间段预订客人报表</h4></a>
									<li><a href="bookAllReport" target="main"><h4>所有预定客人报表</h4>
									
									<li><a href="report/dayCi.jsp" target="main"><h4>定时间段入住客人报表</h4>
									<li><a href="ciAllReport" target="main"><h4>所有入住客人报表</h4>
									<li><a href="report/coReportTime.jsp" target="main"><h4>财务进账报表</h4></a>
								</ul>
							
							
						</ul>
				</table>
			</div>
			<div id="no">
				<a href=""><img alt="" src="images/out.gif" align="right"></a>
			</div>
			<div id="line"></div>
			<div id="main">
				<div align="right">
					<table border="0" align="left">
						<tr>
							<td><img alt="" src="images/地球.jpg"></td>
							<td><img alt="" src="images/welcome.jpg"></td>
						</tr>
					</table>
				</div>
				<iframe align="right" name="main" width="100%" height="130%">
				</iframe>
			</div>


			<div id="right" align="right">

				<div id="demo" style="overflow:hidden;height:120%;width:180px; background-image: images/20.jsp">
<div id="demo1">
<!-- 定义图片 -->
	<a href="#">
	<img src="images/00M58PICqSr_1024_副本.jpg">
	</a>&nbsp;
	
	<a href="#">
	<img src="images/201210140124_840_560_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/2327411_102618832000_2_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/240425-12101222154964_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/3149472_1405577629gQrZ_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/3415498_100128291156_2_副本.jpg">
	</a>&nbsp;<a href="#">
	<img src="images/5c544735-7bfe-486e-bfc8-df56ec0b9f98_副本.jpg">
	</a>&nbsp;<a href="#">
	<img src="images/8192548_084109540118_2_副本.jpg">
	</a>&nbsp;<a href="#">
	<img src="images/CgQCs1NQjAuAdMNNAACVV3d24gE71900_副本.jpg">
	</a>&nbsp;
</div>
<div id="demo2"></div>
       
      </div>   
				

			</div>
			<script>
var speed=30;
demo2.innerHTML=demo1.innerHTML;
demo.scrollTop=demo.scrollHeight;
function Marquee(){
if(demo1.offsetTop-demo.scrollTop>=0)
demo.scrollTop+=demo2.offsetHeight;
else{
demo.scrollTop--;
}
}
var MyMar=setInterval(Marquee,speed);
demo.onmouseover=function() {clearInterval(MyMar)}
demo.onmouseout=function() {MyMar=setInterval(Marquee,speed);}
</script>
		</c:when>



		<c:when test="${requestScope.usertype == 3 }">
			<div id="head">
				<img alt="" src="images/login1.jpg"> <a href=""></a>
			</div>
			<hr size="2" color="#3399ff">
			<div id="left">
				<img alt="" src="images/admin.png"> 
				<input id="operator" type="button" value="${requestScope.username }"/>
				<table>
					<tr>
						<ul>								
							<li><h3>房客管理</h3>
								<ul class="nav">
									<li class="navtop"><a href="QueryZRoom?page=1" target="main"><h4>客人预订
												入住管理</h4></a>
											<li class="navtop"><a href="QueryORoom?page=1"
												target="main"><h4>客房预订信息查询</h4>
													<li class="navtop"><a href="QueryCiInfo"  target="main"><h4>结帐管理</h4></a>
								</ul>
						</ul>
				</table>
			</div>
			<div id="no">
				<a href=""><img alt="" src="images/out.gif" align="right"></a>
			</div>
			<div id="line"></div>
			<div id="main">
				<div align="right">
					<table border="0" align="left">
						<tr>
							<td><img alt="" src="images/地球.jpg"></td>
							<td><img alt="" src="images/welcome.jpg"></td>
						</tr>
					</table>
				</div>
				<iframe align="right" name="main" width="100%" height="130%">
				</iframe>
			</div>


			<div id="right" align="right">

				<div id="demo" style="overflow:hidden;height:120%;width:180px; background-image: images/20.jsp">
<div id="demo1">
<!-- 定义图片 -->
	<a href="#">
	<img src="images/00M58PICqSr_1024_副本.jpg">
	</a>&nbsp;
	
	<a href="#">
	<img src="images/201210140124_840_560_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/2327411_102618832000_2_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/240425-12101222154964_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/3149472_1405577629gQrZ_副本.jpg">
	</a>&nbsp;
	<a href="#">
	<img src="images/3415498_100128291156_2_副本.jpg">
	</a>&nbsp;<a href="#">
	<img src="images/5c544735-7bfe-486e-bfc8-df56ec0b9f98_副本.jpg">
	</a>&nbsp;<a href="#">
	<img src="images/8192548_084109540118_2_副本.jpg">
	</a>&nbsp;<a href="#">
	<img src="images/CgQCs1NQjAuAdMNNAACVV3d24gE71900_副本.jpg">
	</a>&nbsp;
</div>
<div id="demo2"></div>
       
      </div>   
				

			</div>
			<script>
var speed=30;
demo2.innerHTML=demo1.innerHTML;
demo.scrollTop=demo.scrollHeight;
function Marquee(){
if(demo1.offsetTop-demo.scrollTop>=0)
demo.scrollTop+=demo2.offsetHeight;
else{
demo.scrollTop--;
}
}
var MyMar=setInterval(Marquee,speed);
demo.onmouseover=function() {clearInterval(MyMar)}
demo.onmouseout=function() {MyMar=setInterval(Marquee,speed);}
</script>
		</c:when>
	</c:choose>
</body>
</html>
