package com.daelim.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginCon
 */
@WebServlet("/loginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; utf-8");
		String mID = request.getParameter("mID");
		String mPW = request.getParameter("mPW");
		
		out.print("mID : " + mID);
		out.print("mPW : " + mPW);
		
		HttpSession session = request.getSession();
		session.setAttribute("MemberId", mID);
		
		response.sendRedirect("sessionT/loginOk.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
