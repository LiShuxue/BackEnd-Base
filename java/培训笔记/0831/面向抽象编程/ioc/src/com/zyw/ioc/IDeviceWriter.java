package com.zyw.ioc;
/**
 * 低层所需要实现的接口（软盘，usb）
 * 高层也会依赖这个接口
 */
public interface IDeviceWriter {

	/**
	 * 实现该方法进行数据存取
	 */
	public void saveToDevice();
}
