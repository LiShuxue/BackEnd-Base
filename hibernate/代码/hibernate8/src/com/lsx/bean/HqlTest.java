package com.lsx.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *	Query�ӿڣ�ִ�����в�����ͨ��hql�����ִ��
 */
public class HqlTest {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		//ͨ��sqlQuery��ִ��,���鲻ʹ��
		//SQLQuery sqlQuery = session.createSQLQuery("sql���");
		
		//ͨ��query��ִ�С�hql���������������Ǳ���
		//Query query = session.createQuery("hql���");
		
		//1.��ѯt_test����������Ϣ
		System.out.println("------------------");
		Query query1 = session.createQuery("from TTest");
		List<TTest> list1 = query1.list();
		System.out.println(list1.size());
		System.out.println(list1.get(1).getName());
		System.out.println("------------------");
		
		//2.��ѯidΪ5����Ϣ
		Query query2 = session.createQuery("from TTest where id=5");
		List<TTest> list2 = query2.list();
		System.out.println(list2.size());
		System.out.println(list2.get(0).getName());
		System.out.println("------------------");
		
		//3.���±��Ϊ5����Ϣ
		/*
		Query query3 = session.createQuery("update TTest t set t.name=? where t.id=?");
		//ռλ����0��ʼ
		query3.setString(0, "chenqiqi");
		query3.setInteger(1, 5);
		query3.executeUpdate();
		//���µ���Ҫ�ύ����
		tran.commit();
		*/
		
		//4.ɾ�����5���ϵ�������Ϣ.Ҳ���൱��ִ�и���
		/*
		Query query4 = session.createQuery("delete from TTest t where t.id>?");
		query4.setInteger(0, 5);
		query4.executeUpdate();
		tran.commit();
		*/
		
		//5.��ѯ��Ŵ���2����Ϣ����������ʾ
		Query query5 = session.createQuery("from TTest t where t.id>? order by t.id desc");
		query5.setInteger(0, 2);
		List<TTest> list3 = query5.list();
		for(TTest t : list3){
			System.out.println(t.getId());
		}
		System.out.println("------------------");
		
		//6.�ӵ�2�����ݿ�ʼ����ȡ֮��2�����ݣ���ҳ���õ�
		Query query6 = session.createQuery("from TTest");
		//���ôӵڼ�����ʼ,��һ��Ϊ0
		query6.setFirstResult(1);
		//ȡ��������
		query6.setMaxResults(2);
		List<TTest> list4 = query6.list();
		for (TTest t : list4) {
			System.out.println(t.getId());
		}
		
		tran.commit();
		session.close();		
	}	
}
