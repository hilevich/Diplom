package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutServlet extends HttpServlet {

	/**
	 * @author Yura Hilevich
	 */
	private static final long serialVersionUID = 249334936656100370L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getRequestDispatcher("/WEB-INF/home.jsp?redirct=true").include(request, response);

		HttpSession session = request.getSession();
		session.invalidate();

		out.close();

	}
}