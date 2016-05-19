package com.google.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.google.resources.Contact_Jframe;
/**
 * @author Yura Hilevich
 */
public class Contact_home implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		Contact_Jframe v = new Contact_Jframe();
		v.contact_JframeMain();
		return new ModelAndView("/WEB-INF/home.jsp");
	}

}
