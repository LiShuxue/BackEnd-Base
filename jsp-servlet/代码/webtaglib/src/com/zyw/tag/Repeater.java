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
		if(it.hasNext()){		//判断是否有下一个元素
			this.pageContext.setAttribute(var, it.next());	//将user对象保存在页面范围，页面的“u”当作key
		}
		return EVAL_BODY_INCLUDE;		//执行主体内容
	}
	
	
	@Override
	public int doAfterBody() throws JspException {
		if(it.hasNext()){
			this.pageContext.setAttribute(var, it.next());
			return EVAL_BODY_AGAIN;		//输出主体内容，再回到起始标记的后方(主体内容的开始)		<a>* 内容  </a>
		}
		//让服务器继续处理正文内容，只有doAfterBody方法可以返回		
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
