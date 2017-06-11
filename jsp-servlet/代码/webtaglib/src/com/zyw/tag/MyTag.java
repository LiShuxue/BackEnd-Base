package com.zyw.tag;

import java.io.IOException;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.zyw.entity.Users;
/**
 * 你的标签类继承javax.servlet.jsp.tagext.TagSupport
 *
 */
public class MyTag extends TagSupport {

	private Users user;
	/**
	 * setPageContext() 将所在jsp页面的pageContext注入进来，
	 * 目的是为了在后面的方法中可以访问到jsp页面对象的pageContext属性
	 * 
	 * setParent()设置此标签的父标签
	 * 
	 * setAttribute()   将标签中的属性注入到此class的属性，
	 * 不需要自己实现但要提供属性的get与set方法
	 */
	
	
	/**
	 * 在结束标签之前调用，
	 * 返回SKIP_PAGE跳过整个jsp页面后面的输出，
	 * 返回EVAL_PAGE执行页面余下部分
	 */
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	/**
	 * 在开始标签属性设置后调用，
	 * 如果返回SKIP_BODY则忽略标签之中的内容，
	 * 如果返回EVAL_BODY_INCLUDE继续执行，则将标签体的内容进行输出
	 */
	@Override
	public int doStartTag() throws JspException {
		try{
		//获取输出流，在jsp上输出信息的流对象
			JspWriter out = this.pageContext.getOut();
			if(this.user == null){
				out.print("user is null");
				return SKIP_BODY;//<a user="">body</a>
			}
			out.println("<table width='500px' border='1' align='center'>");
            out.println("<tr>");
            out.println("<td width='20%'>Name:</td>");
            out.println("<td>" + user.getName() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Age:</td>");
            out.println("<td>" + user.getAge() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Address:</td>");
            out.println("<td>" + user.getAddress() + "</td>");
            out.println("</tr>");
            out.println("</table>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
	/**
	 * 生命周期结束时调用
	 */
	@Override
	public void release() {
		this.user = null;
		super.release();
	}

	// 属性user 必须有set/get
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	
}
