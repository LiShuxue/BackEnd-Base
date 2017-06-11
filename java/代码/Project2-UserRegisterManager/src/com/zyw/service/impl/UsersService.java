package com.zyw.service.impl;

import com.zyw.bean.Users;
import com.zyw.dao.IUsersDAO;
import com.zyw.dao.impl.UsersDAO;
import com.zyw.service.IUsersService;

public class UsersService implements IUsersService {

	/**
	 * 1.做一个查询，看数组中是否有你要找的这个人
	 * 2.如果没有，注册（将这个人的信息，填入到数组中）
	 * 
	 * 之前的具体操作数组的方法都已经写完了，在UserDao这个类中，
	 * 所以，我们要在这个利用UserDao，完成注册，
	 * 因为UserDAO有一个接口，我们可以使用学过的多态，
	 * 接口  接口变量 = new 接口实现类构造()	来创建UserDao对象
	 * 
	 *  Service将注册细节整合，让界面来调用，当调用时，你知道它这个方法能注册就行了。
	 *  你也不用去管什么细节了。
	 */
	
	private IUsersDAO userDao = new UsersDAO();
	
	@Override
	public boolean yongHuYaoZhuCe(Users user) {
		if( userDao.yaoZhaoYiGeRen(user.getUsername()) ){
			//找到了
			return false;	//不能注册了，有这个人了
		}else{
			//没找到，可以注册
			if(userDao.jiangZheGeRenTianJinXiTong(user)){
				return true;	//注册成功了
			}
		}
		return false;	//有这个人不能注册和注册没有成功 一个意思
	}

}
