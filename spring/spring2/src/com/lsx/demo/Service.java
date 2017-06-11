package com.lsx.demo;
/**
 *高层的业务逻辑
 *
 */
public class Service {
	
	/*
	 * DI 依赖注入(给属性赋值)，下面我们需要通过spring，将低层模块注入到高层模块(当前的业务中)Service
	 * 也就是将Usb/软盘 的实例，注入到 writer 中 
	 * （你必须清楚的是usb和软盘都实现了IDeviceWriter接口）
	 */
	private IDeviceWriter writer;

	//不需要get方法来设置这个对象的值，因为我们用了spring，会在配置文件中赋值
	/*public IDeviceWriter2 getWriter() {
		return writer;
	}*/

	public void setWriter(IDeviceWriter writer) {
		this.writer = writer;
	}
	
	public void save(){
		writer.saveToDevice();
	}
}
