package com.zyw.ioc;
/**
 * 
 * �Ͳ�����
 *
 */
public class FloppyWriter implements IDeviceWriter{

	@Override
	public void saveToDevice() {
		System.out.println("���̱�������");
	}

}
