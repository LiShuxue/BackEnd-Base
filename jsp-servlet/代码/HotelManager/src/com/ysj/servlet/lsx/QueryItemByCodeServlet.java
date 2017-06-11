package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Items;
import com.ysj.service.IItemsService;
import com.ysj.service.impl.ItemsService;

public class QueryItemByCodeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer itemcode = Integer.parseInt(request.getParameter("code"));
		IItemsService service = new ItemsService();
		Items item = service.queryItemByCode(itemcode);
		List<Items> list = new ArrayList<Items>();
		list.add(item);
		request.setAttribute("list", list);
		request.setAttribute("totalPage", 0);
		request.getRequestDispatcher("items/showItems.jsp").forward(request, response);
	}

}
