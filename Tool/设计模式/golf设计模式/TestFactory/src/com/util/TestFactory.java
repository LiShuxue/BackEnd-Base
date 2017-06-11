package com.util;

import com.test.IWorkFactory;

public class TestFactory {
	public static void main(String[] args) {
		MappingFactory mf = MappingFactory.getMapping();
		IWorkFactory iw = mf.getBean("user");
		iw.getWork().doWork();
	}
}
