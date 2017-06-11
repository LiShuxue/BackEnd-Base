package com.zyw.ioc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * ͨ��config�����ļ��Ķ�ȡ��Ϊҵ���߼������Ͳ�����
 * ������Ͳ��࣬ע���ҵ�����������Ľӿ�
 *
 */
public class BusinessFactory {
	
	/*
	 * ����ģʽ��
	 * 1.˽�л����췽��
	 * 2.����˽�еľ�̬�ĵ�ǰ�����
	 * 3.ͨ���Զ���� getInstance() �������У����ࣩ��˽�о�̬����
	 * �ص㣺ÿ������þ�̬�ķ���getInstance()������õ�һ����ͬ�Ķ����ڵ�һ�ε���ʱ"ʵ����"
	 */
	private static BusinessFactory factory;
	private Properties props;
	
	private Business business;
	private IDeviceWriter writer;
	
	private BusinessFactory() throws Exception{
		props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("config.properties"));
		String businessClass = props.getProperty("business.class");
		String writerClass = props.getProperty("writer.class");
		business = (Business)Class.forName(businessClass).newInstance();
		writer = (IDeviceWriter)Class.forName(writerClass).newInstance();
		business.setWriter(writer);//����������ϵ
	}
	
	public static BusinessFactory getInstance() throws Exception{
		if(factory == null){
			factory = new BusinessFactory();
		}
		return factory;
	}
	
	public Business getBusiness(){
		return this.business;
	}
	
	
	public static void main(String[] args) {
		try {
			Business business = BusinessFactory.getInstance().getBusiness();
			business.save();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
