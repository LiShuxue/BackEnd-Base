package guess;

public class Rule {
	//��Ϸ�����ж���Ӯ
	public void gameRule(int uchoice, int cchoice) {
		if (uchoice==cchoice){
			System.out.println("�����ƽ�֣�");	
		}
		
		else if (1==uchoice&&3==cchoice || 2==uchoice&&1==cchoice || 3==uchoice&&2==cchoice) {
			System.out.println("�������Ӯ�ˣ���һ�֣�");
			Game.uScore++;
		}
		else {
			System.out.println("�������Ǹ�������ˣ����Լ�һ�֣���");
			Game.cScore++;
		}
	}

}
