package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Ci;

public class GoToCoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer ciId = Integer.parseInt(request.getParameter("ciId"));
		Integer roomId = Integer.parseInt(request.getParameter("roomId"));
		Integer pledge = Integer.parseInt(request.getParameter("pledge"));
		String arriveTime = request.getParameter("arriveTime");
		String leaveTime = request.getParameter("leaveTime");
		Integer mId;
		try {
			mId = Integer.parseInt(request.getParameter("mId"));
		} catch (Exception e) {
			mId =0;
		}
		String remark = request.getParameter("remark");
		String roomType = request.getParameter("roomType");
		Integer roomPrice = Integer.parseInt(request.getParameter("roomPrice"));
		Integer discountPrice = Integer.parseInt(request.getParameter("discountPrice"));
		Integer sum = Integer.parseInt(request.getParameter("sum"));
		
		Ci ci = new Ci(ciId, roomId, roomType, roomPrice, discountPrice, pledge, "xxx", 0, "cardId", "customerPhone", arriveTime, leaveTime, 0, "operator", 0, 0, 0, 0, remark, 0);
		request.setAttribute("ci", ci);
		request.setAttribute("sum", sum);
		request.getRequestDispatcher("room/co.jsp").forward(request, response);
	}

}
