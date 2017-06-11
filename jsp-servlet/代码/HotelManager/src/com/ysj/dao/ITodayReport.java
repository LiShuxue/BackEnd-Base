package com.ysj.dao;

import java.sql.Date;
import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
import com.ysj.bean.CoReport;
import com.ysj.bean.Rooms;

public interface ITodayReport {
	/**
	 * ��ѯ�����е�Ԥ����Ϣ
	 * @return ����Ԥ����Ϣ����
	 */
	public List<BookInfo> findToday();
	/**
	 * ��ѯ������ס��Ϣ
	 * @return������ס��Ϣ����
	 */
	public List<Ci> findCi();
	/**
	 * ��ѯ������Ϣ
	 * @return�������н���
	 */
	public List<CoReport> findCo();

}
