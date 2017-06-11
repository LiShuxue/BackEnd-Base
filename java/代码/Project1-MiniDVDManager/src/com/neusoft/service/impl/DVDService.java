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
 * 调用DVDDAO对象，以及其他对象（程序简单暂时没有），完成DVD操作的一系列功能
 * 但是该Service 不会去操作 DVDContext中的静态数组，而且Service并不知道有什么数组。。
 * 该Service 会被界面调用，完成一些列功能
 */
public class DVDService implements IDVDService {

	private IDVDDAO dvdDAO = new DVDDAO();
	private Logger logger = Logger.getLogger(DVDService.class.getName());
	
	@Override
	public boolean save(DVD dvd) {
		//如果dvd没有
		if(dvdDAO.findDVDByName(dvd.getName()) == null){
			logger.log(Level.INFO, "添加一个DVD,id=" + dvd.getId());
			return dvdDAO.addDVD(dvd);	//addDVD返回布尔值
		}
		return false;
	}

	@Override
	public List<DVD> queryDVDs() {
		logger.log(Level.INFO, "查询所有DVD");
		return dvdDAO.findDVDs();
	}

	@Override
	public int delete(String name) {
		DVD d = dvdDAO.findDVDByName(name);
		if(d == null){	//没有此dvd
			return 0;	
		}else if(d.getState()==1){	//借出
			return 1;
		}else if(d.getIsDel()==1){	//已被删除
			return 2;
		}else if(dvdDAO.deleteDVD(name)){	//删除成功
			logger.log(Level.INFO, "删除一个DVD,"+name);
			return 3;
		}
		return 4;	//删除失败
	}

	@Override
	public boolean borrowDVD(DVD dvd) {
		logger.log(Level.INFO, "借出一个DVD，"+dvd.getName());
		return dvdDAO.borrowDVD(dvd);
	}

	@Override
	public Date returnDVD(String name) {
		DVD dvd = dvdDAO.findDVDByName(name);
		Date time = null;
		if(dvd != null && dvd.getState()== 1){
			time = dvd.getTime();
			if(dvdDAO.returnDVD(name)){
				logger.log(Level.INFO, "归还一个DVD，"+name);
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
