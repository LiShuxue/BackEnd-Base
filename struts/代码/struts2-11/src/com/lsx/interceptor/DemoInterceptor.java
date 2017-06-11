package com.lsx.interceptor;

import java.util.Map;

import com.lsx.bean.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 拦截器，进行权限的验证
 * 	即如果是某个用户的话，才可以去查看权限
 */
public class DemoInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//先获取到session对象（map类型），这个session对象中存着刚才登录时的user
		Map sessionMap = ActionContext.getContext().getSession();
		//判断时候符合条件
		if ( "admin".equals(((Users)sessionMap.get("user")).getUsername())) {
			//返回执行action的结果。invocation.invoke()表示执行action
			return invocation.invoke();
		}
		//将提示信息存在request中
		ActionContext.getContext().put("msg", "对不起，你没有权限查看");
		return "input";
	}

}
