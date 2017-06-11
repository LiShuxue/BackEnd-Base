<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showognl.jsp' starting page</title>
    
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
  	<s:debug/>
	<h3>访问OGNL上下文和Action上下文</h3>    
	
	<!--使用OGNL访问属性值
	-->  
	<!--
		s:property 向页面打印value值
	 	#parameters 获取的是请求参数
	 	这里如果不用parameter，用request也是可以的，为什么呢，有可能是他把请求参数在执行action之后又在地址栏上以参数形式传过来了
	 	el表达式也可以获得
	 -->
	<p>parameters(username):<s:property value="#parameters.username"/></p> 
		<s:property value="#request.username"/>  
		${requestScope.username }
		${param.username }   
	<p>parameters(password):<s:property value="#parameters.password"/></p> 
	
	<p>request.msg: <s:property value="#request.msg"/></p>
	
	<p>session.msg: <s:property value="#session.msg"/></p>
	
	<p>application.msg: <s:property value="#application.msg"/></p>
	<!-- attr,从request范围向 application范围查找 -->
	<p>attr.msg: <s:property value="#attr.msg"/></p>
	<hr/>
	<h3>用于过滤和投影(projecting)集合</h3>
	<p>年龄大于20</p>
	<ul>
		<!-- 获取Action属性，不用加# ?取所有 #this集合中当前对象  .age对象属性
			过滤出集合中所有年龄大于20岁的对象，循环取出当前对象的name，age
		-->
		<s:iterator value="persons.{?#this.age > 20}">
			<li>
				<s:property value="name"/> - 年龄：<s:property value="age"/>
			</li>
		</s:iterator>
	</ul>
	
	<p>姓名p1的年龄: <s:property value="persons.{?#this.name=='p1'}.{age}[0]"/></p>
				<%-- persons.{?#this.name=='p1'}[0].age --%>
	<hr/>
	
	
	
	
	
	<h3>构造Map</h3>
	<s:set name="foobar" value="#{'foo1':'bar1','foo2':'bar2'}"/>
	<p>the value of key foo1 is <s:property value="#foobar['foo1']"/></p>
	
	<p>不使用%： <s:url value="#foobar['foo1']"/></p>
		<%--将字符串 #foobar['foo1'] 当代码来执行 --%>
	<p>使用%： <s:url value="aaa?a=%{#foobar['foo1']}"/></p>
	
	<hr />  
    <%    
        request.setAttribute("req", "request scope");    
        request.getSession().setAttribute("sess", "session scope");    
        request.getSession().getServletContext().setAttribute("app","aplication scope");    
    %>  
    
     1.通过ognl表达式获取 属性范围中的值    
        <br>    
        <s:property value="#request.req" />    
        <br />    
        <s:property value="#session.sess" />    
        <br />    
        <s:property value="#application.app" />    
        <br />    
        <hr> 
      
     2.通过ognl表达式创建list 集合 ，并且遍历出集合中的值
     <br/>
     <s:set name="list" value="{'aaa','bbb','ccc'}"/>
     <!-- set会存在page和request范围 -->
     <s:iterator var="item" value="#list">
     	<s:property/><br/>  <!-- 当前循环的元素 -->
     </s:iterator>
     
     <!-- s:set 会默认存在page和request范围 -->
     page:${pageScope.list }
     request:${requestScope.list }
     session:${sessionScope.list }
     <hr/>
     4.通过ognl表达式 进行逻辑判断
     <br/>
     <s:if test="'aa' in {'aaa','bbb'}">
     	 aa 在 集合{'aaa','bbb'}中；
     </s:if>
     <s:else>
     	 aa 不在 集合{'aaa','bbb'}中；
     </s:else>
     <br/>
     <s:if test="#request.req not in #list">    
                不 在 集合list中；    
     </s:if>    
     <s:else>    
             在 集合list中；    
     </s:else>    
        <br />    
        <hr /> 
    5.通过ognl表达式 的投影功能进行数据筛选 <br/>
    <s:set name="list1" value="{1,2,3,4,5}"/>
    <s:iterator var="item" value="#list1.{?#this > 2}">
    	<s:property/>
    </s:iterator>
    <br/>
    <hr/>
    6.通过ognl表达式 访问某个类的静态方法和值    
        <br> 
    <s:property value="@java.lang.Math@random()"/>
    <br/>
    <s:property value="@com.zyw.action.OgnlAction@staticOgnl('zyw')"/>
  	<hr/>
  	7.ognl表达式 迭代标签 详细  
  	<br/>
  	<s:set name="list2" value="{'aa','bb','cc','dd','ee','ff','gg','hh','ii'}"/>
  	<table border="1" width="400">
  		<tr>
  			<td>索引 </td>    
            <td>值</td>    
            <td>奇？</td>    
            <td> 偶？</td>    
            <td>首？</td>    
            <td> 尾？</td>    
            <td>当前迭代数量</td> 
  		</tr>
  		<s:iterator var="item" value="#list2" status="s">
  			<tr bgcolor='<s:if test="#s.even">pink</s:if>'>
  				<td><s:property value="#s.getIndex()"/></td>    
	            <td><s:property/></td>    
	            <td><s:if test="#s.even">Y</s:if><s:else>N</s:else></td>    
	            <td><s:if test="#s.odd">Y</s:if><s:else>N</s:else></td>    
	            <td><s:if test="#s.first">Y</s:if><s:else>N</s:else></td> 
	            <td><s:if test="#s.isLast()">Y</s:if><s:else>N</s:else></td><!-- #s.last -->    
	            <td><s:property value="#s.count"/>:<s:property value="#s.getCount()"/></td> 
  			</tr>
  		</s:iterator>
  	</table>
  	
  	<hr/>
  	 8.ognl表达式:  if/else if/else 详细<br>  
  	 <s:set name="aa" value="5"/>
  	 <s:if test="#request.aa >= 0 && #request.aa <= 4">
  	 	在0---4之间
  	 </s:if>
  	 <s:elseif test="#request.aa >= 4 && #request.aa <= 8">
  	 	在4---8之间
  	 </s:elseif>
  	 <s:else>
  	 	大于8
  	 </s:else>
  	 
  	 <hr>    
    9.ognl表达式: url 详细<br>
    <!-- set值为字符串 要加 '' -->
    <s:set name="cc" value="'ssaa'"/>
    <s:url action="ognlAction" namespace="/aa/bb">
    	<s:param name="aa" value="#request.cc"/>
    	<s:param name="id" value="100"/>
    </s:url>
    <br/>
    <s:set name="myurl" value="'http://www.baidu.com'"/>
    value以字符串处理:<s:url value="#myurl"/>
    <br/>
    value明确指定以ognl表达式处理:<s:url value="%{#myurl}"></s:url>
    <hr/>
     10.ognl表达式: checkboxlist 详细<br>    
        1> .list 生成；~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>    
        name:checkboxlist的名字<br>    
        list:checkboxlist要显示的列表<br>    
        value:checkboxlist默认被选中的选项<br>    
        <s:checkboxlist name="checkbox1" list="{'上网','看书','爬山','游泳','唱歌'}" value="{'上网','看书'}" ></s:checkboxlist>    
        <br>    
         以上生成代码：<br>    
        <xmp>    
            <input type="checkbox" name="checkbox1" value="上网" id="checkbox1-1" checked="checked"/>    
            <label for="checkbox1-1" class="checkboxLabel">上网</label>    
            <input type="checkbox" name="checkbox1" value="看书" id="checkbox1-2" checked="checked"/>    
            <label for="checkbox1-2" class="checkboxLabel">看书</label>    
            <input type="checkbox" name="checkbox1" value="爬山" id="checkbox1-3"/>    
            <label for="checkbox1-3" class="checkboxLabel">爬山</label>    
            <input type="checkbox" name="checkbox1" value="游泳" id="checkbox1-4"/>    
            <label for="checkbox1-4" class="checkboxLabel">游泳</label>    
            <input type="checkbox" name="checkbox1" value="唱歌" id="checkbox1-5"/>    
            <label for="checkbox1-5" class="checkboxLabel">唱歌</label>"    
        </xmp>    
        2> .Map 生成；~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>    
        name:checkboxlist的名字<br>    
        list:checkboxlist要显示的列表<br>    
        listKey:checkbox 的value的值<br>    
        listValue:checkbox 的lablel(显示的值)<br>    
        value:checkboxlist默认被选中的选项<br>    
        <s:checkboxlist name="checkbox2" list="#{1:'上网',2:'看书',3:'爬山',4:'游泳',5:'唱歌'}" listKey="key" listValue="value" value="{1,2,5}" ></s:checkboxlist>    
        <br>    
                       以上生成代码：<br>    
        <xmp>    
            <input type="checkbox" name="checkbox2" value="1" id="checkbox2-1" checked="checked"/>    
            <label for="checkbox2-1" class="checkboxLabel">上网</label>    
            <input type="checkbox" name="checkbox2" value="2" id="checkbox2-2" checked="checked"/>    
            <label for="checkbox2-2" class="checkboxLabel">看书</label>    
            <input type="checkbox" name="checkbox2" value="3" id="checkbox2-3"/>    
            <label for="checkbox2-3" class="checkboxLabel">爬山</label>    
            <input type="checkbox" name="checkbox2" value="4" id="checkbox2-4"/>    
            <label for="checkbox2-4" class="checkboxLabel">游泳</label>    
            <input type="checkbox" name="checkbox2" value="5" id="checkbox2-5" checked="checked"/>    
            <label for="checkbox2-5" class="checkboxLabel">唱歌</label>    
        </xmp>    
        <hr>  
        
        <s:set name="list4" value="#{1:'aa',2:'bb',3:'cc' }"/>
        <s:property value="#list4.isEmpty"/><br/>
        <s:property value="#list4.size"/><br/>
        
  </body>
</html>








