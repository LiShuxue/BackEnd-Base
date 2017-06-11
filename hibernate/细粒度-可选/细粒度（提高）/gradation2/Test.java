package com.zyw.gradation2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Book2 b = new Book2();
		b.setName("name1");
		b.setChuban("chuban1");
		b.setPagecount(100);
		
		Dvd2 d = new Dvd2();
		d.setName("name2");
		d.setChuban("chuban2");
		d.setCode("code2");
		
		Transaction tran = session.beginTransaction();
		session.save(b);
		session.save(d);
		tran.commit();
		session.close();
		System.out.println(b.getId());
	}

}
