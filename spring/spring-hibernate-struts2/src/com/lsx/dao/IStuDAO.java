package com.lsx.dao;

import com.lsx.bean.Stu;

public interface IStuDAO {

	
	public Stu findStuByName(String name);
	
	public void addStu(Stu stu);
}
