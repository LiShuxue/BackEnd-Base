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
		 *  ��ô��һ�������������棬����������username�ǲ��Ǻ�nameһ����
		 */
//		for(Users user : UsersContext.users){
//			if(user != null && user.getUsername().equals(name)){
//				return true;
//			}
//		}
//		return false;
		
		Connection con = DBHelper.getConnection();
		String sql = "select count(*) from lsx.users where username = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getInt(1)>0) {
					return true;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		
		return false;
	}

	@Override
	public boolean jiangZheGeRenTianJinXiTong(Users user) {
		/**
		 *  �����user������ӵ����������������Ϊnull��λ���ϣ�
		 */
//		Users[] users = UsersContext.users;
//		for(int i=0; i<users.length; i++){
//			if(users[i] == null){
//				users[i] = user;
//				return true;
//			}
//		}
//		return false;
		
		Connection con = DBHelper.getConnection();
		String sql = "insert into lsx.users values(lsx.userid.nextval,?,?,?)";   //ע���������ҲҪ��lsx.
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

}
