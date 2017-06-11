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

public class ShowFloorServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IRoomsService service = new RoomsService();
		List<Floors> list = service.selectFloors();
		PrintWriter out = response.getWriter();
		try {
			Integer floor = Integer.parseInt(request.getParameter("floor"));
			out.print("<select id='floor' name='floor' onchange='show()'>");
			out.print("<option>");
			out.print(floor);
			out.println("</option>");
			for (Floors floors : list) {
				out.print("<option>");
				out.print(floors.getFloor());
				out.println("</option>");
			}
			out.println("</select>");
			out.flush();
			out.close();
		} catch (Exception e) {
			out.print("<select id='floor' name='floor' onchange='show()'>");
			out.print("<option>ÇëÑ¡ÔñÂ¥²ã</option>");
			for (Floors floors : list) {
				out.print("<option>");
				out.print(floors.getFloor());
				out.println("</option>");
			}
			out.println("</select>");
			out.flush();
			out.close();
		}
		
	}

}
