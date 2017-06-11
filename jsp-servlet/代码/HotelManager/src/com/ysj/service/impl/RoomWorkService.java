package com.ysj.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
import com.ysj.dao.IRoomWorkDAO;
import com.ysj.dao.IRoomsDAO;
import com.ysj.dao.impl.RoomWorkDAO;
import com.ysj.dao.impl.RoomsDAO;
import com.ysj.service.IRoomWorkService;
import com.ysj.service.IRoomsService;


public class RoomWorkService implements IRoomWorkService {
	IRoomWorkDAO workDAO = new RoomWorkDAO();
	IRoomsDAO roomDAO = new RoomsDAO();
	@Override
	public boolean addBookInfo(BookInfo bookInfo) {
		return workDAO.addBookInfo(bookInfo);
	}

	@Override
	public boolean updateBookInfo(BookInfo bookInfo) {
		if (2!=workDAO.getStatusById(bookInfo.getBookId())) {
			return workDAO.updateBookInfo(bookInfo);
		}
		return false;
	}

	@Override
	public boolean deleteBookInfo(Integer bookId) {
		if (2!=workDAO.getStatusById(bookId)) {
			return workDAO.deleteBookInfo(bookId);
		}
		return false;
	}

	@Override
	public List<BookInfo> selectBookInfo() {
		return workDAO.selectBookInfo();
	}


	@Override
	public List<BookInfo> selectBookInfoByBookId(Integer bookId) {
		List<BookInfo> allList = workDAO.selectBookInfo();
		List<BookInfo> list = new ArrayList<BookInfo>();
		for (BookInfo bookInfo : allList) {
			if (bookId.equals(bookInfo.getBookId())) {
				list.add(bookInfo);
			}
		}
		return list;
	}

	@Override
	public List<BookInfo> selectBookInfoByRoomType(String roomType) {
		List<BookInfo> allList = workDAO.selectBookInfo();
		List<BookInfo> list = new ArrayList<BookInfo>();
		for (BookInfo bookInfo : allList) {
			if (roomType.equals(bookInfo.getRoomType())) {
				list.add(bookInfo);
			}
		}
		return list;
	}

	@Override
	public List<BookInfo> selectBookInfoByRoomId(Integer roomId) {
		List<BookInfo> allList = workDAO.selectBookInfo();
		List<BookInfo> list = new ArrayList<BookInfo>();
		for (BookInfo bookInfo : allList) {
			if (roomId.equals(bookInfo.getRoomType())) {
				list.add(bookInfo);
			}
		}
		return list;
	}

	@Override
	public List<BookInfo> selectBookInfoByCustomerName(String customerName) {
		List<BookInfo> allList = workDAO.selectBookInfo();
		List<BookInfo> list = new ArrayList<BookInfo>();
		for (BookInfo bookInfo : allList) {
			if (customerName.equals(bookInfo.getCustomerName())) {
				list.add(bookInfo);
			}
		}
		return list;
	}

	@Override
	public List<BookInfo> selectBookInfoByStatus(Integer bookStatus) {
		List<BookInfo> allList = workDAO.selectBookInfo();
		List<BookInfo> list = new ArrayList<BookInfo>();
		for (BookInfo bookInfo : allList) {
			if (bookStatus.equals(bookInfo.getBookStatus())) {
				list.add(bookInfo);
			}
		}
		return list;
	}
	
	@Override
	public Integer getBigestBookId() {
		return workDAO.getBigestBookId();
	}
	//-----------------------------bookinfo----------------ci--------------------------------
	@Override
	public boolean ci(Ci ci) {
		if (workDAO.addCi(ci)&&roomDAO.roomIn(ci.getRoomId())) {
			return true;
		}
		return false;
	}

	@Override
	public List<Ci> selectCiById(Integer id) {
		List<Ci> allList = workDAO.selectCi();
		List<Ci> list = new ArrayList<Ci>();
		for (Ci ci : allList) {
			if (id.equals(ci.getCiId())) {
				list.add(ci);
			}
		}
		return list;
	}

	@Override
	public List<Ci> selectCiByRoomType(String roomType) {
		List<Ci> allList = workDAO.selectCi();
		List<Ci> list = new ArrayList<Ci>();
		for (Ci ci : allList) {
			if (roomType.equals(ci.getRoomType())) {
				list.add(ci);
			}
		}
		return list;
	}

	@Override
	public List<Ci> selectCiByRoomId(Integer roomId) {
		List<Ci> allList = workDAO.selectCi();
		List<Ci> list = new ArrayList<Ci>();
		for (Ci ci : allList) {
			if (roomId.equals(ci.getRoomId())) {
				list.add(ci);
			}
		}
		return list;
	}

	@Override
	public List<Ci> selectCiByCustomer(String Customer) {
		List<Ci> allList = workDAO.selectCi();
		List<Ci> list = new ArrayList<Ci>();
		for (Ci ci : allList) {
			if (Customer.equals(ci.getCustomerName())) {
				list.add(ci);
			}
		}
		return list;
	}

	@Override
	public Integer getBigestCiId() {
		return workDAO.getBigestCiId();
	}

	@Override
	public boolean bookCi(Integer bookId) {
		return workDAO.bCheckIn(bookId);
	}

	@Override
	public boolean checkOut(Co co) {
		if (workDAO.cico(co.getCiId())&&roomDAO.outRoom(co.getRoomId())&&workDAO.addCo(co)) {
			return true;
		}
		return false;
	}


}
