package com.neusoft.exe;

import com.neusoft.ui.IManagerUI;
import com.neusoft.ui.impl.ManagerUI;

public class DVDStart {
	/**
	 * 1.����Ŀ���Ҽ�����Ŀ¼����lib�ļ���
	 * 2.��log4j-1.2.8.jar������lib��
	 * 3.��log4j-1.2.8.jar�����Ҽ�Build Path-->Add Build Path
	 * 4.log4j.properties ������Ŀ��src��
	 * 5.C�̸�Ŀ¼ ���� logs�ļ���
	 * --------------------------------------
	 * ������Ҫ������־�����У���������		���İ���org.apache.log4j.Logger
	 * private Logger logger = Logger.getLogger(��ǰ����.class.getName());
	 * ��־ʹ�÷����У�ͨ��logger�������
	 * logger.log(Level.INFO, "�ҵ���־��Ϣ");
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IManagerUI ui = new ManagerUI();
		ui.mainMenu();
	}

}
