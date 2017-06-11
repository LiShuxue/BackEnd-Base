package com.util;

import java.util.HashMap;
import java.util.Map;

import com.factory.test.StudentWork;
import com.test.IWorkFactory;

public class MappingFactory {
	private static MappingFactory mapping = null;

	private MappingFactory() {

	}

	public Map<String, IWorkFactory> map = new HashMap<String, IWorkFactory>();

	public IWorkFactory getBean(String name) {
		return map.get(name);
	}

	public static MappingFactory getMapping() {
		if (mapping == null) {
			mapping = new MappingFactory();
			mapping.map.put("user", new StudentWork());
		}
		return mapping;
	}

}
