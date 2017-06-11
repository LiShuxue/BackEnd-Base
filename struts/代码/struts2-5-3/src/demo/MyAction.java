package demo;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 直接通过 ServletActionContext访问Servlet API
 *
 */
public class MyAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// 直接获得request对象，也就得到了其他的所有。
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("key", 100);
		//获取请求范围数据key
		System.out.println(req.getAttribute("key"));
		return null;
	}

	
}
