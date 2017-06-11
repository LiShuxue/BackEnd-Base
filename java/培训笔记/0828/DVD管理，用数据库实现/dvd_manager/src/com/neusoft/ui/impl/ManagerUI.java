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
			//��ӭҳ��
			welcome();
			int code = this.inputCode(0, 6);
			switch(code){
			case 0:
				//���а�
				this.rank();
				break;
			case 1:
				//����dvd
				this.add();
				break;
			case 2:
				//�鿴dvd
				this.query();
				break;
			case 3:
				//ɾ��
				this.delete();
				break;
			case 4:
				//���
				this.borrow();
				break;
			case 5:
				//�黹
				this.returnUI();
				break;
			case 6:
				System.out.println("�ټ�~~");
				return;
			}
			System.out.print("����0����:");
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
		}while(true);
	}
	
	@Override
	public void welcome() {
		System.out.println("��ӭʹ������DVD������");
		System.out.println("-------------------------------------");
		System.out.println("0.������а�");
		System.out.println("1.����DVD");
		System.out.println("2.�鿴DVD");
		System.out.println("3.ɾ��DVD");
		System.out.println("4.���DVD");
		System.out.println("5.�黹DVD");
		System.out.println("6.�˳�");
		System.out.println("-------------------------------------");
	}

	@Override
	public void query() {
		System.out.println("---> �鿴DVD\n");
		System.out.println("���\t״̬\t����\t\t\t�������");
		List<DVD> dvd = service.queryDVDs();
		for(int i=0; i<dvd.size(); i++){
			System.out.print(dvd.get(i).getId() + "\t");
			System.out.print(dvd.get(i).getState()==1 ? "�ѽ��\t" : "�ɽ�\t");
			System.out.print("��" +dvd.get(i).getName()+ "��\t\t\t");
			//��������
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
		System.out.println("---> ����DVD\n");
		Scanner input = new Scanner(System.in);
		System.out.print("������DVD���ƣ�");
		String name = input.next();
		DVDContext.id++;
		DVD dvd = new DVD();
		dvd.setName(name);
		if(service.save(dvd)){
			System.out.println("������"+ name +"���ɹ�!");
		}else{
			System.out.println("��DVD�Ѵ��ڣ������ظ����ӣ�");
		}
		System.out.println("-------------------------------------");
	}

	@Override
	public void delete() {
		System.out.println("---> ɾ��DVD\n");
		Scanner input = new Scanner(System.in);
		System.out.print("������DVD���ƣ�");
		String name = input.next();
		int state = service.delete(name);
		switch(state){
			case 0:
				System.out.println("�޴�DVD���޷�ɾ��");
				break;
			case 1:
				System.out.println("��DVD�ѽ�����޷�ɾ��");
				break;
			case 2:
				System.out.println("��DVDɾ�������޷�ɾ��");
				break;
			case 3:
				System.out.println("ɾ��DVD�ɹ�");
				break;
			default:
				System.out.println("ϵͳ���ϣ��Ժ�����");
		}
		System.out.println("-------------------------------------");
	}

	@Override
	public void borrow() {
		System.out.println("---> ���DVD\n");
		Scanner input = new Scanner(System.in);
		System.out.print("������DVD���ƣ�");
		String name = input.next();
		do{
			try{
				System.out.print("������������(��-��-��)��");
				String strTime = input.next();
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				Date time = new Date(sf.parse(strTime).getTime());
				//�Ϸ�û�쳣�������������,��name��time����
				DVD dvd = new DVD();
				dvd.setName(name);
				dvd.setTime(new java.sql.Date(time.getTime()));
				
				if(service.borrowDVD(dvd)){
					System.out.println("����ɹ�");
				}else{
					System.out.println("���ʧ��,�ѱ�����򲻴���");
				}
				break;
			}catch(Exception e){
				System.out.println("���ڸ�ʽ�������");
				continue;
			}
		}while(true);
		System.out.println("-------------------------------------");
	}

	@Override
	public void returnUI() {
		System.out.println("---> �黹DVD\n");
		Scanner input = new Scanner(System.in);
		System.out.print("������DVD���ƣ�");
		String name = input.next();
		Date time = service.returnDVD(name);
		if (time != null) {
			System.out.println("�黹�ɹ�");
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("�������:" + sf.format(time));
			Date returnTime = new Date();
			System.out.println("�黹����:" + sf.format(returnTime));
			int price = (int)(((returnTime.getTime() - time.getTime()) / (1000 * 60 * 60 * 24)) * 2);
			System.out.println("Ӧ�����(Ԫ):" + price);
		}else{
			System.out.println("��DVD�����ڻ�δ���");
		}
		System.out.println("-------------------------------------");
	}

	@Override
	public void rank() {
		System.out.println("---> ���а�\n");
		System.out.println("-------------------------------------");
		System.out.println("����\t\t����");
		List<DVD> dvd = service.getDVDRank();
		if(dvd.size() < 1){
			System.out.println("�Բ�������DVD��Ϣ");
		}
		for(DVD d : dvd){
			System.out.println(d.getCount() +"\t\t" + d.getName());
		}
		System.out.println("-------------------------------------");
	}
	
	private int inputCode(int begin,int end){
		int code = 0;
		do{
			System.out.print("��ѡ��:");
			Scanner input = new Scanner(System.in);
			try{
				code = input.nextInt();
				if(code < begin || code > end){
					throw new Exception();
				}
				return code;
			}catch(Exception e){
				System.out.println("����������������룡\n");
				continue;
			}
		}while(true);
	}

	
	
	public static void main(String[] args) {
		System.out.println(new ManagerUI().inputCode(0,6));
	}

}
