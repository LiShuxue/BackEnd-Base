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

public class AddRoomTypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String roomType = request.getParameter("roomType");
		Integer roomPeopleNum = Integer.parseInt(request.getParameter("roomPeopleNum"));
		String remark = request.getParameter("remark");
		Integer typePrice = Integer.parseInt(request.getParameter("typePrice"));
		
		
		IRoomsService rs = new RoomsService();
		int result = 0;
		if(  rs.addRoomType(new RoomTypes(roomType, roomPeopleNum, remark, typePrice, 0))  ){
			result = 1;
		}
		response.sendRedirect("room/addRoomType.jsp?result=" + result);
	}

}
