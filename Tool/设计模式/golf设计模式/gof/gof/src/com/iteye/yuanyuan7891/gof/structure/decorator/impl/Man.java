package com.iteye.yuanyuan7891.gof.structure.decorator.impl;

import com.iteye.yuanyuan7891.gof.structure.decorator.Person;
//ConcreteComponent 定义一个对象，可以给这个对象添加一些职责。

public class Man implements Person {

	public void eat() {
		System.out.println("男人在吃");
	}
}
