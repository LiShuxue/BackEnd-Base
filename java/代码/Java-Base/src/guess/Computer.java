package guess;

import java.util.Random;

public class Computer {
	
	static int cchoice=0; //电脑的出拳的选择
	
	//取得电脑名称
	public String getComputerName(int cnum) {
		if(1==cnum){
			return "刘备";
		}
		else if(2==cnum) {
			return "孙权";
		}
		else if(3==cnum) {
			return "曹操";
		}
		else {
			return null;
			
		}
	}
	
	//取得电脑的出拳
	public String getComputerChoice() {
		cchoice = (int) (Math.random()*3)+1;
//		Random random = new Random();
//		cchoice = random.nextInt(3)+1;
		if(1==cchoice){
			return "剪刀";
		}
		else if(2==cchoice) {
			return "石头";
		}
		else if(3==cchoice) {
			return "布";
		}
		else {
			return null;
		}
	}

}
