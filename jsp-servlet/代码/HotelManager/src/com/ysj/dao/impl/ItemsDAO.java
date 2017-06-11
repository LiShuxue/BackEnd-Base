package com.ysj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ysj.bean.ItemTypes;
import com.ysj.bean.Items;
import com.ysj.dao.IItemsDAO;
import com.ysj.util.DBHelper;

public class ItemsDAO implements IItemsDAO {

	@Override
	public boolean addItem(Items item) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into items values(itemid.nextval, ?, ?, ?, ?, ?, 0)";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, item.getItemName());
			stmt.setInt(2, item.getTypeCode());
			stmt.setInt(3, item.getItemPrice());
			stmt.setString(4, item.getItemUnit());
			stmt.setString(5, item.getRemark());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}

	@Override
	public boolean updateItem(Items item) {
		Connection con = DBHelper.getConnection();
		String sql = "update items set itemname=?, typecode=?, itemprice=?, itemunit=?, remark=? where itemcode=? and isdel=0";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, item.getItemName());
			stmt.setInt(2, item.getTypeCode());
			stmt.setInt(3, item.getItemPrice());
			stmt.setString(4, item.getItemUnit());
			stmt.setString(5, item.getRemark());
			stmt.setInt(6, item.getItemCode());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}	
		return count>0 ? true : false;
	}

	@Override
	public boolean deleteItem(Integer itemcode) {
		Connection con = DBHelper.getConnection();
		String sql = "update items set isdel=1 where itemcode=?";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, itemcode);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}	
		return count>0 ? true : false;
	}
	
	@Override
	public Integer getItemsCount() {
		Connection con = DBHelper.getConnection();
		String sql = "select count(*) from items where isdel = 0";
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
	public List<Items> queryItems(int page, int count) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from (select * from (SELECT * from items where isdel=0 order by itemcode desc) where rownum <= ?*? ORDER BY itemcode) where rownum <=? order by itemcode desc";
		List<Items> list = new ArrayList<Items>();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, page);
			stmt.setInt(2, count);
			stmt.setInt(3, count);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				list.add(new Items(
						rs.getInt("itemCode"), 
						rs.getString("itemName"), 
						rs.getInt("typeCode"), 
						rs.getInt("itemPrice"), 
						rs.getString("itemUnit"), 
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
	public Items queryItemByCode(Integer itemcode) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from items where itemcode=? and isdel=0";
		Items item = null;
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, itemcode);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				item = new Items(rs.getInt("itemCode"), rs.getString("itemName"), rs.getInt("typeCode"), rs.getInt("itemPrice"), rs.getString("itemUnit"), rs.getString("remark"), rs.getInt("isDel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}	
		return item;
	}

	@Override
	public List<Items> queryItemsByType(Integer typecode) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from items where typecode=? and isdel=0";
		List<Items> list = new ArrayList<Items>();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, typecode);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				list.add(new Items(rs.getInt("itemCode"), rs.getString("itemName"), rs.getInt("typeCode"), rs.getInt("itemPrice"), rs.getString("itemUnit"), rs.getString("remark"), rs.getInt("isDel")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}	
		return list;
	}

	@Override
	public boolean addItemType(ItemTypes itemtype) {
		Connection con = DBHelper.getConnection();
		String sql = "insert into itemtypes values(itemtypeid.nextval,?, ?, 0)";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, itemtype.getTypeName());
			stmt.setString(2, itemtype.getRemark());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}

	@Override
	public boolean updateItemType(ItemTypes itemtype) {
		Connection con = DBHelper.getConnection();
		String sql = "update itemtypes set typename=?, remark=? where typecode=? and isdel=0";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, itemtype.getTypeName());
			stmt.setString(2, itemtype.getRemark());
			stmt.setInt(3, itemtype.getTypeCode());
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}

	@Override
	public boolean deleteItemType(Integer typecode) {
		Connection con = DBHelper.getConnection();
		String sql = "update itemtypes set isdel=1 where typecode=?";
		PreparedStatement stmt;
		int count = 0;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, typecode);
			count = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}
		return count>0 ? true : false;
	}
	
	@Override
	public Integer getItemTypesCount() {
		Connection con = DBHelper.getConnection();
		String sql = "select count(*) from itemtypes where isdel = 0";
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
	public List<ItemTypes> queryItemTypes(int page, int count) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from (select * from (SELECT * from itemtypes where isdel=0 order by typecode desc) where rownum <= ?*? ORDER BY typecode) where rownum <=? order by typecode desc";
		List<ItemTypes> list = new ArrayList<ItemTypes>();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, page);
			stmt.setInt(2, count);
			stmt.setInt(3, count);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				list.add(new ItemTypes(
						rs.getInt("typeCode"), 
						rs.getString("typeName"), 
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
	public ItemTypes queryItemTypeByTypeCode(Integer typecode) {
		Connection con = DBHelper.getConnection();
		String sql = "select * from itemtypes where typecode=? and isdel=0";
		ItemTypes itemtype = null;
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, typecode);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				itemtype = new ItemTypes(rs.getInt("typeCode"), rs.getString("typeName"), rs.getString("remark"), rs.getInt("isDel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConnection(con);
		}	
		return itemtype;
	}
	
//	public static void main(String[] args) {
//		ItemsDAO dao = new ItemsDAO();
//		Items item = new Items(0, "·üÌØ¼Ó", 101, 388, "Ôª/Æ¿", null, 0);
//		System.out.println(dao.getItemTypesCount());
//	}

}
