package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		/**
		 * 访问student表，向表中插入数据
		 */
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			//通过数据库连接对象，获取一个Statement对象，
			//注意：它是java.sql下面的一个接口，用来执行  SQL语句
			Statement stmt = con.createStatement();
			//定义SQL语句,这个语句必须在数据库中（Navicat）执行过，再写到这里
			String sql = "insert into STUDENT values(5,'test3',"
					+ "to_date('2015-1-1','yyyy-mm-dd'),'tj','email','133')";
			//executeUpdate返回值  就是执行的   影响行数
			int count = stmt.executeUpdate(sql);
			if(count > 0){
				System.out.println("执行成功");
			}else{
				System.out.println("执行失败了");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
