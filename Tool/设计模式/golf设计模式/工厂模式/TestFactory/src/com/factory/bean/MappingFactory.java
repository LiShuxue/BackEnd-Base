package com.factory.bean;

import java.util.HashMap;
import java.util.Map;

import com.factory.test.StudentWork;
import com.test.IWorkFactory;

public class MappingFactory {
	private static MappingFactory mapping = null;
	public Map<String, IWorkFactory> map = new HashMap<String, IWorkFactory>();

	private MappingFactory() {

	}

	// 1.Ҫ�����е���������󣩷ŵ�һ�������У�map��
	public static MappingFactory getMapping() {
		if (mapping == null) {
			mapping = new MappingFactory();
			mapping.map.put("user", new StudentWork());
		}
		return mapping;
	}

	// 2.����һ��������ȡ�����еĶ���

	public IWorkFactory getBean(String name) {
		return map.get(name);
	}

}
