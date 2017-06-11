package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			/*
			 *  使用 PreparedStatement 接口，可以防止 sql注入 ，以及更加方便的传参
			 *  这个 ? 称为占位符，当前这个值还不能确定，我们可以后期向该sql中二次传值
			 */
			String sql = "select count(*) from users where username=? and password=?";
			// 'zhangsan'--'
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, username);	//1 2 代表第几个问号
			stmt.setString(2, password);	//要数据的类型，调用不同的方法
			
			ResultSet rs = stmt.executeQuery();
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
