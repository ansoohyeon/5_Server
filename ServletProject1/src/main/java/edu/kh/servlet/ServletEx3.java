package edu.kh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("inputId");
		String name = req.getParameter("inputName");
		String email = req.getParameter("inputEmail");
		
		String[] color = req.getParameterValues("color");
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>회원 정보 제출 결과</title>");
		out.println("</head>");
		
		out.println("<body>");
		
		out.println("<ul>");
		
		out.println("<li>"+ "아이디 : " + id +"</li>");
		out.println("<li>"+ "이름 : " + name +"</li>");
		out.println("<li>"+ "이메일 : " + email +"</li>");
		out.print("<li> 좋아하는 색 : ");
		if(color != null) {
			for(String c : color) {
				out.println(c + " ");
			}
		}
		out.print("</li>");	
		
		out.println("</ul>");
		
		out.println("</body>");
		
		out.println("</html>");
	}
}
