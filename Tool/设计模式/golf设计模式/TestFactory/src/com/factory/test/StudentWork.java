package com.factory.test;

import com.test.IWorkFactory;
import com.test.Work;

public class StudentWork implements IWorkFactory{

	@Override
	public Work getWork() {
		
		return new StudentDoWork();
	}
}
