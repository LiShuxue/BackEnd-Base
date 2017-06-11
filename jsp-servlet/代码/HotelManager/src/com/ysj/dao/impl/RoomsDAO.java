package com.ysj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ysj.bean.Floors;
import com.ysj.bean.RoomTypes;
import com.ysj.bean.Rooms;
import com.ysj.dao.IRoomsDAO;
import com.ysj.util.DBHelper;

public class RoomsDAO implements IRoomsDAO {

	@Override
	public boolean addRoomType(RoomTypes roomType) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into ROOMTYPES VALUES(?,?,?,?,0)";
		int count = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, roomType.getRoomType());
			pstmt.setInt(2, roomType.getRoomPeopleNum());
			pstmt.setString(3, roomType.getRemark());
			pstmt.setInt(4, roomType.getTypPrice());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean updateRoomType(RoomTypes roomType) {
		Connection con = DBHelper.getConnection();
		/*
		 * 已经删除的房间类型不能进行修改 房间的类型不能修改 可以修改该类型下的其他信息
		 */
		String sql = "update RoomTypes set roompeoplenum=?,remark=?,typeprice=?,isdel=? where roomType=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, roomType.getRoomPeopleNum());
			stmt.setString(2, roomType.getRemark());
			stmt.setInt(3, roomType.getTypPrice());
			stmt.setInt(4, roomType.getIsDel());
			stmt.setString(5, roomType.getRoomType());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean deleteRoomType(String roomType) {
		Connection con = DBHelper.getConnection();
		String sql = "update RoomTypes set isdel=1 where roomType=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, roomType);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public List<RoomTypes> selectTypes() {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Roomtypes where isdel=0";
		List<RoomTypes> list = new ArrayList<RoomTypes>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new RoomTypes(rs.getString("roomType"), rs
						.getInt("roomPeopleNum"), rs.getString("remark"), rs
						.getInt("typePrice"), 0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public List<RoomTypes> getTypeByName(String roomType) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Roomtypes where roomtype=?";
		List<RoomTypes> list = new ArrayList<RoomTypes>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, roomType);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new RoomTypes(rs.getString("roomType"), rs
						.getInt("roomPeopleNum"), rs.getString("remark"), rs
						.getInt("typePrice"), 0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public List<RoomTypes> getDeledTypeByName(String roomType) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Roomtypes where roomtype=? and isDel=1";
		List<RoomTypes> list = new ArrayList<RoomTypes>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, roomType);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new RoomTypes(rs.getString("roomType"), rs
						.getInt("roomPeopleNum"), rs.getString("remark"), rs
						.getInt("typePrice"), 0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	// --------------roomType---------------------------------floor---------------------------------------
	@Override
	public boolean addFloor(Floors floor) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into floors VALUES(?,?,?,0)";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, floor.getFloor());
			stmt.setString(2, floor.getRemark());
			stmt.setInt(3, floor.getFloorPrice());
			count = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean updateFloor(Floors floor) {
		Connection con = DBHelper.getConnection();
		/*
		 * 已经删除的楼层类型不能进行修改 楼层数不能修改 可以修改该类型下的其他信息
		 */
		String sql = "update floors set remark=?,floorprice=?,isdel=? where floor=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, floor.getRemark());
			stmt.setInt(2, floor.getFloorPrice());
			stmt.setInt(3, floor.getIsDel());
			stmt.setInt(4, floor.getFloor());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean deleteFloor(Integer floor) {
		Connection con = DBHelper.getConnection();
		String sql = "update floors set isdel=1 where floor=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, floor);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public List<Floors> selectFloors() {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Floors where isdel=0";
		List<Floors> list = new ArrayList<Floors>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Floors(rs.getInt("floor"), rs.getString("remark"),
						rs.getInt("floorPrice"), 0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public List<Floors> getFloorByFloor(Integer floor) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Floors where floor=?";
		List<Floors> list = new ArrayList<Floors>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, floor);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Floors(rs.getInt("floor"), rs.getString("remark"),
						rs.getInt("floorPrice"), 0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public List<Floors> getDeledFloorByFloor(Integer floor) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from Floors where Floor=? and isDel=1";
		List<Floors> list = new ArrayList<Floors>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, floor);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Floors(rs.getInt("floor"), rs.getString("remark"),
						rs.getInt("floorPrice"), 0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}



	@Override
	public List<Floors> queryFloor(Integer page, Integer count) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from (select * from (SELECT * from Floors where isdel=0 order by floor desc) where rownum <= ?*? ORDER BY floor) where rownum <=? order by floor desc";
		List<Floors> list = new ArrayList<Floors>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, page);
			stmt.setInt(2, count);
			stmt.setInt(3, count);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				list.add(new Floors(rs.getInt("floor"), rs.getString("remark"), rs.getInt("floorPrice"), 0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return list;
	}
	// -------------Floors----------------------------------Rooms----------------------------------
	@Override
	public boolean addRoom(Rooms room) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into Rooms VALUES(ROOMID.nextval,?,?,?,?,?,?,?,?,0)";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, room.getRoomType());
			stmt.setInt(2, room.getStatus());
			stmt.setInt(3, room.getFloor());
			stmt.setInt(4, room.getRoomPrice());
			stmt.setInt(5, room.getDiscountPrice());
			stmt.setInt(6, room.getMprice());
			stmt.setInt(7, room.getVipPrice());
			stmt.setString(8, room.getRemark());
			count = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean deleteRoom(Integer roomId) {
		Connection con = DBHelper.getConnection();
		String sql = "update Rooms set isdel=1 where roomId=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, roomId);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean updateRoom(Rooms room) {
		Connection con = DBHelper.getConnection();
		/*
		 * 已经删除的房间信息不能进行修改
		 */
		String sql = "update rooms set roomtype=?,status=?,floor=?,roomprice=?,discountprice=?,mprice=?,vipprice=?,remark=?,isdel=? where roomid=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, room.getRoomType());
			stmt.setInt(2, room.getStatus());
			stmt.setInt(3, room.getFloor());
			stmt.setInt(4, room.getRoomPrice());
			stmt.setInt(5, room.getDiscountPrice());
			stmt.setInt(6, room.getMprice());
			stmt.setInt(7, room.getVipPrice());
			stmt.setString(8, room.getRemark());
			stmt.setInt(9, room.getIsDel());
			stmt.setInt(10, room.getRoomId());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;

	}

	@Override
	public List<Rooms> selectRooms() {
		Connection con = DBHelper.getConnection();
		/**
		 * 查找出所有未被删除的房间
		 */
		String sql = "select * from Rooms where isdel=0 order by roomid";
		List<Rooms> list = new ArrayList<Rooms>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Rooms(rs.getInt("roomId"), rs
						.getString("roomType"), rs.getInt("status"), rs
						.getInt("floor"), rs.getInt("roomPrice"), rs
						.getInt("discountPrice"), rs.getInt("mprice"), rs
						.getInt("vipPrice"), rs.getString("remark"), rs
						.getInt("isDel")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public List<Rooms> getRoomById(Integer roomId) {
		Connection con = DBHelper.getConnection();
		/**
		 * 根据编号未被删除的房间
		 */
		String sql = "select * from Rooms where isdel=0 and roomid=?";
		List<Rooms> list = new ArrayList<Rooms>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, roomId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Rooms(rs.getInt("roomId"), rs
						.getString("roomType"), rs.getInt("status"), rs
						.getInt("floor"), rs.getInt("roomPrice"), rs
						.getInt("discountPrice"), rs.getInt("mprice"), rs
						.getInt("vipPrice"), rs.getString("remark"), rs
						.getInt("isDel")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public Integer getRoomStatus(Integer roomId) {
		Connection con = DBHelper.getConnection();
		/*
		 * 根据房间号查处该未删除房间的状态
		 */
		String sql = "select Status from Rooms where isdel=0 and roomid=?";
		Integer status = null;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, roomId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				status=rs.getInt("status");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return status;
	}

	@Override
	public boolean roomIn(Integer roomId) {
		Connection con = DBHelper.getConnection();
		String sql = "update Rooms set status=2 where roomId=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, roomId);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean roomOut(Integer roomId) {
		Connection con = DBHelper.getConnection();
		String sql = "update Rooms set status=0 where roomId=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, roomId);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public List<RoomTypes> queryRoomType(Integer page, Integer count) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from (select * from (SELECT * from RoomTypes where isdel=0 order by typeprice desc) where rownum <= ?*? ORDER BY typeprice) where rownum <=? order by typeprice desc";
		List<RoomTypes> list = new ArrayList<RoomTypes>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, page);
			stmt.setInt(2, count);
			stmt.setInt(3, count);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				list.add(new RoomTypes(rs.getString("roomType"), rs.getInt("roomPeopleNum"), rs.getString("remark"), rs.getInt("typePrice"), 0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return list;
	}

	@Override
	public Integer getBigestRoomId() {
		Connection con = DBHelper.getConnection();
		String sql = "select max(roomid) from rooms";
		Integer maxRoomId = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				maxRoomId = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBHelper.closeConnection(con);
		}
		return maxRoomId;
	}

	@Override
	public boolean bookRoom(Integer roomId) {
		Connection con = DBHelper.getConnection();
		String sql = "update Rooms set status=1 where roomId=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, roomId);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean outRoom(Integer roomId) {
		Connection con = DBHelper.getConnection();
		String sql = "update Rooms set status=0 where roomId=?";
		int count = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, roomId);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count > 0 ? true : false;
	}
}
