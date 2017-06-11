package com.zyw.dao;

import com.zyw.bean.Users;

/**
 * 该接口的用处：
 *	访问UsersContext中的数组，用到的所有方法（所有操作数组的方法）
 *	一个用户注册，你需要怎么去操作数组？
 *		1.做一个查询，看数组中是否有你要找的这个人
 *			1.1拿什么查这个人？（需要一个人名）
 *			1.1查没查到是不是得有个结果啊？（返回一个结果）
 *		2.如果没有，注册（将这个人的信息，填入到数组中）
 *			2.1 是不是得有这个人信息啊？		（提供一个人信息，人对象）
 *			2.2 添完了，你是不是得告诉我一声啊？	（行了没有）
 */
public interface IUsersDAO {

	public boolean yaoZhaoYiGeRen(String name);
	
	public boolean jiangZheGeRenTianJinXiTong(Users user);
}
