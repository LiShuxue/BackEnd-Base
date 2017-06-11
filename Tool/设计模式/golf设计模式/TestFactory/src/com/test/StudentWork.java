package com.test;

import com.factory.test.StudentDoWork;

public class StudentWork implements IWorkFactory{

	@Override
	public Work getWork() {
		
		return new StudentDoWork();
	}
}
