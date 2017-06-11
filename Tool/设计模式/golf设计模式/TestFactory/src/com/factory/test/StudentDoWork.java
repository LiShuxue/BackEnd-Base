package com.factory.test;

import com.test.Work;

public class StudentDoWork implements Work{

	@Override
	public void doWork() {
		System.out.println("学生完成作业");	
	}
}
