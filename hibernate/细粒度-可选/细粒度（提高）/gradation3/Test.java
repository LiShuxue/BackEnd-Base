package com.zyw.gradation3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Book b = new Book();
		b.setName("book1");
		b.setMenuf("chuban1");
		b.setPagecount(200);
		b.setIden("1");
		
		DVD d = new DVD();
		d.setName("dvd2");
		d.setMenuf("chuban2");
		d.setCode("code2");
		d.setIden("2");
		
		Transaction tran = session.beginTransaction();
		session.save(b);
		session.save(d);
		tran.commit();
		
		session.close();
	}

}
