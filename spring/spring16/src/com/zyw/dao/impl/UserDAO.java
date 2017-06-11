package com.zyw.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zyw.bean.Demo1User;
import com.zyw.dao.IUserDAO;

public class UserDAO extends HibernateDaoSupport implements IUserDAO{

	@Override
	public void insert(Demo1User user) {
		//方法里做了多次数据库的更新 ，必须。
		
		this.getHibernateTemplate().save(user);
		//制造的错误。  当下面报错时，上方的更新是否执行？
		this.getHibernateTemplate().bulkUpdate("update demo1user set id=1");
	}

	@Override
	public Demo1User find(Integer id) {
		return (Demo1User)this.getHibernateTemplate().get(Demo1User.class, id);
	}
}
