package com.zyw.ioc;

public class Test {

	public static void main(String[] args) {
		/*Business bus = new Business();
		
		bus.setWriter(new FloppyWriter());
		bus.save();
		
		bus.setWriter(new UsbDiskWriter());
		bus.save();*/
		
		try {
			//�Ѿ�������������ϵ����properties��
			Business business = BusinessFactory.getInstance().getBusiness();
			business.save();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
