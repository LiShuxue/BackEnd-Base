package com.zyw.ioc;
/**
 * 
 * µÍ²ãusb
 *
 */
public class UsbDiskWriter implements IDeviceWriter {

	@Override
	public void saveToDevice() {
		System.out.println("usbÊý¾Ý´æ´¢");
	}

}
