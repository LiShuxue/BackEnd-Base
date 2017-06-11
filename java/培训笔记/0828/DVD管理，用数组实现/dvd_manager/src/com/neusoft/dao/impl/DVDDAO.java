package com.neusoft.dao.impl;

import com.neusoft.bean.DVD;
import com.neusoft.dao.IDVDDAO;
import com.neusoft.db.DVDContext;
/**
 * DAO 只对我们DVDContext中的数组操作 该类对象会被Service去调用
 *
 */
public class DVDDAO implements IDVDDAO {

	@Override
	public boolean addDVD(DVD dvd) {
		/*
		 * 循环100长度的dvd数组，如果某个位置没有元素，就将新的dvd填到这个位置上
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
		 *	在不为null的dvd中寻找相同名字的dvd，如果找到，返回它的副本 
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
		return null;	//代表没找到
	}

	@Override
	public DVD[] findDVDs() {
		//统计出不为空和没有删除的dvd
		int count = 0;
		for (DVD d : DVDContext.dvds) {
			if(d != null && !d.isDel()){
				count++;
			}
		}
		//创建新数组，将所有有效的dvd克隆到新数组
		//变量j从0开始，每找到一个作为新数组dvd的下标，再加1来表示下一个下标
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
		return dvd;	//返回所有没删除的dvd
	}

	@Override
	public boolean deleteDVD(String name) {
		/*
		 * 循环dvd，找到与name相同，删除
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
		for(DVD d : DVDContext.dvds){	//已被借出暂时没处理
			if(d != null && d.getName().equals(dvd.getName()) && !d.isState() && !d.isDel()){
				d.setState(true);			//借出
				d.setTime(dvd.getTime());	//设置借出时间
				d.setCount(d.getCount() + 1);	//借出次数+1
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
