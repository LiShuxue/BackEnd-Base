package com.zyw.dao;

import com.zyw.bean.Users;

/**
 * �ýӿڵ��ô���
 *	����UsersContext�е����飬�õ������з��������в�������ķ�����
 *	һ���û�ע�ᣬ����Ҫ��ôȥ�������飿
 *		1.��һ����ѯ�����������Ƿ�����Ҫ�ҵ������
 *			1.1��ʲô������ˣ�����Ҫһ��������
 *			1.1��û�鵽�ǲ��ǵ��и��������������һ�������
 *		2.���û�У�ע�ᣨ������˵���Ϣ�����뵽�����У�
 *			2.1 �ǲ��ǵ����������Ϣ����		���ṩһ������Ϣ���˶���
 *			2.2 �����ˣ����ǲ��ǵø�����һ������	������û�У�
 */
public interface IUsersDAO {

	public boolean yaoZhaoYiGeRen(String name);
	
	public boolean jiangZheGeRenTianJinXiTong(Users user);
}
