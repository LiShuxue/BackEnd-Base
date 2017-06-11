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

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.service.IReportService;
import com.ysj.service.impl.ReportService;

public class ciReport extends HttpServlet {

	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strStartDate = request.getParameter("startDate");
		String strEndDate = request.getParameter("endDate");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		IReportService service = new ReportService();
		List<Ci> allList = service.findCi();
		List<Ci> list = new ArrayList<Ci>();
		
		try {
			Date startDate = sf.parse(strStartDate);
			Date endDate = sf.parse(strEndDate);
			for (Ci ci : allList) {
				if (sf.parse(ci.getLeaveTime()).getTime()>=startDate.getTime() && sf.parse(ci.getLeaveTime()).getTime()<=endDate.getTime()) {
					list.add(ci);
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
		request.getRequestDispatcher("report/ciReport.jsp").forward(request, response);
		
	}

	

}
