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

public class ShowSelectRoomServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String roomType = request.getParameter("roomType");
		Integer floor = 0;
		Integer price = 0;
		try {
			floor = Integer.parseInt(request.getParameter("floor"));
		} catch (Exception e) {
			floor = 20;
		}
		try {
			price = Integer.parseInt(request.getParameter("price"));

		} catch (Exception e) {
			price = 0;
		}
		IRoomsService service = new RoomsService();
		List<Rooms> all = service.selectRooms();
		List<Rooms> allList = new ArrayList<Rooms>();
		switch (price) {
		case 0:
			for (Rooms rooms : all) {
				if (rooms.getRoomType().equals(roomType)&&rooms.getFloor().equals(floor)&&rooms.getRoomPrice()<=1000) {
					allList.add(rooms);
				}
			}
			break;
		case 1:
			for (Rooms rooms : all) {
				if (rooms.getRoomType().equals(roomType)&&rooms.getFloor().equals(floor)&&rooms.getRoomPrice()>1000&&rooms.getRoomPrice()<5000) {
					allList.add(rooms);
				}
			}
			break;
		case 2:
			for (Rooms rooms : all) {
				if (rooms.getRoomType().equals(roomType)&&rooms.getFloor().equals(floor)&&rooms.getRoomPrice()>=5000) {
					allList.add(rooms);
				}
			}
			break;

		default:
			break;
		}

		Integer roomCount = allList.size();
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

		if (page < 1) {
			page = 1;
		} else if (page > totalPage) {
			page = totalPage;
		}
		List<Rooms> list = new ArrayList<Rooms>();
		
		for (int i = (page - 1) * count; i < page * count && i < roomCount; i++) {
			try {
				list.add(allList.get(i));
			} catch (Exception e) {
			}
		}
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("totalPage", totalPage);
		
		request.getRequestDispatcher("room/manageRoom.jsp").forward(request,
				response);
	}

}
