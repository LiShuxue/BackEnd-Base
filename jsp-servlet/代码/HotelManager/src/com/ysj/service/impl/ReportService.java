package com.ysj.service.impl;

import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
import com.ysj.bean.CoReport;
import com.ysj.dao.ITodayReport;
import com.ysj.dao.impl.TodayReport;
import com.ysj.service.IReportService;

public class ReportService implements IReportService {
	ITodayReport tr = new TodayReport();
	
	@Override
	public List<BookInfo> findBook() {
		return tr.findToday();
	}

	@Override
	public List<Ci> findCi() {
		
		return tr.findCi();
	}

	@Override
	public List<CoReport> findCo() {
	
		return tr.findCo();
	}

}
