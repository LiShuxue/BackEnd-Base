package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 通过hibernate查询数据库
 */
public class Test1 {
	public static void main(String[] args) {
		// 加载src下的默认的 hibernate.cfg.xml 这个配置文件
		Configuration config = new Configuration().configure();
		// 获取一个session工厂，根据你的数据库配置，为你建立数据库连接会话
		SessionFactory factory = config.buildSessionFactory();
		// 创建一个新的会话,有了会话，你就可以直接去操作数据库表了。 相当于getConnection()
		Session session = factory.openSession();
		// 查询之前填入的数据，主要根据主键查询，查id 是1的
		// get。 参数1： 查哪一个对象？ 参数2 ：主键是几？
		U user = (U) session.get(U.class, 2);
		System.out.println("姓名：" + user.getName());
		System.out.println("年龄：" + user.getAge());
		// 做完操作之后，需要关闭会话。和之前jdbc，关闭连接同道理。
		session.close();
	}
}
