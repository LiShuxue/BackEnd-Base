package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		//��ѯһ������ʱ������ͨ��get()  �� load()
		
		//���û�鵽������null���鵽�ˣ�ֱ��ִ�����ݿ����
		//U user = (U)session.get(U.class, 2);
		//System.out.println(user.getUname());
		
		//���û�У����쳣��
		//��ؼ���ֻ�����ڷ�������������Ե�ʱ�򣬲Ż�ִ�����ݿ������ �ӳټ��ء�
		//ͨ��ʵ��ӳ���ļ��е����� lazy="" Ĭ��true�����������ӳټ��ء�
		U user2 = (U)session.load(U.class, 2);
		System.out.println(user2.getName());

		/*	��getִ��֮�� ��ִ��load ��load��ȥʹ��֮ǰget��ѯ�Ľ����
		 *  ������������ǳ�Ϊ �����ѯ ��֮ǰ��get��ѯ��󣬽��������档 loadֱ��ʹ�û��档û���������ݿ������
		 *  get��load ����������棬 Ҳ�������û��档
		 */
		session.close();

	}

}
