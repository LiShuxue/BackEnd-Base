package com.zyw.service.impl;

import com.zyw.bean.Users;
import com.zyw.dao.IUsersDAO;
import com.zyw.dao.impl.UsersDAO;
import com.zyw.service.IUsersService;

public class UsersService implements IUsersService {

	/**
	 * 1.��һ����ѯ�����������Ƿ�����Ҫ�ҵ������
	 * 2.���û�У�ע�ᣨ������˵���Ϣ�����뵽�����У�
	 * 
	 * ֮ǰ�ľ����������ķ������Ѿ�д���ˣ���UserDao������У�
	 * ���ԣ�����Ҫ���������UserDao�����ע�ᣬ
	 * ��ΪUserDAO��һ���ӿڣ����ǿ���ʹ��ѧ���Ķ�̬��
	 * �ӿ�  �ӿڱ��� = new �ӿ�ʵ���๹��()	������UserDao����
	 * 
	 *  Service��ע��ϸ�����ϣ��ý��������ã�������ʱ����֪�������������ע������ˡ�
	 *  ��Ҳ����ȥ��ʲôϸ���ˡ�
	 */
	
	private IUsersDAO userDao = new UsersDAO();
	
	@Override
	public boolean yongHuYaoZhuCe(Users user) {
		if( userDao.yaoZhaoYiGeRen(user.getUsername()) ){
			//�ҵ���
			return false;	//����ע���ˣ����������
		}else{
			//û�ҵ�������ע��
			if(userDao.jiangZheGeRenTianJinXiTong(user)){
				return true;	//ע��ɹ���
			}
		}
		return false;	//������˲���ע���ע��û�гɹ� һ����˼
	}

}
