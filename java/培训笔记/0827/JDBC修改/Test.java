package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		/**
		 * 访问student表，修改姓名和电话
		 */
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			Statement stmt = con.createStatement();
			String sql = "update student set sname='haochen',sphone='186' where sid=12";
			int count = stmt.executeUpdate(sql);
			System.out.println(count > 0 ? "ok" : "error");
			
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
