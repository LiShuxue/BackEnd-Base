package com.lsx.demo;

/**
 * 生产音乐播放器的工厂
 */
public class MusicBoxFactory {
	//静态方法
	public static IMusicBox createMusicBox(){
		//返回的是匿名内部类，即返回一个音乐播放器
		return new IMusicBox() {
			@Override
			public void play() {
				System.out.println("播放摇滚乐...");
			}
			
		};
		
	}
	
	/*public static void main(String[] args) {
		IMusicBox box = MusicBoxFactory.createMusicBox();
		box.play();
	}*/
	
}


