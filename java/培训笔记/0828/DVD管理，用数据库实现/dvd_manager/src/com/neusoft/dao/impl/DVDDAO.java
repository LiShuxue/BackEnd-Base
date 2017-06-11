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
		String sql = "insert into t_dvd values(dvdid.nextval,?,0,null,0,0)";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, dvd.getName());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return count>0?true:false;
	}

	@Override
	public DVD findDVDByName(String name) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from t_dvd where name=?";
		DVD dvd = null;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				dvd = new DVD(rs.getInt("id"), rs.getString("name"),rs.getInt("state") , rs.getDate("time"), rs.getInt("count"), rs.getInt("isDel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return dvd;	
	}

	@Override
	public List<DVD> findDVDs() {
		Connection con = DBHelper.getConnection();
		String sql = "select * from t_dvd where isdel=0 order by count desc";
		List<DVD> dvdList = new ArrayList<>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				DVD dvd = new DVD(rs.getInt("id"), rs.getString("name"),rs.getInt("state") , rs.getDate("time"), rs.getInt("count"), rs.getInt("isDel"));
				dvdList.add(dvd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return dvdList;	
	}

	@Override
	public boolean deleteDVD(String name) {
		Connection con = DBHelper.getConnection();
		String sql = "update t_dvd set isdel=1 where name=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return count>0?true:false;
	}

	@Override
	public boolean borrowDVD(DVD dvd) {
		String sql = "update t_dvd set state=1,count=count+1,time=? where name=? and isdel=0 and state=0";
		int count = 0;
		Connection con = DBHelper.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setDate(1, dvd.getTime());
			stmt.setString(2, dvd.getName());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return count>0?true:false;
	}

	@Override
	public boolean returnDVD(String name) {
		String sql = "update t_dvd set state=0,time=null where name=? and isdel=0 and state=1";
		int count = 0;
		Connection con = DBHelper.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return count>0?true:false;
	}

	
	public static void main(String[] args) {
		DVDDAO dao = new DVDDAO();
		DVD d = new DVD();
		d.setName("d");
		//dao.addDVD(d);
		//System.out.println(dao.findDVDByName("d"));
		//System.out.println(dao.findDVDs().size());
		//System.out.println(dao.deleteDVD("d"));
		//System.out.println(dao.borrowDVD(d));
		System.out.println(dao.returnDVD("a"));
	}
	
	
}
