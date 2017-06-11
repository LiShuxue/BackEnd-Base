package com.zyw.service;

import com.zyw.bean.Users;

/**
 * 提供用户的业务方法
 *		1.注册
 *			1.1 要注册你是不是得给我信息	（Users的对象）
 *			1.2 你是不是得告诉我注册成没成功？	(返回值 boolean)
 */
public interface IUsersService {

	public boolean yongHuYaoZhuCe(Users user);
}
