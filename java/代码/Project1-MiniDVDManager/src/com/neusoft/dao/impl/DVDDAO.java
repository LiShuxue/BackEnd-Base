package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.bean.DVD;
import com.neusoft.dao.IDVDDAO;
import com.neusoft.db.DBHelper;
import com.neusoft.db.DVDContext;
/**
 * DAO 只对我们DVDContext中的数组操作 该类对象会被Service去调用
 *
 */
public class DVDDAO implements IDVDDAO {

	@Override
	public boolean addDVD(DVD dvd) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into lsx.dvds values (lsx.dvdid.nextval, ?, 0, null, 0, 0)";
		int count = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dvd.getName());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0?true:false;
	}

	@Override
	public DVD findDVDByName(String name) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from lsx.dvds where name = ?";
		DVD dvd = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				dvd = new DVD(rs.getInt("id"), rs.getString("name"), rs.getInt("state"), rs.getDate("time"), rs.getInt("count"), rs.getInt("isDel"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return dvd;	
	}

	@Override
	public List<DVD> findDVDs() {
		Connection con = DBHelper.getConnection();
		String sql = "select * from lsx.dvds where isdel = 0 order by count desc";
		List<DVD> dvdList = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				dvdList.add(new DVD(rs.getInt("id"), rs.getString("name"), rs.getInt("state"), rs.getDate("time"), rs.getInt("count"), rs.getInt("isDel")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return dvdList;
	}

	@Override
	public boolean deleteDVD(String name) {
		Connection con = DBHelper.getConnection();
		String sql = "update lsx.dvds set isdel = 1 where name=?";
		int count = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0?true:false;
	}

	@Override
	public boolean borrowDVD(DVD dvd) {
		Connection con = DBHelper.getConnection();
		String sql = "update lsx.dvds set state=1, count=count+1,time=? where name=? and state=0 and isdel=0";
		int count = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, dvd.getTime());
			pstmt.setString(2, dvd.getName());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0?true:false;
	}

	@Override
	public boolean returnDVD(String name) {
		Connection con = DBHelper.getConnection();
		String sql = "update lsx.dvds set state=0, time=null where name=? and state=1 and isdel=0";
		int count = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0?true:false;
	}
	
//	public static void main(String[] args) {
//		DVDDAO dao = new DVDDAO();
//		DVD d = new DVD();
//		d.setName("d");
//		//dao.addDVD(d);
//		//System.out.println(dao.findDVDByName("d"));
//		//System.out.println(dao.findDVDs().size());
//		//System.out.println(dao.deleteDVD("d"));
//		//System.out.println(dao.borrowDVD(d));
//		System.out.println(dao.returnDVD("a"));
//	}
}
