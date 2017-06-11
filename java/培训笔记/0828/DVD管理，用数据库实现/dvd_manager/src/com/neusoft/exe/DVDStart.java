package com.neusoft.exe;

import com.neusoft.ui.IManagerUI;
import com.neusoft.ui.impl.ManagerUI;

public class DVDStart {
	/**
	 * 1.在项目（右键）根目录创建lib文件夹
	 * 2.将log4j-1.2.8.jar拷贝到lib中
	 * 3.在log4j-1.2.8.jar上面右键Build Path-->Add Build Path
	 * 4.log4j.properties 拷到项目的src中
	 * 5.C盘根目录 创建 logs文件夹
	 * --------------------------------------
	 * 在你需要加入日志的类中，创建属性		它的包是org.apache.log4j.Logger
	 * private Logger logger = Logger.getLogger(当前类名.class.getName());
	 * 日志使用方法中，通过logger对象调用
	 * logger.log(Level.INFO, "我的日志信息");
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IManagerUI ui = new ManagerUI();
		ui.mainMenu();
	}

}
