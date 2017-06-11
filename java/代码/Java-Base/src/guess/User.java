package guess;

public class User {
	
	//取得用户的猜拳
	public  String getUserChoice(int uchoice) {
		if(1==uchoice){
			return "剪刀";
		}
		else if(2==uchoice) {
			return "石头";
		}
		else if(3==uchoice) {
			return "布";
		}
		else {
			return null;
		}
		
	}
	
}
