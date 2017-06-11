package com.neusoft.service;

import java.sql.Date;
import java.util.List;

import com.neusoft.bean.DVD;

public interface IDVDService {

	/**
	 * 添加一个dvd
	 */
	public boolean save(DVD dvd);
	
	/**
	 *  获得所有dvd
	 */
	public List<DVD> queryDVDs();
	
	/**
	 * 删除dvd
	 */
	public int delete(String name);
	
	/**
	 * 借出dvd
	 */
	public boolean borrowDVD(DVD dvd);
	
	/**
	 * 归还dvd
	 */
	public Date returnDVD(String name);
	
	/**
	 * 获取排行
	 */
	public List<DVD> getDVDRank();
	
}
