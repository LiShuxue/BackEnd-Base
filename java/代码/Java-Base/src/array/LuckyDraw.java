package array;

import java.util.Scanner;

public class LuckyDraw {

	public static void main(String[] args) {
		String username ="";   //用户名
		String password ="";   //密码
		int cardNumber =0;     //卡号
		String flag = "";      //接收选择y/n
		
		while(true){          //while循环，控制每次选择菜单
			
			Scanner input = new Scanner(System.in);
			
			System.out.println();            //菜单
			System.out.println("****欢迎进入奖客富翁系统****");
			System.out.println("      1.注册");
			System.out.println("      2.登录");
			System.out.println("      3.抽奖");
			System.out.println("***********************");
			
			
			System.out.print("请选择菜单：");      //选择菜单
			int menu = input.nextInt();       //从键盘接收选择的菜单

			//选择菜单1，注册
			if (1 == menu) {                   
				System.out.println("【奖客富翁系统——注册】");
				System.out.println("请填写个人注册信息");
				
				System.out.print("用户名：");     //输入用户名，密码
				username = input.next();
				System.out.print("密    码：");
				password = input.next();
				
				cardNumber =(int) (Math.random()*9000)+1000; //随机生成一个4位数，作为卡号
				
				System.out.println("注册成功，请记好您的会员卡号:" + cardNumber);
				
				System.out.println();                       
				System.out.print("继续吗（y/n）?");  //选择继续系统或是退出系统
				flag = input.next();
				
				if("y".equals(flag)){            //根据用户的选择进行判断是否退出
					continue;
				}
				else{
					System.out.print("谢谢使用本系统，再见！");
					break;
				}	
			} 
			
			//选择菜单2，登录
			else if (2 == menu) {                 
				int a=0;
				System.out.println("【奖客富翁系统——登录】");
				
				for(a=0; a<3; a++){               //for循环3次，控制只有3次输入机会
					
					System.out.print("请输入用户名：");
					String username1 = input.next();
					System.out.print("请输入密码：");
					String password1 = input.next();
					
					//判断注册的用户名密码跟登录时的用户名密码是否一致，如果一致显示登录成功,否则提示重新输入
					if(username.equals(username1) && password.equals(password1)){
						System.out.println();
						System.out.println("登陆成功，欢迎您："+ username + "!");	
						break;
					}
					else {
						System.out.println("用户名或密码输入错误，请重新输入！");
						continue;
					}
				}
				
				if(a>=3){         //判断是否输入错误3次
					System.out.println("用户名或密码输入错误3次，登录失败！");
				}
				
				System.out.println();
				System.out.print("继续吗（y/n）?");   //选择继续系统或是退出系统
				flag = input.next();
				
				if("y".equals(flag)){              //根据用户的选择进行判断是否退出
					continue;
				}
				else{
					System.out.print("谢谢使用本系统，再见！");
					break;
				} 
			}
			
			//选择菜单3，抽奖	
			else if (3 == menu) {                    
				System.out.println("【奖客富翁系统——抽奖】");
				
				System.out.print("请输入您的卡号：");    //提示输入卡号
				int cardNumber1 = input.nextInt();
				
				int m[]=new int[5];                  //生成5个幸运数字，并存在数组里
				for(int j=0; j<=4; j++) {
					m[j]=(int) (Math.random()*9000)+1000; 
				}
				
				System.out.println("本日的幸运数字为：" +m[0]+"\t"+m[1]+"\t"+m[2]+"\t"+m[3]+"\t"+m[4] );
				
				if(cardNumber1==m[0] ||             //判断卡号是否跟5个幸运数字中的某一个相同，若相同则中奖
						cardNumber1==m[1] || 
						cardNumber1==m[2] || 
						cardNumber1==m[3] || 
						cardNumber1==m[4]) {
					System.out.print("恭喜您，中奖了！！！");	
				}
				else {
					System.out.println("抱歉，您不是本日的幸运会员！");
				}
				
				System.out.println();
				System.out.print("继续吗（y/n）?");   //选择继续系统或是退出系统
				flag = input.next();
				
				if("y".equals(flag)){              //根据用户的选择进行判断是否退出
					continue;
				}
				else{
					System.out.print("谢谢使用本系统，再见！");
					break;
				}
			} 
			
			//判断选择菜单的时候，如果输入的数字不是1或2或3，则需要重新输入
			else {
				System.out.println("编号有误，请重新输入");
				continue;
			}
		}
	}
}
	




