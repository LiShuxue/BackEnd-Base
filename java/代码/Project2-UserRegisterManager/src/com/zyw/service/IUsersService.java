package com.zyw.service;

import com.zyw.bean.Users;

/**
 * �ṩ�û���ҵ�񷽷�
 *		1.ע��
 *			1.1 Ҫע�����ǲ��ǵø�����Ϣ	��Users�Ķ���
 *			1.2 ���ǲ��ǵø�����ע���û�ɹ���	(����ֵ boolean)
 */
public interface IUsersService {

	public boolean yongHuYaoZhuCe(Users user);
}
