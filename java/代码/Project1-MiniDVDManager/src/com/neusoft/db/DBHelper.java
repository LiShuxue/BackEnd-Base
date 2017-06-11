package com.neusoft.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Vector;

/**
 * 数据库连接池
 * 		当创建数据库连接时， 如果池中有空闲连接，就拿出一个空闲连接，如果池为空，将创建一个新的连接
 * 		当关闭数据库连接时，如果池中有空间，将连接放回池中， 如果池满了， 就直接关闭掉
 * 
 * 通过池操作，可以很快速的获得连接和关闭连接，提高效率
 */
public class DBHelper {
	
	//通过java.util.Properties来读取外部文件，这样可以通过修改外部文件就可以改变连接的数据库类型
	private static Properties prop = null;
	//支持的空间
	private static final int MAX_SIZE = 20;
	//Vector集合，支持同步
	private static Vector<Connection> pool = null;
	
	//数据库加载驱动的时候，只需要加载一次就可以，所以使用静态块
	static{
		//初始化Properties对象
		prop = new Properties();
		try {
			prop.load(DBHelper.class.getClassLoader().getResourceAsStream("config.properties"));
			Class.forName(prop.getProperty("DRIVER"));
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * 创建一个数据库连接
	 */
	private static synchronized Connection createcConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"), prop.getProperty("PWD"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	} 
	
	/**
	 * 获取这个数据库连接
	 */
	public static synchronized Connection getConnection(){
		//如果池为null，即池还未被初始话，就创建这个池
		if(pool == null) {
			pool = new Vector<>();
		}
		//如果池为空，即池中没有元素，就创建一个新的连接
		Connection con =null;
		if(pool.isEmpty()) {
			con = createcConnection();
		}else {
			//如果池中有元素，就将池中最后一个拿出来
			con = pool.remove(pool.size()-1);
		}
		return con;
	}
	
	/**
	 * 关闭连接
	 */
	public static synchronized void closeConnection(Connection con){
		//如果池满了，就直接关闭连接
		if(pool.size() >= MAX_SIZE) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			//如果池没有满，就将这个连接放进池里面
			pool.add(con);
		}
	}
}
