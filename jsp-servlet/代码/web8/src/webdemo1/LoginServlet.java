package webdemo1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String path = "";
		if( (name != null && name.equals("haochen") && (pwd != null && pwd.equals("3838438")))){
			//获得session对象
			HttpSession session = request.getSession();
			//登录成功，向session范围中保存用户名
			session.setAttribute("username", name);
			path = "welcome.jsp";
		}else{
			path = "index.jsp";
			request.setAttribute("tip", "用户名或密码错误");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
