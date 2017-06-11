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
			//���session����
			HttpSession session = request.getSession();
			//��¼�ɹ�����session��Χ�б����û���
			session.setAttribute("username", name);
			path = "welcome.jsp";
		}else{
			path = "index.jsp";
			request.setAttribute("tip", "�û������������");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
