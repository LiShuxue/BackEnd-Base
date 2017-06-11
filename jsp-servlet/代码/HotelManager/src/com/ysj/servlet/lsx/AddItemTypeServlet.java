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

public class AddItemTypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String typeName = request.getParameter("typeName");
		String remark = request.getParameter("remark");
	
		IItemsService service = new ItemsService();
		ItemTypes itemtype = new ItemTypes(0, typeName, remark, 0);
		
		PrintWriter out = response.getWriter();
		if(service.addItemType(itemtype)){
			out.print("添加成功");
		} else {
			out.print("添加失败");
		}
	}

}
