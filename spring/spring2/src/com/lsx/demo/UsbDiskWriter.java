package com.lsx.demo;

/**
 * 继承接口，实现USB存储
 *
 */
public class UsbDiskWriter implements IDeviceWriter {

	@Override
	public void saveToDevice() {
		System.out.println("usb存储");
	}

}
