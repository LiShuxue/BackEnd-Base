package com.ysj.servlet.lsx;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.service.IItemsService;
import com.ysj.service.impl.ItemsService;

public class DeleteItemServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		Integer itemCode = Integer.parseInt(request.getParameter("itemCode"));
		String page = request.getParameter("page");
		IItemsService service = new ItemsService();
		if(service.deleteItem(itemCode)) {
			response.sendRedirect("QueryItemsServlet?page=" + page);
		}
	}

}
