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

public class showRoomTypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IRoomsService service = new RoomsService();
		List<RoomTypes> list = service.selecTypes();
		PrintWriter out = response.getWriter();
		String roomType = request.getParameter("roomType");
		if (roomType!=null) {
			out.println("<select id='roomType' name='roomType' onchange='show()'>");
			out.print("<option>");
			out.print(roomType);
			out.println("</option>");
			for (RoomTypes roomTypes : list) {
				out.print("<option>");
				out.print(roomTypes.getRoomType());
				out.println("</option>");
			}
			out.println("</select>");
			out.flush();
			out.close();
		}else{
			out.println("<select id='roomType' name='roomType' onchange='show()'>");
			out.println("<option>请选择客房类型</option>");
			for (RoomTypes roomTypes : list) {
				out.print("<option>");
				out.print(roomTypes.getRoomType());
				out.println("</option>");
			}
			out.println("</select>");
			out.flush();
			out.close();
		}
	}

}
