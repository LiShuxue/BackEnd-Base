package com.zyw.ioc;
/**
 * 
 * �Ͳ�usb
 *
 */
public class UsbDiskWriter implements IDeviceWriter {

	@Override
	public void saveToDevice() {
		System.out.println("usb���ݴ洢");
	}

}
