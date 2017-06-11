package com.ysj.service.impl;

import java.util.List;

import com.ysj.bean.Members;
import com.ysj.dao.IMembersDAO;
import com.ysj.dao.impl.MembersDAO;
import com.ysj.service.IMembersService;

public class MembersService implements IMembersService {

	IMembersDAO dao = new MembersDAO();
	
	@Override
	public boolean addMember(Members member) {
		return dao.addMember(member);
	}

	@Override
	public boolean deleteMember(Integer mid) {
		return dao.deleteMember(mid);
	}

	@Override
	public boolean updateMember(Members member) {
		return dao.updateMember(member);
	}
	
	@Override
	public Integer getMemberPoints(Integer mid) {
		return dao.queryMemberById(mid).getMpoints();
	}

	@Override
	public boolean updateMemberPoints(Integer points, int mid) {
		return dao.updateMemberPoints(points, mid);
	}

	@Override
	public boolean updateMemberType(String type, int mid) {
		return dao.updateMemberType(type, mid);
	}
	
	@Override
	public Integer getMembersCount() {
		return dao.getMembersCount();
	}

	@Override
	public List<Members> queryAllMembers(int page, int count) {
		return dao.queryAllMembers(page, count);
	}

	@Override
	public Members queryMemberById(Integer mid) {
		return dao.queryMemberById(mid);
	}

	@Override
	public Members queryMemberByName(String mname) {
		return dao.queryMemberByName(mname);
	}

	@Override
	public List<Members> queryMemberByType(String mtype) {
		return dao.queryMemberByType(mtype);
	}

}
