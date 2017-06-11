package com.ysj.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.naming.spi.Resolver;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
import com.ysj.bean.CoReport;
import com.ysj.bean.RoomTypes;
import com.ysj.dao.ITodayReport;
import com.ysj.util.DBHelper;
public class TodayReport implements ITodayReport {

	@Override
	public List<BookInfo> findToday() {
		Connection con = DBHelper.getConnection();
		String sql = "select * from bookinfo";
		List<BookInfo> list = new ArrayList<BookInfo>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new BookInfo(rs.getInt("bookId"), rs.getInt("roomid"), rs.getInt("pledge"), rs.getString("customerName"), rs.getInt("cardType"), rs.getString("cardId"), rs.getString("customerPhone"), rs.getString("arriveTime"), rs.getString("leaveTime"), rs.getInt("checkinNum"), rs.getString("operator"), rs.getInt("mId"), rs.getString("remark"), rs.getString("roomType"), rs.getInt("roomPrice"), rs.getInt("discountPrice"), rs.getInt("mPrice"), rs.getInt("bookStatus")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public List<Ci> findCi() {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Ci";
		List<Ci> list = new ArrayList<Ci>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Ci(rs.getInt("ciId"), rs.getInt("roomId"), rs.getString("roomType"), rs.getInt("roomPrice"), 
						rs.getInt("discountPrice"), rs.getInt("pledge"), rs.getString("customerName"), rs.getInt("cardType"), 
						rs.getString("cardId"), rs.getString("customerPhone"), rs.getString("arriveTime"), rs.getString("leaveTime"), 
						rs.getInt("checkintNum"), rs.getString("operator"), rs.getInt("mid"), rs.getInt("mPrice"), 
						rs.getInt("isBreakFirst"), rs.getInt("isClock"), rs.getString("remark"),rs.getInt("status")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public List<CoReport> findCo() {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Co,ci where CO.ciid=CI.ciid";
		List<CoReport> list = new ArrayList<CoReport>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new CoReport(rs.getInt("ciId"), rs.getInt("roomId"), rs.getString("roomType"), rs.getString("customerName"), rs.getInt("mId"), rs.getInt("allCost"), rs.getInt("payType"), rs.getString("leaveTime")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}


}
