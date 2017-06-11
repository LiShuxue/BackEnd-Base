package com.ysj.servlet.lx;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.RepaintManager;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Items;
import com.ysj.service.IItemsService;
import com.ysj.service.IReportService;
import com.ysj.service.impl.ItemsService;
import com.ysj.service.impl.ReportService;

public class bookReport extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strStartDate = request.getParameter("startDate");
		String strEndDate = request.getParameter("endDate");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		IReportService service = new ReportService();
		List<BookInfo> allList = service.findBook();
		List<BookInfo> list = new ArrayList<BookInfo>();
		try {
			Date startDate = sf.parse(strStartDate);
			Date endDate = sf.parse(strEndDate);
			for (BookInfo bookInfo : allList) {
				if (sf.parse(bookInfo.getLeaveTime()).getTime()>=startDate.getTime() && sf.parse(bookInfo.getLeaveTime()).getTime()<=endDate.getTime()) {
					list.add(bookInfo);
				}
			}
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		Integer reportCount = list.size();
		Integer count = 10 ;
		Integer totalPage = (reportCount % count==0) ? (reportCount/count) : (reportCount/count + 1);
		
		String strPage = request.getParameter("page");
		Integer page = 0;
		try{
			page = strPage == null ? 1 : Integer.parseInt(strPage);
		}catch(Exception e){
			page = 1;
		}
		
		if(page < 1){
			page = 1;
		}else if(page > totalPage){
			page = totalPage;
		}

		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("report/bookReport.jsp").forward(request, response);
		
	}

}
