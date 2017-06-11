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
		
		//存储大数据
		/*
		TTemp t = new TTemp();
		t.setName("diyige");
		Clob msg = Hibernate.createClob("10000 ge hello");
		t.setMsg(msg);
		try {
			//将文件变为输入流存入
			Blob img = Hibernate.createBlob(new FileInputStream("E:\\test.txt"));
			t.setImg(img);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		session.save(t);
		tran.commit();
		session.close();
		*/
		
		//取出大数据
		TTemp t2 = (TTemp)session.get(TTemp.class, 6);
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		try {
			Clob c = t2.getMsg();
			//将其变成字符串输出，从1开始（固定），输出长度为其本身的长度
			System.out.println(c.getSubString(1, (int)c.length()));
			
			Blob b = t2.getImg();
			//得到那个输入流对象
			InputStream is = b.getBinaryStream();
			OutputStream os = new FileOutputStream("E:\\test2.txt");
			byte[] buff = new byte[1024];
			int len = 0;
			//read()返回读到的数据的个数，当读取到的数据的个数为-1时，即没有内容可读了，终止循环
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
