package guess;

public class User {
	
	//ȡ���û��Ĳ�ȭ
	public  String getUserChoice(int uchoice) {
		if(1==uchoice){
			return "����";
		}
		else if(2==uchoice) {
			return "ʯͷ";
		}
		else if(3==uchoice) {
			return "��";
		}
		else {
			return null;
		}
		
	}
	
}
