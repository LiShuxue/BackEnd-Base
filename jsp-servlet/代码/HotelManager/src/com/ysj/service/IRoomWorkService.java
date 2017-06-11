package com.ysj.service;

import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
public interface IRoomWorkService {

	/**
	 * 添加预定信息
	 * @param bookInfo 预定信息
	 * @return 是否添加成功
	 */
	boolean addBookInfo(BookInfo bookInfo);
	/**
	 * 修改预定信息 对于预定状态为入住的预定信息不能进行修改和取消操作。
	 * @param bookInfo 预定信息
	 * @return 是否修改成功
	 */
	boolean updateBookInfo(BookInfo bookInfo);
	/**
	 * 取消预定信息
	 * @param bookId 预定信息编号
	 * @return 是否取消成功
	 */
	boolean deleteBookInfo(Integer bookId);
	/**
	 * 查询所有的预定信息
	 * @return 所有的房间预定信息
	 */
	List<BookInfo> selectBookInfo();
	

	/**
	 * 根据预定单号查询
	 * @param bookId 预定单号
	 * @return 根据预定单号查询出来的预定单
	 */
	List<BookInfo> selectBookInfoByBookId(Integer bookId);
	
	/**
	 * 根据房间类型查询
	 * @param roomType 房间类型
	 * @return 根据房间类型查询出来的预订单
	 */
	List<BookInfo> selectBookInfoByRoomType(String roomType);
	
	/**
	 * 根据房间号查询
	 * @param roomid 房间号
	 * @return 根据房间号查询出来的预订单
	 */
	List<BookInfo> selectBookInfoByRoomId(Integer roomId);
	
	/**
	 * 
	 * @param customerName 预定人
	 * @return 根据预定人查询出来的预定单
	 */
	List<BookInfo> selectBookInfoByCustomerName(String customerName);
	
	/**
	 * 
	 * @param bookStatus 预定单状态
	 * @return 根据预定单状态查询出来的预订单
	 */
	List<BookInfo> selectBookInfoByStatus(Integer bookStatus);
	
	/**
	 * 获得当前最大的预定单号
	 * @return
	 */
	Integer getBigestBookId();
	
	/**
	 * 根据预定号把预定单的状态改为已经入住
	 * @param bookId 预定单号
	 * @return 是否修改成功
	 */
	boolean bookCi(Integer bookId);
	//------------bookinfo-------------------------ci----------------------------------
	/**
	 * 入住!! 既传进来一个完整的入住信息表 保存进数据库 并同时将房间状态改为入住
	 * @param ci 入住信息表
	 * @return 是否入住成功
	 */
	boolean ci(Ci ci);
	
	/**
	 * 根据入住单号查询入住信息
	 * @param id 入住单号
	 * @return 入住信息
	 */
	List<Ci> selectCiById(Integer id);
	
	/**
	 * 根据入住房间类型查询入住信息
	 * @param roomType 房间类型
	 * @return 入住信息
	 */
	List<Ci> selectCiByRoomType(String roomType);
	
	/**
	 * 根据房间编号查询入住信息
	 * @param roomId 房间编号
	 * @return 入住信息
	 */
	List<Ci> selectCiByRoomId(Integer roomId);
	
	/**
	 * 根据入住人查询入住信息
	 * @param Customer 入住人
	 * @return 入住信息
	 */
	List<Ci> selectCiByCustomer(String Customer);
	
	/**
	 * 获得当前最大的入住单号
	 * @return 当前最大的入住单号
	 */
	Integer getBigestCiId();

	//-------
	/**
	 * 退房 数据库中保存退房信息 将房间状态改为空闲 入住单状态改为已经退房
	 * @param co 退房信息
	 * @return 是否退房成功
	 */
	boolean checkOut(Co co);
	
}
