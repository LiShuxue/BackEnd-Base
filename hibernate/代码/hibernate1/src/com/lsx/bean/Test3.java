package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *通过hibernate进行数据库的修改
 */
public class Test3 {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		//也是一个事务
		Transaction tran = session.beginTransaction();
		//先查询对象
		U user = (U)session.get(U.class, 1);
		//对象设置属性值
		user.setName("lisisi");
		//执行修改(但也是在事务提交时才执行)
		session.update(user);
		//提交事务
		tran.commit();
		session.close();				
	}
}
