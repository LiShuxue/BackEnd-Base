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
		 *  对temp1表查询 id  name
		 */
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			Statement stmt = con.createStatement();
			//查询的sql语句
			String sql = "select * from T_TEMP1";
			//通过Statement来执行查询语句，调用executeQuery(),会返回一个 "结果集"
			//通过java.sql.ResultSet接口，来获取结果集
			ResultSet rs = stmt.executeQuery(sql);
			//结果集给你了，你知道里面有多少行数据吗？
			/*
			 * 获取结果集中的列名
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnName(2));
			*/
			//只有一行数据，将是 true  false
			/*System.out.println(rs.next());
			System.out.println(rs.next());*/
			
			while(rs.next()){
				//游标每向下移动一次，如果进入循环，我将可以去获得这一行上的数据
				//怎么去得数据
				//得数据的方式1 通过列的索引来得数据  索引从1开始
							//你还要知道你要操作的这个列 是什么类型的
				//System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
				//得数据的方式2 通过字段名来获取数据
				System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
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
