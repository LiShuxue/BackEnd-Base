package com.lsx.demo;
/**
 *�߲��ҵ���߼�
 *
 */
public class Service {
	
	/*
	 * DI ����ע��(�����Ը�ֵ)������������Ҫͨ��spring�����Ͳ�ģ��ע�뵽�߲�ģ��(��ǰ��ҵ����)Service
	 * Ҳ���ǽ�Usb/���� ��ʵ����ע�뵽 writer �� 
	 * ��������������usb�����̶�ʵ����IDeviceWriter�ӿڣ�
	 */
	private IDeviceWriter writer;

	//����Ҫget������������������ֵ����Ϊ��������spring�����������ļ��и�ֵ
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
