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

public class QueryFloor extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IRoomsService service = new RoomsService();
		Integer floorCount = service.getFloorCount();
		Integer count = 12;
		Integer totalPage = floorCount % count == 0 ? floorCount / count
				: floorCount / count + 1;
		String strPage = request.getParameter("page");
		Integer page = 0;
		try {
			page = strPage == null ? 1 : Integer.parseInt(strPage);
		} catch (Exception e) {
			page = 1;
		}
		
		if (page<1) {
			page = 1;
		}else if (page>totalPage) {
			page = totalPage;
		}
		
		List<Floors> list = service.queryFloor(page, count);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("room/manageFloor.jsp").forward(request, response);
	}

}
