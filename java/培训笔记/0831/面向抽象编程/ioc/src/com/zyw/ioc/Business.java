package com.zyw.ioc;
/**
 * 
 * �߲�ҵ���߼�
 *
 */
public class Business {
	//ҵ�������˳���
	private IDeviceWriter writer;
	//ͨ��set������ֵ�����豸�����̣�usb��
	public void setWriter(IDeviceWriter writer) {
		this.writer = writer;
	}
	//ҵ�����Ӿ����豸��ʵ�����ݴ洢
	public void save(){
		this.writer.saveToDevice();
	}
}
