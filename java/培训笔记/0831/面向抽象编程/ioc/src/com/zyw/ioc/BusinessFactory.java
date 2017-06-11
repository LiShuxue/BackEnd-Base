package com.zyw.ioc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * 通过config属性文件的读取，为业务逻辑建立低层依赖
 * 将具体低层类，注入给业务类所依赖的接口
 *
 */
public class BusinessFactory {
	
	/*
	 * 单例模式：
	 * 1.私有化构造方法
	 * 2.定义私有的静态的当前类对象
	 * 3.通过自定义的 getInstance() 返回类中（本类）的私有静态对象
	 * 特点：每次你调用静态的方法getInstance()，都会得到一个相同的对象，在第一次调用时"实例化"
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
		business.setWriter(writer);//建立依赖关系
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
