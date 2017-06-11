package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		//添加一个数据，需要先创建一个主键，再构建实体
		U2Id id = new U2Id("zhao", "liu");
		U2 user = new U2(id, 20);
		
		session.save(user);
		tran.commit();
		session.close();
	}
}
