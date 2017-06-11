package com.zyw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zyw.bean.Users;
import com.zyw.dao.IUsersDAO;
import com.zyw.db.DBHelper;
import com.zyw.db.UsersContext;

public class UsersDAO implements IUsersDAO {

	@Override
	public boolean yaoZhaoYiGeRen(String name) {
		/**
		 *  怎么在一个对象数组里面，找这个对象的username是不是和name一样？
		 */
		Connection con = DBHelper.getConnection();
		String sql = "select count(*) from users where username=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				if(rs.getInt(1) > 0){
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return false;
	}

	@Override
	public boolean jiangZheGeRenTianJinXiTong(Users user) {
		/**
		 *  将这个user对象，添加到对象数组里（数组中为null的位置上）
		 */
		Connection con = DBHelper.getConnection();
		String sql = "insert into users values(userid.nextval,?,?,?)";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPassword());
			stmt.setInt(3, user.getAge());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		
		return count>0 ? true : false;
	}
	
	public static void main(String[] args) {
		new UsersDAO().jiangZheGeRenTianJinXiTong(new Users(0, "aa11", "1231", 22));
	}
	

}












