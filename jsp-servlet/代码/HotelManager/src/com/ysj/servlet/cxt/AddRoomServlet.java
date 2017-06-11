package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Floors;
import com.ysj.bean.Rooms;
import com.ysj.service.IRoomsService;
import com.ysj.service.impl.RoomsService;

public class AddRoomServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer roomId = Integer.parseInt(request.getParameter("roomId"));
		String roomType = request.getParameter("roomType");
		Integer floor = Integer.parseInt(request.getParameter("floor"));
		Integer roomPrice = Integer.parseInt(request.getParameter("roomPrice"));
		Integer discountPrice = Integer.parseInt(request.getParameter("discountPrice"));
		Integer mprice = Integer.parseInt(request.getParameter("mprice"));
		Integer vipPrice = Integer.parseInt(request.getParameter("vipPrice"));
		String remark = request.getParameter("remark");
		
		
		IRoomsService rs = new RoomsService();
		int result = 0;
		if(  rs.addRoom(new Rooms(roomId, roomType, 0, floor, roomPrice, discountPrice, mprice, vipPrice, remark, 0))  ){
			result = 1;
		}
		response.sendRedirect("room/addRoom.jsp?result=" + result);
	}

}
