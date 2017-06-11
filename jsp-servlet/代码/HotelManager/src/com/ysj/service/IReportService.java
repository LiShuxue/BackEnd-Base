package com.ysj.service;

import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
import com.ysj.bean.CoReport;

public interface IReportService {
	/**
	 * ��ѯԤ����Ϣ
	 * @return����Ԥ����Ϣ
	 */
	public List<BookInfo> findBook();
	/**
	 * ��ѯ��ס��Ϣ
	 * @return������ס������Ϣ
	 */
	public List<Ci> findCi();
	/**
	 * ��ѯ������Ϣ
	 * @return����������Ϣ
	 */
	public List<CoReport> findCo();

}
