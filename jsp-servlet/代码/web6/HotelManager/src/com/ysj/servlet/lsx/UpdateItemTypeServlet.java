package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.ItemTypes;
import com.ysj.service.IItemsService;
import com.ysj.service.impl.ItemsService;

public class UpdateItemTypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer typeCode = Integer.parseInt(request.getParameter("typeCode"));
		String typeName = request.getParameter("typeName");
		String remark = request.getParameter("remark");
	
		IItemsService service = new ItemsService();
		ItemTypes itemtype = new ItemTypes(typeCode, typeName, remark, 0);
		if(service.updateItemType(itemtype)){
			PrintWriter out = response.getWriter();
			out.print("ÐÞ¸Ä³É¹¦");
		}
	}

}
