package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.RoomTypes;
import com.ysj.service.IRoomsService;
import com.ysj.service.impl.RoomsService;

public class UpdateRoomTypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IRoomsService service = new RoomsService();
		String roomType = request.getParameter("roomType");
		Integer roomPeopleNum = Integer.parseInt(request.getParameter("roomPeopleNum"));
		String remark = request.getParameter("remark");
		Integer typePrice = Integer.parseInt(request.getParameter("typePrice"));

		RoomTypes rType = new RoomTypes(roomType, roomPeopleNum, remark, typePrice, 0);
		if (service.updateRoomType(rType)) {
			
			PrintWriter out = response.getWriter();
			out.write("ÐÞ¸Ä³É¹¦!!");
		}
	}

}
