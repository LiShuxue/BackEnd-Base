package guess;

import java.util.Random;

public class Computer {
	
	static int cchoice=0; //���Եĳ�ȭ��ѡ��
	
	//ȡ�õ�������
	public String getComputerName(int cnum) {
		if(1==cnum){
			return "����";
		}
		else if(2==cnum) {
			return "��Ȩ";
		}
		else if(3==cnum) {
			return "�ܲ�";
		}
		else {
			return null;
			
		}
	}
	
	//ȡ�õ��Եĳ�ȭ
	public String getComputerChoice() {
		cchoice = (int) (Math.random()*3)+1;
//		Random random = new Random();
//		cchoice = random.nextInt(3)+1;
		if(1==cchoice){
			return "����";
		}
		else if(2==cchoice) {
			return "ʯͷ";
		}
		else if(3==cchoice) {
			return "��";
		}
		else {
			return null;
		}
	}

}
