package com.lsx.demo;

/**
 * �̳нӿڣ�ʵ��USB�洢
 *
 */
public class UsbDiskWriter implements IDeviceWriter {

	@Override
	public void saveToDevice() {
		System.out.println("usb�洢");
	}

}
