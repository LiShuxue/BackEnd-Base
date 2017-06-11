package com.neusoft.service.impl;

import java.sql.Date;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import com.neusoft.bean.DVD;
import com.neusoft.dao.IDVDDAO;
import com.neusoft.dao.impl.DVDDAO;
import com.neusoft.service.IDVDService;
/**
 * 
 * ����DVDDAO�����Լ��������󣨳������ʱû�У������DVD������һϵ�й���
 * ���Ǹ�Service ����ȥ���� DVDContext�еľ�̬���飬����Service����֪����ʲô���顣��
 * ��Service �ᱻ������ã����һЩ�й���
 */
public class DVDService implements IDVDService {

	private IDVDDAO dvdDAO = new DVDDAO();
	private Logger logger = Logger.getLogger(DVDService.class.getName());
	
	@Override
	public boolean save(DVD dvd) {
		//���dvdû��
		if(dvdDAO.findDVDByName(dvd.getName()) == null){
			logger.log(Level.INFO, "���һ��DVD,id=" + dvd.getId());
			return dvdDAO.addDVD(dvd);	//addDVD���ز���ֵ
		}
		return false;
	}

	@Override
	public List<DVD> queryDVDs() {
		logger.log(Level.INFO, "��ѯ����DVD");
		return dvdDAO.findDVDs();
	}

	@Override
	public int delete(String name) {
		DVD d = dvdDAO.findDVDByName(name);
		if(d == null){	//û�д�dvd
			return 0;	
		}else if(d.getState()==1){	//���
			return 1;
		}else if(d.getIsDel()==1){	//�ѱ�ɾ��
			return 2;
		}else if(dvdDAO.deleteDVD(name)){	//ɾ���ɹ�
			logger.log(Level.INFO, "ɾ��һ��DVD,"+name);
			return 3;
		}
		return 4;	//ɾ��ʧ��
	}

	@Override
	public boolean borrowDVD(DVD dvd) {
		logger.log(Level.INFO, "���һ��DVD��"+dvd.getName());
		return dvdDAO.borrowDVD(dvd);
	}

	@Override
	public Date returnDVD(String name) {
		DVD dvd = dvdDAO.findDVDByName(name);
		Date time = null;
		if(dvd != null && dvd.getState()== 1){
			time = dvd.getTime();
			if(dvdDAO.returnDVD(name)){
				logger.log(Level.INFO, "�黹һ��DVD��"+name);
				return time;
			}
		}
		return null;
	}

	@Override
	public List<DVD> getDVDRank() {
		return dvdDAO.findDVDs();
	}
//	
//	public static void main(String[] args) {
//		/*IDVDService s = new DVDService();
//		s.save(new DVD(1, "a", false, null, 0, false));
//		s.borrowDVD(new DVD(0, "a", false, new Date(), 0, false));
//		Date time = s.returnDVD("a");
//		System.out.println(time);*/
//		
//		Date d = new java.sql.Date(new java.util.Date().getTime());
//		System.out.println(d);
//	}
}
