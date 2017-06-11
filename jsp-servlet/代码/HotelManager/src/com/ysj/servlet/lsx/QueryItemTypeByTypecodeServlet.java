package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.ItemTypes;
import com.ysj.bean.Items;
import com.ysj.service.IItemsService;
import com.ysj.service.impl.ItemsService;

public class QueryItemTypeByTypecodeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer typecode = Integer.parseInt(request.getParameter("typecode"));
		IItemsService service = new ItemsService();
		ItemTypes itemtype = service.queryItemTypeByTypeCode(typecode);
		List<ItemTypes> list = new ArrayList<ItemTypes>();
		list.add(itemtype);
		request.setAttribute("list", list);
		request.setAttribute("totalPage", 0);
		request.getRequestDispatcher("/items/showItemTypes.jsp").forward(request, response);	
	}

}
