package com.neusoft.dao.impl;

import com.neusoft.bean.DVD;
import com.neusoft.dao.IDVDDAO;
import com.neusoft.db.DVDContext;
/**
 * DAO ֻ������DVDContext�е�������� �������ᱻServiceȥ����
 *
 */
public class DVDDAO implements IDVDDAO {

	@Override
	public boolean addDVD(DVD dvd) {
		/*
		 * ѭ��100���ȵ�dvd���飬���ĳ��λ��û��Ԫ�أ��ͽ��µ�dvd����λ����
		 */
		for(int i=0;  i<DVDContext.dvds.length; i++){
			if(DVDContext.dvds[i] == null){
				DVDContext.dvds[i] = dvd;
				return true;
			}
		}
		return false;
	}

	@Override
	public DVD findDVDByName(String name) {
		/*
		 *	�ڲ�Ϊnull��dvd��Ѱ����ͬ���ֵ�dvd������ҵ����������ĸ��� 
		 */
		for(DVD d : DVDContext.dvds){
			if(d != null && d.getName().equals(name)){
				try {
					return d.clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
		}
		return null;	//����û�ҵ�
	}

	@Override
	public DVD[] findDVDs() {
		//ͳ�Ƴ���Ϊ�պ�û��ɾ����dvd
		int count = 0;
		for (DVD d : DVDContext.dvds) {
			if(d != null && !d.isDel()){
				count++;
			}
		}
		//���������飬��������Ч��dvd��¡��������
		//����j��0��ʼ��ÿ�ҵ�һ����Ϊ������dvd���±꣬�ټ�1����ʾ��һ���±�
		DVD[] dvd = new DVD[count];
		for (int i=0,j=0; i<DVDContext.dvds.length; i++) {
			if(DVDContext.dvds[i] != null && !DVDContext.dvds[i].isDel()){
				try {
					dvd[j] = DVDContext.dvds[i].clone();
					j++;
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
		}
		return dvd;	//��������ûɾ����dvd
	}

	@Override
	public boolean deleteDVD(String name) {
		/*
		 * ѭ��dvd���ҵ���name��ͬ��ɾ��
		 */
		for(DVD d : DVDContext.dvds){
			if(d != null && d.getName().equals(name) && !d.isDel()){
				d.setDel(true);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean borrowDVD(DVD dvd) {
		for(DVD d : DVDContext.dvds){	//�ѱ������ʱû����
			if(d != null && d.getName().equals(dvd.getName()) && !d.isState() && !d.isDel()){
				d.setState(true);			//���
				d.setTime(dvd.getTime());	//���ý��ʱ��
				d.setCount(d.getCount() + 1);	//�������+1
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean returnDVD(String name) {
		for(DVD d : DVDContext.dvds){
			if(d != null && d.getName().equals(name) && d.isState() && !d.isDel()){
				d.setState(false);
				d.setTime(null);
				return true;
			}
		}
		return false;
	}


}
