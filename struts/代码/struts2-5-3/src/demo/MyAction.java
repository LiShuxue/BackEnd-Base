package demo;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
/**
 * ֱ��ͨ�� ServletActionContext����Servlet API
 *
 */
public class MyAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// ֱ�ӻ��request����Ҳ�͵õ������������С�
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("key", 100);
		//��ȡ����Χ����key
		System.out.println(req.getAttribute("key"));
		return null;
	}

	
}
