package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		/*
		 *  Class.forName(className) 中 className参数，可以填入一个 包名.类名（类路径）
		 *  可以你将你的类加载到内存，但是你暂时的无法得到该类对象的。
		 *  
		 *  如果你想将一个类加载到内存并且创建这个类的对象的话
		 *  通过一个类路径，将该类Demo加载到内存  在获取它的对象
		 */
		try {
			//会出现异常，你提供的字符串可能找不到这个类
			//Class 一个类的 类信息  也可以叫做Demo类的Class类型
			Class c = Class.forName("com.zyw.jdbc.Demo");
			//newInstance() 创建这个类的对象  返回Object
			Demo demo = (Demo)c.newInstance();
			//访问对象资源
			System.out.println(demo.num);
			//以上创建的对象是通过字符串来创建的
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Demo{
	public int num = 100;
}
