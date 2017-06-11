package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Items;
import com.ysj.service.IItemsService;
import com.ysj.service.impl.ItemsService;

public class UpdateItemServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer itemCode = Integer.parseInt(request.getParameter("itemCode"));
		String itemName = request.getParameter("itemName");
		Integer typeCode = Integer.parseInt(request.getParameter("typeCode"));
		Integer itemPrice = Integer.parseInt(request.getParameter("itemPrice"));
		String itemUnit = request.getParameter("itemUnit");
		String remark = request.getParameter("remark");
	
		IItemsService service = new ItemsService();
		Items item = new Items(itemCode, itemName, typeCode, itemPrice, itemUnit, remark, 0);
		if(service.updateItem(item)){
			PrintWriter out = response.getWriter();
			out.print("ÐÞ¸Ä³É¹¦");
		}
	}

}
