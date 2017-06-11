package com.zyw.gradation1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zyw.entity.Student;

public class Test {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		/*Book1 book = new Book1("book1", "aaa", 100);
		session.save(book);
		tran.commit();*/
		
		/*Dvd1 dvd1 = new Dvd1("dvd1", "bbb", "ccc");
		session.save(dvd1);
		tran.commit();*/
		
		//必须加包名，
		List list = session.createQuery("from com.zyw.gradation1.Items").list();
		for(Object obj : list){
			Items it = (Items)obj;
			System.out.println(it.getName());
		}
		
		session.close();
	}

}
