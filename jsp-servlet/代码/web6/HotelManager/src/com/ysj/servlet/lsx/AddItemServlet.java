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

public class AddItemServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String itemName = request.getParameter("itemName");
		Integer typeCode = Integer.parseInt(request.getParameter("typeCode"));
		Integer itemPrice = Integer.parseInt(request.getParameter("itemPrice"));
		String itemUnit = request.getParameter("itemUnit");
		String remark = request.getParameter("remark");
	
		IItemsService service = new ItemsService();
		Items item = new Items(0, itemName, typeCode, itemPrice, itemUnit, remark, 0);
		
		PrintWriter out = response.getWriter();
		if(service.addItem(item)){
			out.print("添加成功");
		} else {
			out.print("添加失败");
		}
	}
}
