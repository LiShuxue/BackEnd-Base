package com.ysj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ysj.bean.Members;
import com.ysj.dao.IMembersDAO;
import com.ysj.util.DBHelper;

public class MembersDAO implements IMembersDAO {

	@Override
	public boolean addMember(Members member) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into members values(memberid.nextval, ?, ?, '111111', ?, ?, ?, ?, ?, ?, ?, ?, 0)";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, member.getMname());
			stmt.setString(2, member.getMsex());
			stmt.setString(3, member.getMphone());
			stmt.setString(4, member.getMaddress());
			stmt.setString(5, member.getMemail());
			stmt.setInt(6, member.getMpoints());
			stmt.setString(7, member.getMtype());
			stmt.setDate(8, member.getMbookTime());
			stmt.setDate(9, member.getMpresetTime());
			stmt.setString(10, member.getRemark());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}

	@Override
	public boolean deleteMember(Integer mid) {
		Connection con = DBHelper.getConnection();
		String sql = "update members set isdel=1 where userid=?";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, mid);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}

	@Override
	public boolean updateMember(Members member) {
		Connection con = DBHelper.getConnection();
		String sql = "update members set mname=?, msex=?, mpassword=?, mphone=?, maddress=?, memail=?, mpoints=?, mtype=?, mbooktime=?, mpresettime=?, remark=? where mid=? and isdel=0)";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, member.getMname());
			stmt.setString(2, member.getMsex());
			stmt.setString(3, member.getMpassword());	
			stmt.setString(4, member.getMphone());
			stmt.setString(5, member.getMaddress());
			stmt.setString(6, member.getMemail());
			stmt.setInt(7, member.getMpoints());
			stmt.setString(8, member.getMtype());
			stmt.setDate(9, member.getMbookTime());
			stmt.setDate(10, member.getMpresetTime());
			stmt.setString(11, member.getRemark());
			stmt.setInt(12, member.getMid());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}
	
	@Override
	public boolean updateMemberPoints(Integer points, int mid) {
		Connection con = DBHelper.getConnection();
		String sql = "update members set mpoints=? where mid=? and isdel=0)";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, points);
			stmt.setInt(2, mid);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}

	@Override
	public boolean updateMemberType(String type, int mid) {
		Connection con = DBHelper.getConnection();
		String sql = "update members set mtype=? where mid=? and isdel=0)";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, type);
			stmt.setInt(2, mid);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}
	
	@Override
	public Integer getMembersCount() {
		Connection con = DBHelper.getConnection();
		String sql = "select count(*) from members where isdel = 0";
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

	@Override
	public List<Members> queryAllMembers(int page, int count) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from (select * from (SELECT * from members where isdel=0 order by mid desc) where rownum <= ?*? ORDER BY mid) where rownum <=? order by mid desc";
		PreparedStatement stmt;
		List<Members> list = new ArrayList<Members>();
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, page);
			stmt.setInt(2, count);
			stmt.setInt(3, count);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				list.add(new Members(
						rs.getInt("mid"), 
						rs.getString("mname"), 
						rs.getString("msex"), 
						rs.getString("mpassword"), 
						rs.getString("mphone"), 
						rs.getString("maddress"), 
						rs.getString("memail"), 
						rs.getInt("mpoints"), 
						rs.getString("mtype"), 
						rs.getDate("mbookTime"), 
						rs.getDate("mpresetTime"), 
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
	public Members queryMemberById(Integer mid) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from members where mid=? and isdel=0";
		PreparedStatement stmt;
		Members member = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, mid);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				member = new Members(
						rs.getInt("mid"), 
						rs.getString("mname"), 
						rs.getString("msex"), 
						rs.getString("mpassword"), 
						rs.getString("mphone"), 
						rs.getString("maddress"), 
						rs.getString("memail"), 
						rs.getInt("mpoints"), 
						rs.getString("mtype"), 
						rs.getDate("mbookTime"), 
						rs.getDate("mpresetTime"), 
						rs.getString("remark"), 
						rs.getInt("isDel")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return member;
	}

	@Override
	public Members queryMemberByName(String mname) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from members where mname=? and isdel=0";
		PreparedStatement stmt;
		Members member = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, mname);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				member = new Members(
						rs.getInt("mid"), 
						rs.getString("mname"), 
						rs.getString("msex"), 
						rs.getString("mpassword"), 
						rs.getString("mphone"), 
						rs.getString("maddress"), 
						rs.getString("memail"), 
						rs.getInt("mpoints"), 
						rs.getString("mtype"), 
						rs.getDate("mbookTime"), 
						rs.getDate("mpresetTime"), 
						rs.getString("remark"), 
						rs.getInt("isDel")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return member;
	}

	@Override
	public List<Members> queryMemberByType(String mtype) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from members where mtype=? and isdel=0";
		PreparedStatement stmt;
		List<Members> list = new ArrayList<Members>();
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, mtype);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				list.add(new Members(
						rs.getInt("mid"), 
						rs.getString("mname"), 
						rs.getString("msex"), 
						rs.getString("mpassword"), 
						rs.getString("mphone"), 
						rs.getString("maddress"), 
						rs.getString("memail"), 
						rs.getInt("mpoints"), 
						rs.getString("mtype"), 
						rs.getDate("mbookTime"), 
						rs.getDate("mpresetTime"), 
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
}
