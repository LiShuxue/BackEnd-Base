package com.neusoft.dao;

import java.util.List;

import com.neusoft.bean.DVD;

public interface IDVDDAO {

	/**
	 * 新增DVD
	 */
	public boolean addDVD(DVD dvd);
	
	/**
	 * 通过名称查找一个dvd
	 */
	public DVD findDVDByName(String name);
	
	/**
	 * 获得所有dvd对象
	 */
	public List<DVD> findDVDs();
	
	/**
	 * 删除DVD
	 */
	public boolean deleteDVD(String name);
	
	/**
	 * 借出DVD
	 */
	public boolean borrowDVD(DVD dvd);
	
	/**
	 * 归还DVD
	 */
	public boolean returnDVD(String name);
	
	
}








