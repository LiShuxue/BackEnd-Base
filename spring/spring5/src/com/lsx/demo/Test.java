package com.lsx.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentBean bean = (StudentBean)ac.getBean("studentBean");
		
		String[] stuArray = bean.getStuArray();
		System.out.println(Arrays.toString(stuArray));
		System.out.println("--------------------------");
		
		Student[] stus = bean.getObjArray();
		System.out.println(Arrays.toString(stus));
		System.out.println("-------------------------");
		
		List stuList = bean.getStuList();
		for(int i=0; i<stuList.size(); i++){
			System.out.println(stuList.get(i));
		}
		System.out.println("--------------------------");
		
		Map map = bean.getStuMap();
		System.out.println(map.get("k1"));
		System.out.println(map.get("k2"));
		System.out.println(map.get("k3"));
		System.out.println(map.get("k4"));
	
	}

}
