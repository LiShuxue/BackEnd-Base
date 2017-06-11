package com.neusoft.db;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

/**
 * 数据库连接池
 * 		当创建数据库连接时，如果池中有空闲连接，就拿出一个现成的连接，如果池是空的，将创建一个新连接
 *		当关闭数据库连接时，如果池中有空间，将连接放回池中，如果池满了，将直接关闭掉。
 */
public class DBHelper {

	private static Properties prop = null;
	private static final int MAX_SIZE = 20;		//支持的空间
	//Vector 集合，支持同步。
	private static Vector<Connection> pool = null;		//容器，存储数据库的连接

	/**
	 * 加载驱动 并初始化Properties对象
	 */
	static{
		prop = new Properties();
		try {
			prop.load(DBHelper.class.getClassLoader().getResourceAsStream("config.properties"));
			//数据库驱动只需要加载1次
			Class.forName(prop.getProperty("DRIVER"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 创建一个新的数据库连接
	 */
	private static synchronized Connection createConnection(){
		Connection con = null;
		try {
			con = DriverManager.getConnection(prop.getProperty("URL"), 
					prop.getProperty("USER"), prop.getProperty("PWD"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 *  获取一个连接
	 */
	public synchronized static Connection getConnection(){
		//如果池没赋值，就创建一个
		if(pool == null){
			pool = new Vector<>();
		}
		//池中如果没有元素 ,就创建一个新的连接
		Connection con = null;
		if(pool.isEmpty()){
			con = createConnection();
		}else{
			//从池中获取一个连接
			con = pool.remove(pool.size()-1);
		}
		return con;
	}
	
	
	public synchronized static void closeConnection(Connection con){
		if(pool.size() >= MAX_SIZE){	//池满了,直接关闭连接
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			pool.add(con);
		}
	}
}


















