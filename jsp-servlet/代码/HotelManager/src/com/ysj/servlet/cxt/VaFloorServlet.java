package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Floors;
import com.ysj.bean.RoomTypes;
import com.ysj.service.IRoomsService;
import com.ysj.service.impl.RoomsService;

public class VaFloorServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strFloor = request.getParameter("floor");
		Integer floor = Integer.parseInt(strFloor);
		IRoomsService rs = new RoomsService();
		PrintWriter out = response.getWriter();
		List<Floors> list = rs.getFloor(floor);
		if (list.size()==0 && strFloor != "") {
			out.write("可用");
		}else{
			out.write("已存在");
		}
	}

}
