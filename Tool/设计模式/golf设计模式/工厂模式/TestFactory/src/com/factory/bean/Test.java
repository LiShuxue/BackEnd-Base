package com.factory.bean;

import com.test.IWorkFactory;

public class Test {
	public static void main(String[] args) {
		MappingFactory mf = MappingFactory.getMapping();
		IWorkFactory iw = mf.getBean("user");
		iw.getWork().doWork();
	}
}
