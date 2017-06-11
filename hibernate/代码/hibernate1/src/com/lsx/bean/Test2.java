package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 通过hibernate操作数据库，增删改
 */
public class Test2 {
	public static void main(String[] args) {
		// 加载配置文件
		Configuration config = new Configuration().configure();
		// 获得session工厂,有了工厂才能获取session会话
		SessionFactory factory = config.buildSessionFactory();
		// 获得一个session会话
		Session session = factory.openSession();
		
		// 操作数据库
		// 做增删改，必须使用事务，做之前启动事务，做完需要 提交/回滚
		// 启动事务
		Transaction tran = session.beginTransaction();
		// 创建一个用户
		U user = new U();
		user.setName("zhangsan");
		user.setAge(20);
		// 执行添加，用save方法
		session.save(user);
		// 提交事务
		tran.commit();
		session.close();
		// 执行报错，没有序列，所以我们要修改U.hbm.xml
		// 实体和xml类型 ，都是Integer

	}
}
