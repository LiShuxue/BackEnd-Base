package com.ysj.dao;

import java.util.List;

import com.ysj.bean.Floors;
import com.ysj.bean.RoomTypes;
import com.ysj.bean.Rooms;

public interface IRoomsDAO {
	/**
	 * 添加客房类型
	 * @param roomType 客房类型 人数 以及客房价格
	 * @return 是否添加成功
	 */
	boolean addRoomType(RoomTypes roomType);
	/**
	 * 修改房间类型
	 * @param roomType 客房类型 人数 以及客房价格
	 * @return 是否修改成功
	 */
	boolean updateRoomType(RoomTypes roomType);
	/**
	 * 删除一个房间类型
	 * @param roomType 房间名
	 * @return 是否删除成功
	 */
	boolean deleteRoomType(String roomType);
	/**
	 * 查询所有的房间类型信息
	 * @return 所有的房间类型信息
	 */

	List<RoomTypes> selectTypes();
	
	/**
	 * 根据房间类型名称查询这个房间类型
	 * @return 房间类型
	 */
	List<RoomTypes> getTypeByName(String roomType);
	
	/**
	 * 根据房间门查询已经被删除的房间
	 * @param roomType 房间名
	 * @return 查询到的已经被删除的房间信息
	 */
	List<RoomTypes> getDeledTypeByName(String roomType);
	
	/**
	 * 根据页面数 和一个页面所能容纳的数量查询出相应的 房间类型信息
	 * @param page 页面数
	 * @param count 页面所能容纳的信息数
	 * @return 房间类型信息
	 */
	List<RoomTypes> queryRoomType(Integer page,Integer count);
	
	//-------------RoomTypes--------------------------------------Floors------------------------
	/**
	 * 添加一个楼层信息
	 * @param floor 楼层对象
	 * @return 是否添加成功
	 */
	boolean addFloor(Floors floor);
	
	/**
	 * 更新一个楼层信息
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
	 * 根据楼层数查询楼层信息
	 * @param floor 楼层数
	 * @return 楼层信息
	 */
	List<Floors> getFloorByFloor(Integer floor);
	
	/**
	 * 更具楼层数查询已经被删除的楼层信息
	 * @param floor 楼层数
	 * @return 楼层信息
	 */
	List<Floors> getDeledFloorByFloor(Integer floor);
	
	
	/**
	 * 查询出所有的未删除楼层信息
	 * @param page 第几页面
	 * @param count 一个页面容纳的数量
	 * @return 楼层信息
	 */
	List<Floors> queryFloor(Integer page,Integer count);
	//-------------------Floors------------------------------Rooms-------------------------
	
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
	 * 根据房间编号查询房间信息
	 * @param roomId 房间编号
	 * @return 对应的房间信息
	 */
	List<Rooms> getRoomById(Integer roomId);

	/**
	 * 根据房间号入住 修改房间状态为2
	 * @param roomId 房间号
	 * @return 是否修改成功
	 */
	boolean roomIn(Integer roomId);
	
	/**
	 * 根据房间号退房 修改房间状态为0
	 * @param roomId 房间号
	 * @return 是否修改成功
	 */
	boolean roomOut(Integer roomId);
	/**
	 * 根据房间号查询房间当前的状态
	 * @param roomId 房间号
	 * @return	房间的状态编号 0 空房 1预定 2有人住啦~~
	 */
	Integer getRoomStatus(Integer roomId);
	
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
	
	//-----
	/**
	 * 退房 将房间的状态改为空闲
	 * @param roomId 房间编号
	 * @return 是否修改成功
	 */
	boolean outRoom(Integer roomId);
}
