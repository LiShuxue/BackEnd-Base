package com.ysj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ysj.bean.Users;
import com.ysj.dao.IUsersDAO;
import com.ysj.util.DBHelper;

public class UsersDAO implements IUsersDAO {

	@Override
	public boolean addUser(Users user) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into users values(userid.nextval, ?, 111111, ?, ?, 0)";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getUsername());
			stmt.setInt(2, user.getUserType());
			stmt.setString(3, user.getRemark());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}

	@Override
	public boolean deleteUser(Integer userid) {
		Connection con = DBHelper.getConnection();
		String sql = "update users set isdel=1 where userid=?";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, userid);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}

	@Override
	public boolean updateUser(Users user) {
		Connection con = DBHelper.getConnection();
		String sql = "update users set username=?, password=?, usertype=?, remark=? where userid=? and isdel=0";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPassword());
			stmt.setInt(3, user.getUserType());
			stmt.setString(4, user.getRemark());
			stmt.setInt(5, user.getUserId());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}

	@Override
	public List<Users> queryAllUsers(int page, int count) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from (select * from (SELECT * from users where isdel=0 order by userid desc) where rownum <= ?*? ORDER BY userid) where rownum <=? order by userid desc";
		PreparedStatement stmt;
		List<Users> list = new ArrayList<Users>();
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, page);
			stmt.setInt(2, count);
			stmt.setInt(3, count);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				list.add(new Users(
						rs.getInt("userId"), 
						rs.getString("username"), 
						rs.getString("password"), 
						rs.getInt("userType"), 
						rs.getString("remark"), 
						rs.getInt("isDel")
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public boolean queryUser(String username, String password,
			Integer usertype) {
		Connection con = DBHelper.getConnection();
		String sql = "select count(*) from users where username=? and password=? and usertype=? and isdel=0";
		int count=0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setInt(3, usertype);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}
	
	@Override
	public Integer getUsersCount() {
		Connection con = DBHelper.getConnection();
		String sql = "select count(*) from users where isdel = 0";
		int count=0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count;
	}

}
