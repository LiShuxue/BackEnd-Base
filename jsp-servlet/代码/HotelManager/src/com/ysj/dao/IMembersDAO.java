package com.ysj.dao;

import java.util.List;

import com.ysj.bean.Members;

public interface IMembersDAO {
	/**
	1.	增加会员信息
	2.	修改会员信息
	3.	删除会员信息
	4.	查询会员信息

	5.	查询会员信息列表：可以根据会员编号、会员名查询会员信息列表。
	6.	消费1元积1分,如果达到5000积分,即是vip会员。
	*/
	
	/**
	 * 增加会员
	 */
	public boolean addMember(Members member);
	
	/**
	 * 删除会员，根据会员的ID编号
	 */
	public boolean deleteMember(Integer mid);
	
	/**
	 * 修改会员
	 */
	public boolean updateMember(Members member);
	
	/**
	 * 修改会员的积分，根据会员的ID编号
	 */
	public boolean updateMemberPoints(Integer points, int mid);
	
	/**
	 * 修改会员的类型，根据会员的ID编号
	 */
	public boolean updateMemberType(String type, int mid);
	
	/**
	 * 获得会员的个数
	 */
	public Integer getMembersCount();
	
	/**
	 * 查询所有会员信息
	 */
	public List<Members> queryAllMembers(int page, int count);
	
	/**
	 * 查询某个会员信息，根据会员编号
	 */
	public Members queryMemberById(Integer mid);
	
	/**
	 * 查询某个会员信息，根据会员名
	 */
	public Members queryMemberByName(String mname);
	
	/**
	 * 查询某种会员信息，根据会员类别
	 */
	public List<Members> queryMemberByType(String mtype);


}
