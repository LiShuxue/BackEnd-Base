package com.neusoft.dao;

import java.util.List;

import com.neusoft.bean.DVD;

public interface IDVDDAO {

	/**
	 * ����DVD
	 */
	public boolean addDVD(DVD dvd);
	
	/**
	 * ͨ�����Ʋ���һ��dvd
	 */
	public DVD findDVDByName(String name);
	
	/**
	 * �������dvd����
	 */
	public List<DVD> findDVDs();
	
	/**
	 * ɾ��DVD
	 */
	public boolean deleteDVD(String name);
	
	/**
	 * ���DVD
	 */
	public boolean borrowDVD(DVD dvd);
	
	/**
	 * �黹DVD
	 */
	public boolean returnDVD(String name);
	
	
}








