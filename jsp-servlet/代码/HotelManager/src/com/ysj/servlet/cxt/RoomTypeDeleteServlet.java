package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.service.IRoomsService;
import com.ysj.service.impl.RoomsService;

public class RoomTypeDeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String roomType = request.getParameter("roomType");
		String page = request.getParameter("page");
		IRoomsService service = new RoomsService();
		if (service.deleteRoomType(roomType)) {
			response.sendRedirect("QueryRoomType?page=" + page);
		}
	}

}
