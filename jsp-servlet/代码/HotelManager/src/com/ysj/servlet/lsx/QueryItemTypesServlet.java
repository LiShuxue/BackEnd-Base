package com.ysj.servlet.lsx;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.ItemTypes;
import com.ysj.service.IItemsService;
import com.ysj.service.impl.ItemsService;

public class QueryItemTypesServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IItemsService service = new ItemsService();
		Integer itemtypesCount = service.getItemTypesCount();
		Integer count = 5 ;
		Integer totalPage = (itemtypesCount % count==0) ? (itemtypesCount/count) : (itemtypesCount/count + 1);
		
		String strPage = request.getParameter("page");
		Integer page = 0;
		try{
			page = strPage == null ? 1 : Integer.parseInt(strPage);
		}catch(Exception e){
			page = 1;
		}
		
		if(page < 1){
			page = 1;
		}else if(page > totalPage){
			page = totalPage;
		}
		
		List<ItemTypes> list = service.queryItemTypes(page, count);

		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("/items/showItemTypes.jsp").forward(request, response);
	}

}
