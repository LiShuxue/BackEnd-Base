package com.lsx.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *	Query接口，执行所有操作，通过hql语句来执行
 */
public class HqlTest {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		//通过sqlQuery来执行,建议不使用
		//SQLQuery sqlQuery = session.createSQLQuery("sql语句");
		
		//通过query来执行。hql中是用类名，不是表名
		//Query query = session.createQuery("hql语句");
		
		//1.查询t_test表中所有信息
		System.out.println("------------------");
		Query query1 = session.createQuery("from TTest");
		List<TTest> list1 = query1.list();
		System.out.println(list1.size());
		System.out.println(list1.get(1).getName());
		System.out.println("------------------");
		
		//2.查询id为5的信息
		Query query2 = session.createQuery("from TTest where id=5");
		List<TTest> list2 = query2.list();
		System.out.println(list2.size());
		System.out.println(list2.get(0).getName());
		System.out.println("------------------");
		
		//3.更新编号为5的信息
		/*
		Query query3 = session.createQuery("update TTest t set t.name=? where t.id=?");
		//占位符从0开始
		query3.setString(0, "chenqiqi");
		query3.setInteger(1, 5);
		query3.executeUpdate();
		//更新的需要提交事务
		tran.commit();
		*/
		
		//4.删除编号5以上的所有信息.也是相当于执行更新
		/*
		Query query4 = session.createQuery("delete from TTest t where t.id>?");
		query4.setInteger(0, 5);
		query4.executeUpdate();
		tran.commit();
		*/
		
		//5.查询编号大于2的信息，并倒序显示
		Query query5 = session.createQuery("from TTest t where t.id>? order by t.id desc");
		query5.setInteger(0, 2);
		List<TTest> list3 = query5.list();
		for(TTest t : list3){
			System.out.println(t.getId());
		}
		System.out.println("------------------");
		
		//6.从第2条数据开始，获取之后2条数据，分页会用到
		Query query6 = session.createQuery("from TTest");
		//设置从第几条开始,第一条为0
		query6.setFirstResult(1);
		//取几条数据
		query6.setMaxResults(2);
		List<TTest> list4 = query6.list();
		for (TTest t : list4) {
			System.out.println(t.getId());
		}
		
		tran.commit();
		session.close();		
	}	
}
