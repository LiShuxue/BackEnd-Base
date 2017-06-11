package com.zyw.tag;

import java.io.IOException;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.zyw.entity.Users;
/**
 * ��ı�ǩ��̳�javax.servlet.jsp.tagext.TagSupport
 *
 */
public class MyTag extends TagSupport {

	private Users user;
	/**
	 * setPageContext() ������jspҳ���pageContextע�������
	 * Ŀ����Ϊ���ں���ķ����п��Է��ʵ�jspҳ������pageContext����
	 * 
	 * setParent()���ô˱�ǩ�ĸ���ǩ
	 * 
	 * setAttribute()   ����ǩ�е�����ע�뵽��class�����ԣ�
	 * ����Ҫ�Լ�ʵ�ֵ�Ҫ�ṩ���Ե�get��set����
	 */
	
	
	/**
	 * �ڽ�����ǩ֮ǰ���ã�
	 * ����SKIP_PAGE��������jspҳ�����������
	 * ����EVAL_PAGEִ��ҳ�����²���
	 */
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	/**
	 * �ڿ�ʼ��ǩ�������ú���ã�
	 * �������SKIP_BODY����Ա�ǩ֮�е����ݣ�
	 * �������EVAL_BODY_INCLUDE����ִ�У��򽫱�ǩ������ݽ������
	 */
	@Override
	public int doStartTag() throws JspException {
		try{
		//��ȡ���������jsp�������Ϣ��������
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
	 * �������ڽ���ʱ����
	 */
	@Override
	public void release() {
		this.user = null;
		super.release();
	}

	// ����user ������set/get
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	
}
