package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.RoomTypes;
import com.ysj.service.IRoomsService;
import com.ysj.service.impl.RoomsService;

public class VaRoomTypeServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String roomType = request.getParameter("roomType");
		IRoomsService rs = new RoomsService();
		PrintWriter out = response.getWriter();
		List<RoomTypes> list = rs.getRoomTypeByName(roomType);
		if (list.size()==0 && roomType!="") {
			out.write("可用");
		}else{
			out.write("不可用");
		}
	}

}
