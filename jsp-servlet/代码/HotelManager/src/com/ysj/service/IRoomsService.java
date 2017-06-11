package com.ysj.service;

import java.util.List;

import com.ysj.bean.Floors;
import com.ysj.bean.RoomTypes;
import com.ysj.bean.Rooms;

public interface IRoomsService {
	/**
	 * 添加一个房间类型,类型不能已经存在
	 * @param roomType 房间类型
	 * @return 是否添加成功
	 */
	boolean addRoomType(RoomTypes roomType);
	
	/**
	 * 修改一个房间类型的其他信息 其他信息包括人数,备注,价格
	 * @param roomType 房间类型 这个类
	 * @return 是否修改成功
	 */
	boolean updateRoomType(RoomTypes roomType);
	
	/**
	 * 删除一个房间类型 
	 * @param roomType 房间类型名
	 * @return 是否删除成功
	 */
	boolean deleteRoomType(String roomType);
	
	/**
	 * 查询出所有未删除的房间类型的信息
	 * @return 房间类型的信息
	 */
	List<RoomTypes> selecTypes();
	
	/**
	 * 根据房间类型 获得房间类型的信息
	 * @param roomType 房间类型
	 * @return 房间信息
	 */
	List<RoomTypes> getRoomTypeByName(String roomType);
	
	/**
	 * 得到未被删除的房间类型的数量
	 * @return 房间类型数量
	 */
	Integer getRoomTypeCount();
	
	/**
	 * 根据页面数 和一个页面所能容纳的数量查询出相应的 房间类型信息
	 * @param page 页面数
	 * @param count 页面所能容纳的信息数
	 * @return 房间类型信息
	 */
	List<RoomTypes> queryRoomType(Integer page,Integer count);
	
	//-------------roomtype----------------------------------------floor
	/**
	 * 添加一个楼层信息 该楼层不能已经存在,如果是已经被删除的同样楼层则将该楼层改为不被删除且更新新数据
	 * @param floor 楼层对象
	 * @return 是否添加成功
	 */
	boolean addFloor(Floors floor);
	
	/**
	 * 更新一个楼层信息 可以更新已经被删除的信息
	 * @param floor 楼层对象
	 * @return 是否添加成功
	 */
	boolean updateFloor(Floors floor);
	
	/**
	 * 删除一个楼层信息
	 * @param floor 楼层对象
	 * @return 是否删除成功
	 */
	boolean deleteFloor(Integer floor);
	
	/**
	 * 查询所有的楼层信息
	 * @return 所有的楼层信息
	 */
	List<Floors> selectFloors();
	
	/**
	 * 根据楼层数获得该楼层信息
	 * @param floor 楼层数
	 * @return 楼层信息
	 */
	List<Floors> getFloor(Integer floor);
	
	/**
	 * 得到所有的楼层数的数目
	 * @return 楼层的数目
	 */
	Integer getFloorCount();
	
	/**
	 * 查询出所有的未删除楼层信息
	 * @param page 第几页面
	 * @param count 一个页面容纳的数量
	 * @return 楼层信息
	 */
	List<Floors> queryFloor(Integer page,Integer count);
	
	//------------floors---------------------------rooms---------------------------------

	/**
	 * 添加一个房间 
	 * @param room 房间对象
	 * @return 是否添加成功
	 */
	boolean addRoom(Rooms room);
	
	/**
	 * 删除一个房间
	 * @param roomId 房间编号
	 * @return 返回是否删除成功
	 */
	boolean deleteRoom(Integer roomId);
	
	/**
	 * 更新一个房间信息
	 * @param room 房间对象
	 * @return 返回是否更新成功
	 */
	boolean updateRoom(Rooms room);
	
	/**
	 * 查询所有未被删除的房间信息
	 * @return 房间信息集合
	 */
	List<Rooms> selectRooms();
	
	/**
	 * 根据客房编号查询客房
	 * @param id 客房编号
	 * @return 查找出来的客房信息集合
	 */
	List<Rooms> selectRoomsById(Integer id);
	
	/**
	 * 根据客房类型查询客房
	 * @param type 客房类型
	 * @return 查找出来的客房信息集合
	 */
	List<Rooms> selectRoomsByType(String type);
	
	/**
	 * 根据客房状态查询客房
	 * @param status 客房状态
	 * @return 查找出来的客房信息集合
	 */
	List<Rooms> selectRoomsByStatus(Integer status);
	
	/**
	 * 根据客房楼层数查询客房
	 * @param floor 客房楼层数
	 * @return 查找出来的客房信息集合
	 */
	List<Rooms> selectRoomsByFloor(Integer floor);
	
	/**
	 * 根据客房价格数查询客房
	 * @param price 客房价格
	 * @return 查找出来的客房信息集合
	 */
	List<Rooms> selectRoomsByPrice(Integer price);
	
	/**
	 * 查找出当前最大的房间编号
	 * @return 当前最大的房间编号
	 */
	Integer getBigestRoomId();
	
	/**
	 * 房间预定 将房间的状态改为预定
	 * @param roomId 房间编号
	 * @return 是否修改成功
	 */
	boolean bookRoom(Integer roomId);

}
