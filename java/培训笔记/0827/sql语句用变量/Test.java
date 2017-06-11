package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		/**
		 *  向学生表中填数据，用变量
		 */
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			Statement stmt = con.createStatement();
			int id = 6;
			String name = "name5";
			String birth = "1988-8-8";
			String addr = "shenyang";
			String email = "email@163.com";
			String phone = "130";
			
			String sql = "insert into STUDENT values("+id+
					",'"+name+
					"',to_date('"+birth+
					"','yyyy-mm-dd'),'"+addr+
					"','"+email+
					"','"+phone+
					"')";
			//System.out.println(sql);
			int count = stmt.executeUpdate(sql)	;
			System.out.println(count>0 ? "ok" : "error");
			
		} catch (Exception e) {
			System.out.println("error");
		} finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
