package com.lsx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Vector;

public class DBHelper {
	private static Properties prop = null;
	private static final int MAX_SIZE=20;          //最大存储空间
	private static Vector<Connection> pool = null; //容器，存储连接。vector支持同步
	
	/**
	 * 加载驱动，并初始化properties对象
	 */
	static{
		prop = new Properties();
		try {
			prop.load(DBHelper.class.getClassLoader().getResourceAsStream("config.properties"));
			Class.forName(prop.getProperty("DRIVER"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 创建一个数据库的连接
	 */
	private static synchronized Connection createConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(prop.getProperty("URL"), 
					prop.getProperty("USER"), prop.getProperty("PWD"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	/**
	 * 获取一个连接
	 */
	public static synchronized Connection getConnection(){
		if (pool == null) {
			pool = new Vector<Connection>();//如果池没赋值，就创建一个
		}
		Connection con = null;
		if(pool.isEmpty()) {
			con = createConnection();//池中如果没有元素 ,就创建一个新的连接
		} else {
			con = pool.remove(pool.size()-1);//从池中获取一个连接
		}
		return con;
		
	}
	
	/**
	 * 关闭连接
	 */
	public static synchronized  void closeConnection(Connection con) {
		if(pool.size()  >MAX_SIZE){
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			pool.add(con);
		}
	}
}
