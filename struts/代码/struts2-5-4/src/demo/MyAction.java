package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 通过实现 ServletRequestAware接口访问Servlet API
 *
 */
public class MyAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{

	private HttpServletRequest req;
	private HttpServletResponse res;
	@Override
	public String execute() throws Exception {
		System.out.println(this.req);
		System.out.println(this.res);
		return null;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.req = request;
		
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.res = response;
		
	}

	
}
