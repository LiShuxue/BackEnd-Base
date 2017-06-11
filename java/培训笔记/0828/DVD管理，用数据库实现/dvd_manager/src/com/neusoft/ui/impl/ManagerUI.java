package com.neusoft.ui.impl;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.neusoft.bean.DVD;
import com.neusoft.db.DVDContext;
import com.neusoft.service.IDVDService;
import com.neusoft.service.impl.DVDService;
import com.neusoft.ui.IManagerUI;

public class ManagerUI implements IManagerUI {

	private IDVDService service = new DVDService();
	
	@Override
	public void mainMenu() {
		do{
			//欢迎页面
			welcome();
			int code = this.inputCode(0, 6);
			switch(code){
			case 0:
				//排行榜
				this.rank();
				break;
			case 1:
				//新增dvd
				this.add();
				break;
			case 2:
				//查看dvd
				this.query();
				break;
			case 3:
				//删除
				this.delete();
				break;
			case 4:
				//借出
				this.borrow();
				break;
			case 5:
				//归还
				this.returnUI();
				break;
			case 6:
				System.out.println("再见~~");
				return;
			}
			System.out.print("输入0返回:");
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
		}while(true);
	}
	
	@Override
	public void welcome() {
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("-------------------------------------");
		System.out.println("0.借出排行榜");
		System.out.println("1.新增DVD");
		System.out.println("2.查看DVD");
		System.out.println("3.删除DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("6.退出");
		System.out.println("-------------------------------------");
	}

	@Override
	public void query() {
		System.out.println("---> 查看DVD\n");
		System.out.println("序号\t状态\t名称\t\t\t借出日期");
		List<DVD> dvd = service.queryDVDs();
		for(int i=0; i<dvd.size(); i++){
			System.out.print(dvd.get(i).getId() + "\t");
			System.out.print(dvd.get(i).getState()==1 ? "已借出\t" : "可借\t");
			System.out.print("《" +dvd.get(i).getName()+ "》\t\t\t");
			//处理日期
			Date time = dvd.get(i).getTime();
			if(time != null){
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				System.out.println(sf.format(time));
			}else{
				System.out.println();
			}
		}
		System.out.println("\n-------------------------------------");
	}

	@Override
	public void add() {
		System.out.println("---> 新增DVD\n");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入DVD名称：");
		String name = input.next();
		DVDContext.id++;
		DVD dvd = new DVD();
		dvd.setName(name);
		if(service.save(dvd)){
			System.out.println("新增《"+ name +"》成功!");
		}else{
			System.out.println("该DVD已存在！不能重复增加！");
		}
		System.out.println("-------------------------------------");
	}

	@Override
	public void delete() {
		System.out.println("---> 删除DVD\n");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入DVD名称：");
		String name = input.next();
		int state = service.delete(name);
		switch(state){
			case 0:
				System.out.println("无此DVD，无法删除");
				break;
			case 1:
				System.out.println("该DVD已借出，无法删除");
				break;
			case 2:
				System.out.println("该DVD删除过，无法删除");
				break;
			case 3:
				System.out.println("删除DVD成功");
				break;
			default:
				System.out.println("系统故障，稍后再试");
		}
		System.out.println("-------------------------------------");
	}

	@Override
	public void borrow() {
		System.out.println("---> 借出DVD\n");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入DVD名称：");
		String name = input.next();
		do{
			try{
				System.out.print("请输入借出日期(年-月-日)：");
				String strTime = input.next();
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				Date time = new Date(sf.parse(strTime).getTime());
				//上方没异常，就是输入对了,就name和time有用
				DVD dvd = new DVD();
				dvd.setName(name);
				dvd.setTime(new java.sql.Date(time.getTime()));
				
				if(service.borrowDVD(dvd)){
					System.out.println("借出成功");
				}else{
					System.out.println("借出失败,已被借出或不存在");
				}
				break;
			}catch(Exception e){
				System.out.println("日期格式输入错误");
				continue;
			}
		}while(true);
		System.out.println("-------------------------------------");
	}

	@Override
	public void returnUI() {
		System.out.println("---> 归还DVD\n");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入DVD名称：");
		String name = input.next();
		Date time = service.returnDVD(name);
		if (time != null) {
			System.out.println("归还成功");
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("借出日期:" + sf.format(time));
			Date returnTime = new Date();
			System.out.println("归还日期:" + sf.format(returnTime));
			int price = (int)(((returnTime.getTime() - time.getTime()) / (1000 * 60 * 60 * 24)) * 2);
			System.out.println("应付租金(元):" + price);
		}else{
			System.out.println("该DVD不存在或并未借出");
		}
		System.out.println("-------------------------------------");
	}

	@Override
	public void rank() {
		System.out.println("---> 排行榜\n");
		System.out.println("-------------------------------------");
		System.out.println("次数\t\t名称");
		List<DVD> dvd = service.getDVDRank();
		if(dvd.size() < 1){
			System.out.println("对不起，暂无DVD信息");
		}
		for(DVD d : dvd){
			System.out.println(d.getCount() +"\t\t" + d.getName());
		}
		System.out.println("-------------------------------------");
	}
	
	private int inputCode(int begin,int end){
		int code = 0;
		do{
			System.out.print("请选择:");
			Scanner input = new Scanner(System.in);
			try{
				code = input.nextInt();
				if(code < begin || code > end){
					throw new Exception();
				}
				return code;
			}catch(Exception e){
				System.out.println("输出错误，请重新输入！\n");
				continue;
			}
		}while(true);
	}

	
	
	public static void main(String[] args) {
		System.out.println(new ManagerUI().inputCode(0,6));
	}

}
