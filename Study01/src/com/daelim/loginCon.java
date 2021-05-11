package com.daelim;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginCon
 */
//@WebServlet("/loginCon")
public class loginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		out.print("id : " + id);
		out.print("pw : " + pw);
		
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		
		for(Cookie c : cookies) { 
			System.out.println("c.getName()" + c.getName() + "c.getValue()" + c.getValue());
		
			if(c.getName().equals("memberId")) {//쿠키 조회중 memberId가 있다면
				cookie =c;
			}
		
		}
		if(cookie ==null) {
			System.out.println("cookie == null");
			cookie = new Cookie("memberId",id);
		}
		response.addCookie(cookie); //위에서 만든 쿠키 전송
		cookie.setMaxAge(60 * 60); //60초 * 60초 까지 만료기간 조회하면 초기화
		
		response.sendRedirect("loginOk.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
