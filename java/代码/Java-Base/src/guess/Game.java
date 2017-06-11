package guess;

import java.util.Scanner;


//测试类
public class Game {
	
	String cName="";    //电脑名称
	String uName="";    //用户名称
	int count=0;        //对战次数
	static int cScore=0;//电脑分数
	static int uScore=0;//用户分数
	int choice = 0;     //用户出拳时的选择
	
	Computer co = new Computer();        //构造电脑对象 
	User user = new User();              //构造用户对象
	Rule rule = new Rule();              //构造一个规则对象

	Scanner input = new Scanner(System.in);
	
	//初始化游戏
	public void initGame() {  
		System.out.println("------欢  迎  进  入  游  戏  世  界------");  //开场效果
		System.out.println("");
		System.out.println("");
		System.out.println("      **************          ");
		System.out.println("      **猜拳\t游戏**");
		System.out.println("      **************          ");
		System.out.println();
		System.out.print("是否开始游戏（y/n）：");

		String isBeginGame = input.next();
		if(isBeginGame.equals("y")) {
			startGame();
		}
		else {
			score();
			endGame();
			
		}
	}
	
	//开始游戏
	public void startGame() {
		
		System.out.println("");
		System.out.println("出拳规则：1.剪刀    2.石头    3.布");
		System.out.println();
		System.out.print("请选择对方角色（1.刘备    2.孙权    3.曹操）:"); //选择电脑
		int computerNum = input.nextInt();
		cName = co.getComputerName(computerNum);               //得到电脑的姓名
		
		if(cName==null){
			reInputComputerRole();
		}
				                     		
		System.out.print("请输入你的姓名：");                      //输入玩家姓名
		uName = input.next();
		
		System.out.println();
		System.out.println(uName + "\tVS\t" + cName);          //显示对战双方
		System.out.println();
		
		System.out.print("要开始猜拳吗？（y/n）：");                //判断是否开始
		String isBegin = input.next();
		
		if(isBegin.equals("y")){ 
			
			System.out.print("请出拳（1.剪刀    2.石头    3.布）：");    //玩家出拳
			choice = input.nextInt();
			
			if(user.getUserChoice(choice)==null){
				reInputUserChoice();
			}
	
			System.out.println("你出拳：" + user.getUserChoice(choice));       //双方出拳，并判断结果
			System.out.println(cName + "出拳：" + co.getComputerChoice());
			
			rule.gameRule(choice, co.cchoice);                 //判断结果
			count++;                                           //对战次数加1
			
			System.out.println();
			System.out.print("是否开始下一轮？（y/n）：");          //判断是否开始下一轮
			String isContinue = input.next();
			
			if(isContinue.equals("y")) {
				continueGame();
			}
			else {
				score();                                      //判断得分
			}
		}
		else {
			endGame();
		}
		
	}
			
	//继续下一轮游戏
	public void continueGame() {

		System.out.print("请出拳（1.剪刀    2.石头    3.布）：");      //玩家出拳
		choice = input.nextInt();
		if(user.getUserChoice(choice)==null){
			reInputUserChoice();
		}
		
		System.out.println("你出拳：" + user.getUserChoice(choice));       //双方出拳，并判断结果
		System.out.println(cName + "出拳：" + co.getComputerChoice());
		
		rule.gameRule(choice, co.cchoice);                  //判断结果
		count++;                                            //对战次数加1
		
		System.out.println();
		System.out.print("是否开始下一轮？（y/n）：");           //判断是否开始下一轮
		String isContinue = input.next();
		if("y".equals(isContinue)) {
			continueGame();
		}
		else {
			score();                                       //判断得分
		}
	}
	
	//选择角色错误的时候，重新选择
	public void reInputComputerRole() {
		System.out.println("选择角色错误，请重新选择！");
		System.out.println();
		System.out.print("请选择对方角色（1.刘备    2.孙权    3.曹操）:");//选择电脑
		int computerNum = input.nextInt();

		cName = co.getComputerName(computerNum);           //得到电脑的姓名
		
		if(cName==null){
			reInputComputerRole();
		}
	}
	
	//你出拳选择错误的时候，重新出拳
	public void reInputUserChoice() {
		System.out.println("你的出拳无效，请重新出拳！");
		System.out.println();
		System.out.print("请出拳（1.剪刀    2.石头    3.布）：");    //玩家出拳
		choice = input.nextInt();
	
		if(user.getUserChoice(choice)==null){
			reInputUserChoice();
		}
		
	}
	
	//结束游戏
	public void endGame() {
		System.out.println("欢迎下次再玩！");
	}
	
	//判断并显示双方得分
	public void score() {
		System.out.println();
		System.out.println("-------------------------");
		System.out.println(uName + "\tVS\t" + cName);      //显示对战双方
		System.out.println("对战次数：" + count);            //显示对战次数
		System.out.println("姓名\t得分");
		System.out.println(uName + "\t" + uScore);
		System.out.println(cName + "\t" + cScore);
		System.out.println("-------------------------");
	}
	
	//主方法，程序入口
	public static void main(String[] args) {   
		Game ga = new Game();                             //实例化对象
		ga.initGame();                                    //调用初始化方法，开始游戏
	
	}
}
