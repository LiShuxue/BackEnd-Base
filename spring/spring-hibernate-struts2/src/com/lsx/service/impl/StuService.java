package com.lsx.service.impl;

import com.lsx.bean.Stu;
import com.lsx.dao.IStuDAO;
import com.lsx.service.IStuService;

public class StuService implements IStuService {
	
	private IStuDAO studao;

	/**
	 * 你的业务方法，如果存在较多的增删改，这个方法必须切入事务
	 */
	@Override
	public boolean addStu(Stu stu) {
		if( studao.findStuByName(stu.getSname()) == null) {
			studao.addStu(stu);
			return true;
		}
		return false;
	}
	
	public IStuDAO getStudao() {
		return studao;
	}
	
	public void setStudao(IStuDAO studao) {
		this.studao = studao;
	}

}
