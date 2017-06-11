package com.ysj.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
import com.ysj.bean.RoomTypes;
import com.ysj.dao.IRoomWorkDAO;
import com.ysj.util.DBHelper;

public class RoomWorkDAO implements IRoomWorkDAO {

	@Override
	public boolean addBookInfo(BookInfo bookInfo) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into bookinfo VALUES(bookid.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int count = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookInfo.getRoomid());
			pstmt.setInt(2, bookInfo.getPledge());
			pstmt.setString(3, bookInfo.getCustomerName());
			pstmt.setInt(4, bookInfo.getCardType());
			pstmt.setString(5, bookInfo.getCardId());
			pstmt.setString(6, bookInfo.getCustomerPhone());
			pstmt.setString(7, bookInfo.getArriveTime());
			pstmt.setString(8, bookInfo.getLeaveTime());
			pstmt.setInt(9,bookInfo.getCheckinNum());
			pstmt.setString(10, bookInfo.getOperator());
			pstmt.setInt(11, bookInfo.getmId());
			pstmt.setString(12,bookInfo.getRemark());
			pstmt.setString(13,bookInfo.getRoomType());
			pstmt.setInt(14,bookInfo.getRoomPrice());
			pstmt.setInt(15,bookInfo.getDiscountPrice());
			pstmt.setInt(16,bookInfo.getmPrice());
			pstmt.setInt(17,bookInfo.getBookStatus());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean updateBookInfo(BookInfo bookInfo) {
		Connection con = DBHelper.getConnection();
		String sql = "update bookinfo set ROOMID=?,PLEDGE=?,CUSTOMERNAME=?,CARDTYPE=?,CARDID=?,CUSTOMERPHONE=?,ARRIVETIME=?,LEAVETIME=?,CHECKINTNUM=?,OPERATOR=?,MID=?,REMARK=?,ROOMTYPE=?,ROOMPRICE=?,DISCOUNTPRICE=?,MPRICE=?,BOOKSTATUS=? where BOOKID=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, bookInfo.getRoomid());
			stmt.setInt(2, bookInfo.getPledge());
			stmt.setString(3, bookInfo.getCustomerName());
			stmt.setInt(4, bookInfo.getCardType());
			stmt.setString(5, bookInfo.getCardId());
			stmt.setString(6, bookInfo.getCustomerPhone());
			stmt.setString(7, bookInfo.getArriveTime());
			stmt.setString(8, bookInfo.getLeaveTime());
			stmt.setInt(9,bookInfo.getCheckinNum());
			stmt.setString(10, bookInfo.getOperator());
			stmt.setInt(11, bookInfo.getmId());
			stmt.setString(12,bookInfo.getRemark());
			stmt.setString(13,bookInfo.getRoomType());
			stmt.setInt(14,bookInfo.getRoomPrice());
			stmt.setInt(15,bookInfo.getDiscountPrice());
			stmt.setInt(16,bookInfo.getmPrice());
			stmt.setInt(17,bookInfo.getBookStatus());
			stmt.setInt(18, bookInfo.getBookId());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean deleteBookInfo(Integer bookId) {
		Connection con = DBHelper.getConnection();
		String sql = "update bookinfo set BOOKSTATUS=0 where bookId=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, bookId);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public List<BookInfo> selectBookInfo() {
		Connection con = DBHelper.getConnection();
		String sql = "select * from BookInfo where bookStatus=1";
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
	public Integer getStatusById(Integer bookId) {
		Connection con = DBHelper.getConnection();
		String sql = "select bookStatus from BookInfo where bookId=?";
		Integer status = null;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, bookId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				status = rs.getInt("bookStatus");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return status;
	}

	@Override
	public boolean bCheckIn(Integer bookId) {
		Connection con = DBHelper.getConnection();
		String sql = "update bookinfo set BOOKSTATUS=2 where bookId=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, bookId);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}
	
	@Override
	public Integer getBigestBookId() {
		Connection con = DBHelper.getConnection();
		String sql = "select max(bookid) from BookInfo";
		Integer bigestBookid = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				bigestBookid = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return bigestBookid;
	}
	
	//---------------------Book---------------------------------Ci--------------------
	@Override
	public boolean addCi(Ci ci) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into CI VALUES(CIID.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int count = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ci.getRoomId());
			pstmt.setString(2,ci.getRoomType());
			pstmt.setInt(3, ci.getRoomPrice());
			pstmt.setInt(4, ci.getDiscountPrice());
			pstmt.setInt(5, ci.getPledge());
			pstmt.setString(6, ci.getCustomerName());
			pstmt.setInt(7, ci.getCardType());
			pstmt.setString(8, ci.getCardId());
			pstmt.setString(9, ci.getCustomerPhone());
			pstmt.setString(10, ci.getArriveTime());
			pstmt.setString(11, ci.getLeaveTime());
			pstmt.setInt(12, ci.getCheckintNum());
			pstmt.setString(13, ci.getOperator());
			pstmt.setInt(14, ci.getMid());
			pstmt.setInt(15, ci.getmPrice());
			pstmt.setInt(16, ci.getIsBreakFirst());
			pstmt.setInt(17, ci.getIsClock());
			pstmt.setString(18, ci.getRemark());
			pstmt.setInt(19, ci.getStatus());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean cico(Integer ciId) {
		Connection con = DBHelper.getConnection();
		String sql = "update ci set STATUS=1 where ciId=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, ciId);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public List<BookInfo> getBookInfoById(Integer bookId) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from BookInfo where bookId=?";
		List<BookInfo> list = new ArrayList<BookInfo>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, bookId);
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
	public List<Ci> selectCi() {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Ci where Status=0";
		List<Ci> list = new ArrayList<Ci>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Ci(rs.getInt("ciId"), rs.getInt("roomId"), rs.getString("roomtype"), rs.getInt("roomPrice"), rs.getInt("discountPrice"), rs.getInt("pledge"), rs.getString("customerName"), rs.getInt("cardType"), rs.getString("cardId"), rs.getString("customerPhone"), rs.getString("arriveTime"), rs.getString("leaveTime"), rs.getInt("checkintNum"), rs.getString("operator"), rs.getInt("mid"), rs.getInt("mPrice"), rs.getInt("isBreakFirst"), rs.getInt("isClock"), rs.getString("remark"), rs.getInt("status")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}
//	public static void main(String[] args) {
//	IRoomWorkDAO dao = new RoomWorkDAO();
//	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//	String arriveTime = sf.format(new Date(System.currentTimeMillis()));
//	String leaveTime = sf.format(new Date(System.currentTimeMillis()+1000*60*60*24));
//
//	BookInfo bookInfo = new BookInfo(1000, 1000, 100, "李鑫", 0, "330382199402060451", "18630920748", arriveTime, leaveTime, 1, "陈小天", 0, "", "单人间", 1588, 1588, 1588, 1);
//	//dao.addBookInfo(bookInfo);
//	//dao.deleteBookInfo(1002);
//	//dao.updateBookInfo(bookInfo);
//	//System.out.println(dao.selectBookInfo().size());
//	//System.out.println(dao.getStatusById(1002));
//	Ci ci = new Ci(1, 1000,"单人间", 1588, 1588, 500, "陈小天", 1, "330382199402060451", "18630920748", arriveTime, leaveTime, 1, "李鑫", 1000, 1588, 1, 1, "", 0);
//	dao.addCi(ci);
//	//dao.cico(1002);
//	//System.out.println(dao.getBookInfoById(1002).size());
//	//System.out.println(dao.selectCi().size());
//	//System.out.println(dao.getCiByRoomId(1000).size());
//	}

	@Override
	public List<Ci> getCiByRoomId(Integer roomId) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Ci where Status=0 and roomid=?";
		List<Ci> list = new ArrayList<Ci>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, roomId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Ci(rs.getInt("ciId"), rs.getInt("roomId"),rs.getString("roomtype"), rs.getInt("roomPrice"), rs.getInt("discountPrice"), rs.getInt("pledge"), rs.getString("customerName"), rs.getInt("cardType"), rs.getString("cardId"), rs.getString("customerPhone"), rs.getString("arriveTime"), rs.getString("leaveTime"), rs.getInt("checkintNum"), rs.getString("operator"), rs.getInt("mid"), rs.getInt("mPrice"), rs.getInt("isBreakFirst"), rs.getInt("isClock"), rs.getString("remark"), rs.getInt("status")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public Integer getBigestCiId() {
		Connection con = DBHelper.getConnection();
		String sql = "select max(ciid) from ci";
		Integer bigestCiid = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				bigestCiid = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return bigestCiid;
	}
	public static void main(String[] args) {
		RoomWorkDAO da = new RoomWorkDAO();
	}

	@Override
	public boolean addCo(Co co) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into Co VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int count = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, co.getCiId());
			pstmt.setInt(2, co.getRoomId());
			pstmt.setInt(3,co.getPrice());
			pstmt.setInt(4, co.getPledge());
			pstmt.setInt(5, co.getDays());
			pstmt.setInt(6, co.getRoomCost());
			pstmt.setInt(7, co.getOtherCost());
			pstmt.setInt(8, co.getFoodCost());
			pstmt.setInt(9, co.getPhoneCost());
			pstmt.setInt(10, co.getAllCost());
			pstmt.setInt(11, co.getPayType());
			pstmt.setInt(12, co.getGetMoney());
			pstmt.setString(13, co.getOperator());
			pstmt.setString(14, co.getRemark());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

}
