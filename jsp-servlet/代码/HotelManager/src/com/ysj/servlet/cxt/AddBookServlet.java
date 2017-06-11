package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Rooms;
import com.ysj.service.IRoomWorkService;
import com.ysj.service.IRoomsService;
import com.ysj.service.impl.RoomWorkService;
import com.ysj.service.impl.RoomsService;

public class AddBookServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer roomid = Integer.parseInt(request.getParameter("roomId"));
		Integer pledge = Integer.parseInt(request.getParameter("pledge"));
		String customerName = request.getParameter("customerName");
		Integer cardType = Integer.parseInt(request.getParameter("cardType"));
		String cardId = request.getParameter("cardId");
		String customerPhone = request.getParameter("customerPhone");
		String arriveTime = request.getParameter("arriveTime");
		String leaveTime = request.getParameter("leaveTime");
		Integer checkinNum = Integer.parseInt(request.getParameter("checkinNum"));
		String operator = request.getParameter("operator");
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
		Integer mPrice = Integer.parseInt(request.getParameter("mPrice"));
		
		IRoomWorkService rws = new RoomWorkService();
		IRoomsService rs = new RoomsService();
		int result = 0;
		if(  rs.bookRoom(roomid)&&rws.addBookInfo(new BookInfo(0, roomid, pledge, customerName, cardType, cardId, customerPhone, arriveTime, leaveTime, checkinNum, operator, mId, remark, roomType, roomPrice, discountPrice, mPrice, 1))){
			result = 1;
		}
		response.sendRedirect("room/book.jsp?result=" + result);
	}

}
