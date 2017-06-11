package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Ci;
import com.ysj.bean.Co;
import com.ysj.service.IRoomWorkService;
import com.ysj.service.IRoomsService;
import com.ysj.service.impl.RoomWorkService;
import com.ysj.service.impl.RoomsService;

public class AddCoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer ciId = Integer.parseInt(request.getParameter("ciId"));
		Integer roomId = Integer.parseInt(request.getParameter("roomId"));
		Integer price = Integer.parseInt(request.getParameter("discountPrice"));
		Integer pledge = Integer.parseInt(request.getParameter("pledge"));
		Integer days = Integer.parseInt(request.getParameter("days"));
		Integer roomCost = Integer.parseInt(request.getParameter("roomCost"));
		Integer otherCost = Integer.parseInt(request.getParameter("otherCost"));
		Integer foodCost = Integer.parseInt(request.getParameter("foodCost"));
		Integer phoneCost = Integer.parseInt(request.getParameter("phoneCost"));
		Integer allCost = Integer.parseInt(request.getParameter("allCost"));
		Integer payType = Integer.parseInt(request.getParameter("payType"));
		Integer getMoney = Integer.parseInt(request.getParameter("getMoney"));
		String operator = request.getParameter("operator");
		String remark = request.getParameter("remark");
		
		IRoomWorkService rws = new RoomWorkService();
		IRoomsService rs = new RoomsService();
		int result = 0;
		if( rws.checkOut(new Co(ciId, roomId, price, pledge, days, roomCost, otherCost, foodCost, phoneCost, allCost, payType, getMoney, operator, remark))){
			result = 1;
		}
		response.sendRedirect("room/co.jsp?result=" + result);
	}

}
