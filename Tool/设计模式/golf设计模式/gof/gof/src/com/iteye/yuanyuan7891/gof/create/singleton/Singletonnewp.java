package com.iteye.yuanyuan7891.gof.create.singleton;

public class Singletonnewp {
	private static Singletonnewp _instance = new Singletonnewp();

	public static Singletonnewp getInstance() {
		return _instance;
	}
}