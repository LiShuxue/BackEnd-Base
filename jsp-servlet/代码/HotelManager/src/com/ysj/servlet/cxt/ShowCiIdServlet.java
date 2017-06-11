package com.ysj.servlet.cxt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.service.IRoomWorkService;
import com.ysj.service.impl.RoomWorkService;

public class ShowCiIdServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IRoomWorkService rs = new RoomWorkService();
		Integer ciId = rs.getBigestCiId()+1;
		PrintWriter out = response.getWriter();
		out.print(ciId);
	}

}
