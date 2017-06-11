package com.zyw.ioc;
/**
 * 
 * µÕ≤„»Ì≈Ã
 *
 */
public class FloppyWriter implements IDeviceWriter{

	@Override
	public void saveToDevice() {
		System.out.println("»Ì≈Ã±£¥Ê ˝æ›");
	}

}
