package com.ysj.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ysj.bean.Floors;
import com.ysj.bean.RoomTypes;
import com.ysj.bean.Rooms;
import com.ysj.dao.IRoomsDAO;
import com.ysj.dao.impl.RoomsDAO;
import com.ysj.service.IRoomsService;

public class RoomsService implements IRoomsService {

	IRoomsDAO roomsDAO = new RoomsDAO();
	@Override
	public boolean addRoomType(RoomTypes roomType) {
		List<RoomTypes> list = roomsDAO.getTypeByName(roomType.getRoomType());
		if (list.size()==0) {
			return roomsDAO.addRoomType(roomType);
		}else if (roomsDAO.getDeledTypeByName(roomType.getRoomType()).size()==1) {
			return roomsDAO.updateRoomType(roomType);
		}
		return false;
	}


	@Override
	public boolean updateRoomType(RoomTypes roomType) {
		return roomsDAO.updateRoomType(roomType);
	}

	@Override
	public boolean deleteRoomType(String roomType) {
		return roomsDAO.deleteRoomType(roomType);
	}

	@Override
	public List<RoomTypes> selecTypes() {
		return roomsDAO.selectTypes();
	}
	
	@Override
	public List<RoomTypes> getRoomTypeByName(String roomType) {
		List<RoomTypes> allList = roomsDAO.selectTypes();
		List<RoomTypes> list = new ArrayList<RoomTypes>();
		for (RoomTypes roomTypes : allList) {
			if (roomType.equals(roomTypes.getRoomType())) {
				list.add(roomTypes);
			}
		}
		return list;
	}


	@Override
	public Integer getRoomTypeCount() {
		return roomsDAO.selectTypes().size();
	}


	@Override
	public List<RoomTypes> queryRoomType(Integer page, Integer count) {
		return roomsDAO.queryRoomType(page, count);
	}

	//----------------RoomType--------------------------------Floor---------------------------
	@Override
	public boolean addFloor(Floors floor) {
		List<Floors> list = roomsDAO.getFloorByFloor(floor.getFloor());
		if (list.size()==0) {
			return roomsDAO.addFloor(floor);
		}else if (roomsDAO.getDeledFloorByFloor(floor.getFloor()).size()==1) {
			return roomsDAO.updateFloor(floor);
		}
		return false;
	}
	@Override
	public boolean updateFloor(Floors floor) {
		return roomsDAO.updateFloor(floor);
	}


	@Override
	public boolean deleteFloor(Integer floor) {
		return roomsDAO.deleteFloor(floor);
	}


	@Override
	public List<Floors> selectFloors() {
		return roomsDAO.selectFloors();
	}
	
	@Override
	public List<Floors> getFloor(Integer floor) {
		List<Floors> allList = roomsDAO.selectFloors();
		List<Floors> list = new ArrayList<Floors>();
		for (Floors floors : allList) {
			if (floor.equals(floors.getFloor())) {
				list.add(floors);
			}
		}
		return list;
	}


	@Override
	public Integer getFloorCount() {
		return roomsDAO.selectFloors().size();
	}


	@Override
	public List<Floors> queryFloor(Integer page, Integer count) {
		return roomsDAO.queryFloor(page, count);
	}
	//--------Floor-------------------------------Rooms-------------------------------------


	@Override
	public boolean addRoom(Rooms room) {
		return roomsDAO.addRoom(room);
	}


	@Override
	public boolean deleteRoom(Integer roomId) {
		if (roomsDAO.getRoomStatus(roomId)==0) {
			return roomsDAO.deleteRoom(roomId);
		}
		return false;
	}


	@Override
	public boolean updateRoom(Rooms room) {
		if (roomsDAO.getRoomStatus(room.getRoomId())==0) {
			return roomsDAO.updateRoom(room);
		}
		return false;
	}


	@Override
	public List<Rooms> selectRooms() {
		return roomsDAO.selectRooms();
	}


	@Override
	public List<Rooms> selectRoomsById(Integer id) {
		return roomsDAO.getRoomById(id);
	}


	@Override
	public List<Rooms> selectRoomsByType(String type) {
		List<Rooms> allList = roomsDAO.selectRooms();
		List<Rooms> list = new ArrayList<Rooms>();
		for (Rooms rooms : allList) {
			if (type.equals(rooms.getRoomType())) {
				list.add(rooms);
			}
		}
		return list;
	}


	@Override
	public List<Rooms> selectRoomsByStatus(Integer status) {
		List<Rooms> allList = roomsDAO.selectRooms();
		List<Rooms> list = new ArrayList<Rooms>();
		for (Rooms rooms : allList) {
			if (status==rooms.getStatus()) {
				list.add(rooms);
			}
		}
		return list;
	}


	@Override
	public List<Rooms> selectRoomsByFloor(Integer floor) {
		List<Rooms> allList = roomsDAO.selectRooms();
		List<Rooms> list = new ArrayList<Rooms>();
		for (Rooms rooms : allList) {
			if (floor==rooms.getFloor()) {
				list.add(rooms);
			}
		}
		return list;
	}


	@Override
	public List<Rooms> selectRoomsByPrice(Integer price) {
		List<Rooms> allList = roomsDAO.selectRooms();
		List<Rooms> list = new ArrayList<Rooms>();
		for (Rooms rooms : allList) {
			if (price.equals(rooms.getRoomPrice())) {
				list.add(rooms);
			}
		}
		return list;
	}
	
	@Override
	public Integer getBigestRoomId() {
		return roomsDAO.getBigestRoomId();
	}
	
	@Override
	public boolean bookRoom(Integer roomId) {
		return roomsDAO.bookRoom(roomId);
	}
	//----------------------ROOMS-------------------------------------------





}
