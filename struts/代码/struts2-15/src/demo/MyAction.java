package demo;

import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {

	private Date mytime;

	@Override
	public String execute() throws Exception {
		//System.out.println(mytime);
		return SUCCESS;
	}

	public Date getMytime() {
		return mytime;
	}

	public void setMytime(Date mytime) {
		this.mytime = mytime;
	}
	
	
}
