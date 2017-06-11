package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		/*
		 * 什么是JDBC？
		 * 通过Java语言连接数据库的技术，使用我们以前学习的sql语句及Java语言。
		 * 可以通过Java语言直接去操作数据库里的表和数据。
		 * 
		 * 1.将ojdbc14.jar包添加到项目中（没个数据库的jar都不同）
		 * 2.具体操作以下几步：
		 * 		1.加载数据库驱动（将jar包中的程序加载到内存，让java可以和数据库通信）
		 * 		2.获取数据库的连接	（通过java.sql.Connection接口，有了连接就可以操作了）
		 * 		3.操作数据库中的数据	
		 * 		4.关闭数据库的连接	
		 */
		
		
		try {
			//1.加载数据库驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.获取数据库的连接
				/*	url  数据库连接字符串
				 *  user 数据库的用户名
				 *  password 数据库密码
				 */
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			System.out.println("已连接数据库");
			//3.操作数据库中的数据	省略。。
			//4.关闭数据库的连接	
			con.close();
			System.out.println("已关闭数据库");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
