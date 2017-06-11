package com.ysj.service;

import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
import com.ysj.bean.CoReport;

public interface IReportService {
	/**
	 * 查询预订信息
	 * @return返回预订信息
	 */
	public List<BookInfo> findBook();
	/**
	 * 查询入住信息
	 * @return返回入住所有信息
	 */
	public List<Ci> findCi();
	/**
	 * 查询消费信息
	 * @return返回消费信息
	 */
	public List<CoReport> findCo();

}
