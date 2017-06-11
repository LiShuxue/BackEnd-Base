package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Members;
import com.ysj.service.IMembersService;
import com.ysj.service.impl.MembersService;

public class UpdateMemberServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer mid = Integer.parseInt(request.getParameter("mid"));
		String mname = request.getParameter("mname");
		String msex = request.getParameter("msex");
		String mphone = request.getParameter("mphone");
		String maddress = request.getParameter("maddress");
		String memail = request.getParameter("memail");
		Integer mpoints = Integer.parseInt(request.getParameter("mpoints"));
		String mtype = request.getParameter("mtype");
		String bookTime = request.getParameter("mbookTime");
		String presetTime = request.getParameter("mpresetTime");
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date mbookTime = null;
		Date mpresetTime = null;
		try {
			mbookTime = new Date(sf.parse(bookTime).getTime());
			mpresetTime = new Date(sf.parse(presetTime).getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String remark = request.getParameter("remark");
	
		IMembersService service = new MembersService();
		Members member = new Members(mid, mname, msex, null, mphone, maddress, memail, mpoints, mtype, mbookTime, mpresetTime, remark, 0);
		if(service.updateMember(member)){
			PrintWriter out = response.getWriter();
			out.print("ÐÞ¸Ä³É¹¦");
		}
	}

}
