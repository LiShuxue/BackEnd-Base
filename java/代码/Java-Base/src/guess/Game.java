package guess;

import java.util.Scanner;


//������
public class Game {
	
	String cName="";    //��������
	String uName="";    //�û�����
	int count=0;        //��ս����
	static int cScore=0;//���Է���
	static int uScore=0;//�û�����
	int choice = 0;     //�û���ȭʱ��ѡ��
	
	Computer co = new Computer();        //������Զ��� 
	User user = new User();              //�����û�����
	Rule rule = new Rule();              //����һ���������

	Scanner input = new Scanner(System.in);
	
	//��ʼ����Ϸ
	public void initGame() {  
		System.out.println("------��  ӭ  ��  ��  ��  Ϸ  ��  ��------");  //����Ч��
		System.out.println("");
		System.out.println("");
		System.out.println("      **************          ");
		System.out.println("      **��ȭ\t��Ϸ**");
		System.out.println("      **************          ");
		System.out.println();
		System.out.print("�Ƿ�ʼ��Ϸ��y/n����");

		String isBeginGame = input.next();
		if(isBeginGame.equals("y")) {
			startGame();
		}
		else {
			score();
			endGame();
			
		}
	}
	
	//��ʼ��Ϸ
	public void startGame() {
		
		System.out.println("");
		System.out.println("��ȭ����1.����    2.ʯͷ    3.��");
		System.out.println();
		System.out.print("��ѡ��Է���ɫ��1.����    2.��Ȩ    3.�ܲ٣�:"); //ѡ�����
		int computerNum = input.nextInt();
		cName = co.getComputerName(computerNum);               //�õ����Ե�����
		
		if(cName==null){
			reInputComputerRole();
		}
				                     		
		System.out.print("���������������");                      //�����������
		uName = input.next();
		
		System.out.println();
		System.out.println(uName + "\tVS\t" + cName);          //��ʾ��ս˫��
		System.out.println();
		
		System.out.print("Ҫ��ʼ��ȭ�𣿣�y/n����");                //�ж��Ƿ�ʼ
		String isBegin = input.next();
		
		if(isBegin.equals("y")){ 
			
			System.out.print("���ȭ��1.����    2.ʯͷ    3.������");    //��ҳ�ȭ
			choice = input.nextInt();
			
			if(user.getUserChoice(choice)==null){
				reInputUserChoice();
			}
	
			System.out.println("���ȭ��" + user.getUserChoice(choice));       //˫����ȭ�����жϽ��
			System.out.println(cName + "��ȭ��" + co.getComputerChoice());
			
			rule.gameRule(choice, co.cchoice);                 //�жϽ��
			count++;                                           //��ս������1
			
			System.out.println();
			System.out.print("�Ƿ�ʼ��һ�֣���y/n����");          //�ж��Ƿ�ʼ��һ��
			String isContinue = input.next();
			
			if(isContinue.equals("y")) {
				continueGame();
			}
			else {
				score();                                      //�жϵ÷�
			}
		}
		else {
			endGame();
		}
		
	}
			
	//������һ����Ϸ
	public void continueGame() {

		System.out.print("���ȭ��1.����    2.ʯͷ    3.������");      //��ҳ�ȭ
		choice = input.nextInt();
		if(user.getUserChoice(choice)==null){
			reInputUserChoice();
		}
		
		System.out.println("���ȭ��" + user.getUserChoice(choice));       //˫����ȭ�����жϽ��
		System.out.println(cName + "��ȭ��" + co.getComputerChoice());
		
		rule.gameRule(choice, co.cchoice);                  //�жϽ��
		count++;                                            //��ս������1
		
		System.out.println();
		System.out.print("�Ƿ�ʼ��һ�֣���y/n����");           //�ж��Ƿ�ʼ��һ��
		String isContinue = input.next();
		if("y".equals(isContinue)) {
			continueGame();
		}
		else {
			score();                                       //�жϵ÷�
		}
	}
	
	//ѡ���ɫ�����ʱ������ѡ��
	public void reInputComputerRole() {
		System.out.println("ѡ���ɫ����������ѡ��");
		System.out.println();
		System.out.print("��ѡ��Է���ɫ��1.����    2.��Ȩ    3.�ܲ٣�:");//ѡ�����
		int computerNum = input.nextInt();

		cName = co.getComputerName(computerNum);           //�õ����Ե�����
		
		if(cName==null){
			reInputComputerRole();
		}
	}
	
	//���ȭѡ������ʱ�����³�ȭ
	public void reInputUserChoice() {
		System.out.println("��ĳ�ȭ��Ч�������³�ȭ��");
		System.out.println();
		System.out.print("���ȭ��1.����    2.ʯͷ    3.������");    //��ҳ�ȭ
		choice = input.nextInt();
	
		if(user.getUserChoice(choice)==null){
			reInputUserChoice();
		}
		
	}
	
	//������Ϸ
	public void endGame() {
		System.out.println("��ӭ�´����棡");
	}
	
	//�жϲ���ʾ˫���÷�
	public void score() {
		System.out.println();
		System.out.println("-------------------------");
		System.out.println(uName + "\tVS\t" + cName);      //��ʾ��ս˫��
		System.out.println("��ս������" + count);            //��ʾ��ս����
		System.out.println("����\t�÷�");
		System.out.println(uName + "\t" + uScore);
		System.out.println(cName + "\t" + cScore);
		System.out.println("-------------------------");
	}
	
	//���������������
	public static void main(String[] args) {   
		Game ga = new Game();                             //ʵ��������
		ga.initGame();                                    //���ó�ʼ����������ʼ��Ϸ
	
	}
}
