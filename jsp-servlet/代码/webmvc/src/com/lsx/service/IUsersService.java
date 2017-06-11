package com.lsx.service;

import com.lsx.bean.Users;

public interface IUsersService {
	
	/**
	 * 查一个用户的业务方法
	 * 		该方法中可能会调用多个dao中的方法。
	 */
	public Users queryUser(Integer id);
}
