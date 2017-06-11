package com.ysj.dao;

import java.util.List;

import com.ysj.bean.Members;

public interface IMembersDAO {
	/**
	1.	���ӻ�Ա��Ϣ
	2.	�޸Ļ�Ա��Ϣ
	3.	ɾ����Ա��Ϣ
	4.	��ѯ��Ա��Ϣ

	5.	��ѯ��Ա��Ϣ�б����Ը��ݻ�Ա��š���Ա����ѯ��Ա��Ϣ�б�
	6.	����1Ԫ��1��,����ﵽ5000����,����vip��Ա��
	*/
	
	/**
	 * ���ӻ�Ա
	 */
	public boolean addMember(Members member);
	
	/**
	 * ɾ����Ա�����ݻ�Ա��ID���
	 */
	public boolean deleteMember(Integer mid);
	
	/**
	 * �޸Ļ�Ա
	 */
	public boolean updateMember(Members member);
	
	/**
	 * �޸Ļ�Ա�Ļ��֣����ݻ�Ա��ID���
	 */
	public boolean updateMemberPoints(Integer points, int mid);
	
	/**
	 * �޸Ļ�Ա�����ͣ����ݻ�Ա��ID���
	 */
	public boolean updateMemberType(String type, int mid);
	
	/**
	 * ��û�Ա�ĸ���
	 */
	public Integer getMembersCount();
	
	/**
	 * ��ѯ���л�Ա��Ϣ
	 */
	public List<Members> queryAllMembers(int page, int count);
	
	/**
	 * ��ѯĳ����Ա��Ϣ�����ݻ�Ա���
	 */
	public Members queryMemberById(Integer mid);
	
	/**
	 * ��ѯĳ����Ա��Ϣ�����ݻ�Ա��
	 */
	public Members queryMemberByName(String mname);
	
	/**
	 * ��ѯĳ�ֻ�Ա��Ϣ�����ݻ�Ա���
	 */
	public List<Members> queryMemberByType(String mtype);


}
