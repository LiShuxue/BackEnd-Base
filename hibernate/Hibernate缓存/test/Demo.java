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
		
		//Listÿ�ζ��ᡰ�����ݿ�ִ��һ����ѯ��䡱 ���ҽ��������뻺��
		//���µ�����List�����ݿⷢ�������β�ѯ���ڶ���List��û�в��õ�һ���Ļ���
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
		
		//iterate()����ͨ����ѯ�����Ƿ������ݣ�������ͨ��id����ȡ����
		//"���������"��һ������û��ͨ�����ݿ��ѯ�ģ�ֻ��ѯ�˻���
		Query query2 = session.createQuery("from Test1 order by id desc");
		Iterator<Test1> iter2 = query2.iterate();
		while(iter2.hasNext()){
			System.out.println(iter2.next().getName());
		}
		System.out.println("---------------------------------------------");
	
		session.close();	//�ر���session������˻���
		
		//��û�л��������£�
		//iterate()���Ȳ�ѯ�����Ƿ��������	1�����
		//û�л��棬���ÿ�����ݷ���һ����ѯ�����������뻺�棨N����䣩--����Ҫ����
		session = factory.openSession();
		Query query3 = session.createQuery("from Test1 order by id desc");
		Iterator<Test1> iter3 = query3.iterate();
		while(iter3.hasNext()){
			System.out.println(iter3.next().getName());
		}
		
		//�ڶ���iterate()�������ȥ��ȡ����iterate()����Ļ���
		Query query4 = session.createQuery("from Test1 order by id desc");
		Iterator<Test1> iter4 = query4.iterate();
		while(iter4.hasNext()){
			System.out.println(iter4.next().getName());
		}
		
		//���Ի���ִ���˲�ѯ��û�в�ѯ���ݿ�
		System.out.print("load:");
		Test1 t = (Test1)session.load(Test1.class, 1);
		System.out.println(t.getId()+"\t"+t.getName());
		
		//���Ի���ִ���˲�ѯ��û�в�ѯ���ݿ�
		System.out.print("get:");
		Test1 t2 = (Test1)session.get(Test1.class , 2);
		System.out.println(t2.getId()+"\t"+t2.getName());
		
		session.close();
	}

}
