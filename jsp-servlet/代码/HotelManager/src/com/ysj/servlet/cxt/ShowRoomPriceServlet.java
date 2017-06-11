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

public class ShowRoomPriceServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String roomType = request.getParameter("roomType");
		Integer floor = 0;
		try {
			floor = Integer.parseInt(request.getParameter("floor"));
		} catch (Exception e) {
			floor=20;
		}
		IRoomsService service = new RoomsService();
		Integer price = 0;
		List<Floors> list1 = service.selectFloors();
		List<RoomTypes> list2 = service.selecTypes();
		for (RoomTypes roomTypes : list2) {
			if (roomType.equals(roomTypes.getRoomType())) {
				price += roomTypes.getTypPrice();
			}
		}
		for (Floors floors : list1) {
			if (floor.equals(floors.getFloor())) {
				price += floors.getFloorPrice();
			}
		}
		//response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(price);
	}

}
