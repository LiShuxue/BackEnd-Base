package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		//查询一个对象时，可以通过get()  、 load()
		
		//如果没查到，返回null，查到了，直接执行数据库操作
		//U user = (U)session.get(U.class, 2);
		//System.out.println(user.getUname());
		
		//如果没有，抛异常。
		//最关键：只有你在访问这个对象属性的时候，才会执行数据库操作。 延迟加载。
		//通过实体映射文件中的属性 lazy="" 默认true，启动启动延迟加载。
		U user2 = (U)session.load(U.class, 2);
		System.out.println(user2.getName());

		/*	在get执行之后， 再执行load ，load会去使用之前get查询的结果。
		 *  这种情况，我们称为 缓存查询 ，之前的get查询完后，将产生缓存。 load直接使用缓存。没有连接数据库操作。
		 *  get和load 都会产生缓存， 也都会利用缓存。
		 */
		session.close();

	}

}
