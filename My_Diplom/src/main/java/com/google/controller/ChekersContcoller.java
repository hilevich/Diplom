package com.google.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.google.Chekers.SimpleCheckersGUI;
/**
 * @author Yura Hilevich
 */
public class ChekersContcoller implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		SimpleCheckersGUI sc = new SimpleCheckersGUI();
		return new ModelAndView("/WEB-INF/views/private_office.jsp");
	}

}
