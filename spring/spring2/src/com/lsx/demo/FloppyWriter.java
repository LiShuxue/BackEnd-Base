package com.lsx.demo;
/**
 * 继承接口，实现软盘存储
 *
 */
public class FloppyWriter implements IDeviceWriter {

	@Override
	public void saveToDevice() {
		System.out.println("软盘保存");
	}

}
