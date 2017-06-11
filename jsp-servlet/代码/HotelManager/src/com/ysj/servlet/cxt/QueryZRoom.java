package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Rooms;
import com.ysj.service.IRoomsService;
import com.ysj.service.impl.RoomsService;

public class QueryZRoom extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IRoomsService service = new RoomsService();
		Integer roomCount = service.selectRoomsByStatus(0).size();
		Integer count = 12;
		Integer totalPage = roomCount % count == 0 ? roomCount / count
				: roomCount / count + 1;
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
		List<Rooms> allList = service.selectRoomsByStatus(0);
		List<Rooms> list = new ArrayList<Rooms>();
		for (int i = (page-1)*count; i < page*count&&i<roomCount; i++) {
			list.add(allList.get(i));
		}
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("room/bookCi.jsp").forward(request, response);
	}

}
