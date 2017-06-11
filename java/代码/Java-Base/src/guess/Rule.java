package guess;

public class Rule {
	//游戏规则，判断输赢
	public void gameRule(int uchoice, int cchoice) {
		if (uchoice==cchoice){
			System.out.println("结果：平局！");	
		}
		
		else if (1==uchoice&&3==cchoice || 2==uchoice&&1==cchoice || 3==uchoice&&2==cchoice) {
			System.out.println("结果：你赢了，加一分！");
			Game.uScore++;
		}
		else {
			System.out.println("结果：抱歉，你输了，电脑加一分！！");
			Game.cScore++;
		}
	}

}
