package com.neusoft.db;

import com.neusoft.bean.DVD;

/**
 * DVD 容器
 *	用来保存所有DVD对象 该容器只允许DAO来使用
 */
public class DVDContext {
	
	/**
	 *  可以存储100张dvd
	 */
	public static DVD dvds[] = new DVD[100];
	public static int id = 0;
}
