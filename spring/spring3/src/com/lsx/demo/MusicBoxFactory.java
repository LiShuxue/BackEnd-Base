package com.lsx.demo;

/**
 * �������ֲ������Ĺ���
 */
public class MusicBoxFactory {
	//��̬����
	public static IMusicBox createMusicBox(){
		//���ص��������ڲ��࣬������һ�����ֲ�����
		return new IMusicBox() {
			@Override
			public void play() {
				System.out.println("����ҡ����...");
			}
			
		};
		
	}
	
	/*public static void main(String[] args) {
		IMusicBox box = MusicBoxFactory.createMusicBox();
		box.play();
	}*/
	
}


