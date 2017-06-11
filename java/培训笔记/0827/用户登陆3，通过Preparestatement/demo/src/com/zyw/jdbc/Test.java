package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/**
		 *  查询所有Users 用户
		 */
		Test t = new Test();
		List<Users> list = t.findUsers();
		for(Users u : list){
			String line = String.format("%d \t %s \t %s", u.getId(),u.getUsername(),u.getPassword());
			System.out.println(line);
		}
		
	}
	
	public List<Users> findUsers(){
		Connection con = null;
		List<Users> userList = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			String sql = "select * from users";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			userList = new ArrayList<>();
			while(rs.next()){
				//每查询出一行数据，创建一个新的 Users对象，用来保存
				//在将这个Users对象存到 集合中
				Users user = new Users(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
				userList.add(user);
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
		return userList;
	}
}
