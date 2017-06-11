package com.neusoft.service;

import java.util.Date;

import com.neusoft.bean.DVD;

public interface IDVDService {

	/**
	 * ���һ��dvd
	 */
	public boolean save(DVD dvd);
	
	/**
	 *  �������dvd
	 */
	public DVD[] queryDVDs();
	
	/**
	 * ɾ��dvd
	 */
	public int delete(String name);
	
	/**
	 * ���dvd
	 */
	public boolean borrowDVD(DVD dvd);
	
	/**
	 * �黹dvd
	 */
	public Date returnDVD(String name);
	
	/**
	 * ��ȡ����
	 */
	public DVD[] getDVDRank();
	
}
