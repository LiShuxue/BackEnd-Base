package com.ysj.dao;

import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;

public interface IRoomWorkDAO {

	/**
	 * 添加预定信息
	 * @param bookInfo 预定信息
	 * @return 是否添加成功
	 */
	boolean addBookInfo(BookInfo bookInfo);
	/**
	 * 修改预定信息
	 * @param bookInfo 预定信息
	 * @return 是否修改成功
	 */
	boolean updateBookInfo(BookInfo bookInfo);
	/**
	 * 删除一个预定信息
	 * @param bookInfo 预定信息
	 * @return 是否删除成功
	 */
	boolean deleteBookInfo(Integer bookId);
	/**
	 * 查询所有的预定信息
	 * @return 所有的房间预定信息
	 */
	List<BookInfo> selectBookInfo();
	
	/**
	 * 根据预定单号查询该单的预定状态
	 * @param bookId 预定单号
	 * @return 预定状态
	 */
	Integer getStatusById(Integer bookId);
	
	/**
	 * 获得当前最大的预定单号
	 * @return
	 */
	Integer getBigestBookId();
	
	/**
	 *  预定转入住 将预定单号的状态改为2 既已经入住
	 * @param bookId 预定单号
	 * @return 是否转入成功
	 */
	boolean bCheckIn(Integer bookId);
	
	/**
	 * 添加一条入住信息
	 * @param ci 入住信息
	 * @return 是否添加成功
	 */
	boolean addCi(Ci ci);
	
	/**
	 * 客人退房入住信息的状态由0改为1 表示入住完毕
	 * @param ciId 入住单号
	 * @return 是否修改成功
	 */
	boolean cico(Integer ciId);
	
	/**
	 * 根据预定单号获得该预定信息
	 * @param bookId 预定单号
	 * @return 预定信息
	 */
	List<BookInfo> getBookInfoById(Integer bookId);
	
	/**
	 * 查询所有正在入住的登记信息
	 * @return 所有正在入住的登记信息
	 */
	List<Ci> selectCi();
	
	/**
	 * 根据房间号查询正在入住的登记信息
	 * @param roomId 房间号
	 * @return 登记信息
	 */
	List<Ci> getCiByRoomId(Integer roomId);
	
	/**
	 * 获得当前最大的入住单号
	 * @return 当前最大的入住单号
	 */
	Integer getBigestCiId();
	
	/**
	 * 添加一条退房信息
	 * @param co 退房信息
	 * @return 是否添加成功
	 */
	boolean addCo(Co co);
}
