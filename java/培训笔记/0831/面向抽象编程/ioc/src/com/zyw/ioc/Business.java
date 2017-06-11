package com.zyw.ioc;
/**
 * 
 * 高层业务逻辑
 *
 */
public class Business {
	//业务依赖了抽象
	private IDeviceWriter writer;
	//通过set方法赋值具体设备（软盘，usb）
	public void setWriter(IDeviceWriter writer) {
		this.writer = writer;
	}
	//业务无视具体设备，实现数据存储
	public void save(){
		this.writer.saveToDevice();
	}
}
