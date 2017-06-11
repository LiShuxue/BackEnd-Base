package com.ysj.servlet.lsx;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.service.IItemsService;
import com.ysj.service.impl.ItemsService;

public class DeleteItemTypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer typeCode = Integer.parseInt(request.getParameter("typeCode"));
		String page = request.getParameter("page");
		IItemsService service = new ItemsService();
		if(service.deleteItemType(typeCode)) {
			response.sendRedirect("QueryItemTypesServlet?page=" + page);
		}
	}

}
