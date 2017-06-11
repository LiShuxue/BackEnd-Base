package com.zyw.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure();
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		//List每次都会“向数据库执行一条查询语句” 并且将数据纳入缓存
		//以下的两个List向数据库发起了两次查询，第二个List并没有采用第一个的缓存
		Query query = session.createQuery("from Test1 order by id desc");
		List<Test1> list = query.list();
		for(Test1 t : list){
			System.out.println(t.getId());
		}
		
		Query query1 = session.createQuery("from Test1 order by id desc");
		List<Test1> list1 = query1.list();
		for(Test1 t : list1){
			System.out.println(t.getId());
		}
		System.out.println("---------------------------------------------");
		
		//iterate()首先通过查询缓存是否有数据，并尝试通过id来获取它们
		//"如果有数据"这一操作是没有通过数据库查询的，只查询了缓存
		Query query2 = session.createQuery("from Test1 order by id desc");
		Iterator<Test1> iter2 = query2.iterate();
		while(iter2.hasNext()){
			System.out.println(iter2.next().getName());
		}
		System.out.println("---------------------------------------------");
	
		session.close();	//关闭了session，清除了缓存
		
		//在没有缓存的情况下：
		//iterate()首先查询缓存是否存在数据	1条语句
		//没有缓存，则对每条数据发起一个查询，并将其纳入缓存（N条语句）--这是要命的
		session = factory.openSession();
		Query query3 = session.createQuery("from Test1 order by id desc");
		Iterator<Test1> iter3 = query3.iterate();
		while(iter3.hasNext()){
			System.out.println(iter3.next().getName());
		}
		
		//第二个iterate()，则可以去读取上面iterate()加入的缓存
		Query query4 = session.createQuery("from Test1 order by id desc");
		Iterator<Test1> iter4 = query4.iterate();
		while(iter4.hasNext()){
			System.out.println(iter4.next().getName());
		}
		
		//仅对缓存执行了查询，没有查询数据库
		System.out.print("load:");
		Test1 t = (Test1)session.load(Test1.class, 1);
		System.out.println(t.getId()+"\t"+t.getName());
		
		//仅对缓存执行了查询，没有查询数据库
		System.out.print("get:");
		Test1 t2 = (Test1)session.get(Test1.class , 2);
		System.out.println(t2.getId()+"\t"+t2.getName());
		
		session.close();
	}

}
