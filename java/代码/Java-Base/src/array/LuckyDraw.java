package array;

import java.util.Scanner;

public class LuckyDraw {

	public static void main(String[] args) {
		String username ="";   //�û���
		String password ="";   //����
		int cardNumber =0;     //����
		String flag = "";      //����ѡ��y/n
		
		while(true){          //whileѭ��������ÿ��ѡ��˵�
			
			Scanner input = new Scanner(System.in);
			
			System.out.println();            //�˵�
			System.out.println("****��ӭ���뽱�͸���ϵͳ****");
			System.out.println("      1.ע��");
			System.out.println("      2.��¼");
			System.out.println("      3.�齱");
			System.out.println("***********************");
			
			
			System.out.print("��ѡ��˵���");      //ѡ��˵�
			int menu = input.nextInt();       //�Ӽ��̽���ѡ��Ĳ˵�

			//ѡ��˵�1��ע��
			if (1 == menu) {                   
				System.out.println("�����͸���ϵͳ����ע�᡿");
				System.out.println("����д����ע����Ϣ");
				
				System.out.print("�û�����");     //�����û���������
				username = input.next();
				System.out.print("��    �룺");
				password = input.next();
				
				cardNumber =(int) (Math.random()*9000)+1000; //�������һ��4λ������Ϊ����
				
				System.out.println("ע��ɹ�����Ǻ����Ļ�Ա����:" + cardNumber);
				
				System.out.println();                       
				System.out.print("������y/n��?");  //ѡ�����ϵͳ�����˳�ϵͳ
				flag = input.next();
				
				if("y".equals(flag)){            //�����û���ѡ������ж��Ƿ��˳�
					continue;
				}
				else{
					System.out.print("ллʹ�ñ�ϵͳ���ټ���");
					break;
				}	
			} 
			
			//ѡ��˵�2����¼
			else if (2 == menu) {                 
				int a=0;
				System.out.println("�����͸���ϵͳ������¼��");
				
				for(a=0; a<3; a++){               //forѭ��3�Σ�����ֻ��3���������
					
					System.out.print("�������û�����");
					String username1 = input.next();
					System.out.print("���������룺");
					String password1 = input.next();
					
					//�ж�ע����û����������¼ʱ���û��������Ƿ�һ�£����һ����ʾ��¼�ɹ�,������ʾ��������
					if(username.equals(username1) && password.equals(password1)){
						System.out.println();
						System.out.println("��½�ɹ�����ӭ����"+ username + "!");	
						break;
					}
					else {
						System.out.println("�û�������������������������룡");
						continue;
					}
				}
				
				if(a>=3){         //�ж��Ƿ��������3��
					System.out.println("�û����������������3�Σ���¼ʧ�ܣ�");
				}
				
				System.out.println();
				System.out.print("������y/n��?");   //ѡ�����ϵͳ�����˳�ϵͳ
				flag = input.next();
				
				if("y".equals(flag)){              //�����û���ѡ������ж��Ƿ��˳�
					continue;
				}
				else{
					System.out.print("ллʹ�ñ�ϵͳ���ټ���");
					break;
				} 
			}
			
			//ѡ��˵�3���齱	
			else if (3 == menu) {                    
				System.out.println("�����͸���ϵͳ�����齱��");
				
				System.out.print("���������Ŀ��ţ�");    //��ʾ���뿨��
				int cardNumber1 = input.nextInt();
				
				int m[]=new int[5];                  //����5���������֣�������������
				for(int j=0; j<=4; j++) {
					m[j]=(int) (Math.random()*9000)+1000; 
				}
				
				System.out.println("���յ���������Ϊ��" +m[0]+"\t"+m[1]+"\t"+m[2]+"\t"+m[3]+"\t"+m[4] );
				
				if(cardNumber1==m[0] ||             //�жϿ����Ƿ��5�����������е�ĳһ����ͬ������ͬ���н�
						cardNumber1==m[1] || 
						cardNumber1==m[2] || 
						cardNumber1==m[3] || 
						cardNumber1==m[4]) {
					System.out.print("��ϲ�����н��ˣ�����");	
				}
				else {
					System.out.println("��Ǹ�������Ǳ��յ����˻�Ա��");
				}
				
				System.out.println();
				System.out.print("������y/n��?");   //ѡ�����ϵͳ�����˳�ϵͳ
				flag = input.next();
				
				if("y".equals(flag)){              //�����û���ѡ������ж��Ƿ��˳�
					continue;
				}
				else{
					System.out.print("ллʹ�ñ�ϵͳ���ټ���");
					break;
				}
			} 
			
			//�ж�ѡ��˵���ʱ�������������ֲ���1��2��3������Ҫ��������
			else {
				System.out.println("�����������������");
				continue;
			}
		}
	}
}
	




