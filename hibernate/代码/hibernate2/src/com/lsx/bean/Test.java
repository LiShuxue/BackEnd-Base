package com.lsx.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Clob;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		//�洢������
		/*
		TTemp t = new TTemp();
		t.setName("diyige");
		Clob msg = Hibernate.createClob("10000 ge hello");
		t.setMsg(msg);
		try {
			//���ļ���Ϊ����������
			Blob img = Hibernate.createBlob(new FileInputStream("E:\\test.txt"));
			t.setImg(img);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		session.save(t);
		tran.commit();
		session.close();
		*/
		
		//ȡ��������
		TTemp t2 = (TTemp)session.get(TTemp.class, 6);
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		try {
			Clob c = t2.getMsg();
			//�������ַ����������1��ʼ���̶������������Ϊ�䱾��ĳ���
			System.out.println(c.getSubString(1, (int)c.length()));
			
			Blob b = t2.getImg();
			//�õ��Ǹ�����������
			InputStream is = b.getBinaryStream();
			OutputStream os = new FileOutputStream("E:\\test2.txt");
			byte[] buff = new byte[1024];
			int len = 0;
			//read()���ض��������ݵĸ���������ȡ�������ݵĸ���Ϊ-1ʱ����û�����ݿɶ��ˣ���ֹѭ��
			while( (len=is.read(buff)) != -1){
				os.write(buff, 0, len);
			}
			os.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		session.close();
	}
}
