package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Yura Hilevich
 */

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1821658560024553624L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		String name = req.getParameter("username");
		String password = req.getParameter("password");

		try {
			if (name.equalsIgnoreCase("yura") && password.equals("1111")) {
				req.getRequestDispatcher("/WEB-INF/views/private_office.jsp?auth=user").forward(req, resp);

			} else {
				req.getRequestDispatcher("/WEB-INF/home.jsp?auth=fail").forward(req, resp);
			}
		} catch (Exception e) {
			req.getRequestDispatcher("page404.jsp").forward(req, resp);
		}

	}

}
