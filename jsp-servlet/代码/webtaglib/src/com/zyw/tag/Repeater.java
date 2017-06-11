package com.zyw.tag;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class Repeater extends TagSupport {

	private Collection items;
	private Iterator it;
	private String var;
	
	@Override
	public int doStartTag() throws JspException {
		if(items == null || items.size()==0){
			return SKIP_BODY;
		}
		it = items.iterator();
		if(it.hasNext()){		//�ж��Ƿ�����һ��Ԫ��
			this.pageContext.setAttribute(var, it.next());	//��user���󱣴���ҳ�淶Χ��ҳ��ġ�u������key
		}
		return EVAL_BODY_INCLUDE;		//ִ����������
	}
	
	
	@Override
	public int doAfterBody() throws JspException {
		if(it.hasNext()){
			this.pageContext.setAttribute(var, it.next());
			return EVAL_BODY_AGAIN;		//����������ݣ��ٻص���ʼ��ǵĺ�(�������ݵĿ�ʼ)		<a>* ����  </a>
		}
		//�÷��������������������ݣ�ֻ��doAfterBody�������Է���		
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
	
	public Collection getItems() {
		return items;
	}
	public void setItems(Collection items) {
		this.items = items;
	}
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	
	
}
