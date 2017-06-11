package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/**
		 *  用户登录，通过数据库中的数据和输入的数据，进行验证
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username = input.next();
		System.out.print("请输入密码：");
		String password = input.next();
		Test t = new Test();
		if(t.login(username, password)){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
		
	}
	
	public boolean login(String username,String password){
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			Statement stmt = con.createStatement();
			String sql = "select count(*) from users where username='"+username+
					"' and password='"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			//只有一行一列的结果  是0  或  1
			if(rs.next()){
				if(rs.getInt(1) > 0){
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		} finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
