package com.lsx.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lsx.bean.Stu;
import com.lsx.dao.IStuDAO;

public class StuDAO extends HibernateDaoSupport implements IStuDAO {

	@Override
	public Stu findStuByName(String name) {
													//这个是hql语句，要写实体类名，而不是表名
		List<Stu> list = getHibernateTemplate().find("from Stu where sname=?", name);
		return list.size()>0 ? list.get(0) : null;
		
		//如何访问数据库？我们有两个选择：
		//getSession().createQuery("from Users");
		//getHibernateTemplate().find( "FROM Users);
	}

	@Override
	public void addStu(Stu stu) {
		//直接使用hibernate 保存对象，事务由spring管理
		//getHibernateTemplate() 存在事务管理,想使用这个方法，你的类必须继承HibernateDaoSsuppport
		
		getHibernateTemplate().save(stu);

	}

}
