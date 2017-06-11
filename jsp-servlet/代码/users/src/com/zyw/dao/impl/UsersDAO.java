package com.zyw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zyw.bean.Users;
import com.zyw.dao.IUsersDAO;
import com.zyw.util.DBHelper;

public class UsersDAO implements IUsersDAO {

	@Override
	public void add(Users user) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into users values(userid.nextval,?,'000000',?,?,0)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getUsername());
			stmt.setDate(2, user.getBirthday());
			stmt.setString(3, user.getPhone());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
	}

	@Override
	public Users getUserByName(String uname) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from users where username=? and isdel=0";
		Users user = null;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, uname);
			ResultSet rs = stmt.executeQuery();
			//如果没找到，user 将无法实例化 就会是 null
			if(rs.next()){
				user = new Users(rs.getInt("id"), 
						rs.getString("username"), 
						rs.getString("password"), 
						rs.getDate("birthday"), 
						rs.getString("phone"), 
						false);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return user;
	}

	@Override
	public List<Users> queryUsers(int page, int count) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from (select * from (SELECT * from users where isdel=0 order by id desc) where rownum <= ?*? ORDER BY id) where rownum <=? order by id desc";
		List<Users> list = new ArrayList<Users>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, page);
			stmt.setInt(2, count);
			stmt.setInt(3, count);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				Users user = new Users(rs.getInt("id"), 
						rs.getString("username"), 
						rs.getString("password"), 
						rs.getDate("birthday"), 
						rs.getString("phone"), 
						false);
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return list;
	}
	
	

	@Override
	public Integer getUsersCount() {
		Connection con = DBHelper.getConnection();
		String sql = "select count(*) from users where isdel=0";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return count;
	}

	@Override
	public void updateUser(Users user) {
		Connection con = DBHelper.getConnection();
		String sql = "update users set password=?,birthday=?,phone=? where username=?";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getPassword());
			stmt.setDate(2, user.getBirthday());
			stmt.setString(3, user.getPhone());
			stmt.setString(4, user.getUsername());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
	}

	@Override
	public void deleteUser(Integer id) {
		Connection con = DBHelper.getConnection();
		String sql = "update users set isdel=1 where id=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
	}

	
	
}












