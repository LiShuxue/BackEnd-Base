package com.zyw.ioc;

public class Test {

	public static void main(String[] args) {
		/*Business bus = new Business();
		
		bus.setWriter(new FloppyWriter());
		bus.save();
		
		bus.setWriter(new UsbDiskWriter());
		bus.save();*/
		
		try {
			//已经建立了依赖关系，（properties）
			Business business = BusinessFactory.getInstance().getBusiness();
			business.save();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
