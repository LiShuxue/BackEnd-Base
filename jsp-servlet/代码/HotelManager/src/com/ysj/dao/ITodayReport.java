package com.ysj.dao;

import java.sql.Date;
import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
import com.ysj.bean.CoReport;
import com.ysj.bean.Rooms;

public interface ITodayReport {
	/**
	 * 查询出所有的预订信息
	 * @return 返回预订信息集合
	 */
	public List<BookInfo> findToday();
	/**
	 * 查询所有入住信息
	 * @return返回入住信息集合
	 */
	public List<Ci> findCi();
	/**
	 * 查询进账信息
	 * @return返回所有进账
	 */
	public List<CoReport> findCo();

}
