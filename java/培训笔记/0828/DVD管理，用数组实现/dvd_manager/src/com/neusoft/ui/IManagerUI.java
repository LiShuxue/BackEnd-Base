package com.neusoft.ui;

public interface IManagerUI {

	/**
	 * 主菜单
	 */
	public void mainMenu();
	
	/**
	 *  欢迎菜单
	 */
	public void welcome();
	
	/**
	 * 查看DVD界面
	 */
	public void query();
	
	/**
	 * 新增dvd界面
	 */
	public void add();
	
	/**
	 * 删除DVD界面
	 */
	public void delete();
	
	/**
	 * 借出界面
	 */
	public void borrow();
	
	/**
	 * 归还界面
	 */
	public void returnUI();
	
	/**
	 * 排行界面
	 */
	public void rank();
	
}
