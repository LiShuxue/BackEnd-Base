package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Floors;
import com.ysj.bean.RoomTypes;
import com.ysj.service.IRoomsService;
import com.ysj.service.impl.RoomsService;

public class AddFloorServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer floor = Integer.parseInt(request.getParameter("floor"));
		Integer floorPrice = Integer.parseInt(request.getParameter("floorPrice"));
		String remark = request.getParameter("remark");
		
		
		IRoomsService rs = new RoomsService();
		int result = 0;
		if(  rs.addFloor(new Floors(floor, remark, floorPrice, 0))  ){
			result = 1;
		}
		response.sendRedirect("room/addFloor.jsp?result=" + result);
	}

}
