package com.google.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.google.resources.LoginForm;
/**
 * @author Yura Hilevich
 */
@org.springframework.stereotype.Controller
public class Login  implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
			
			return new ModelAndView("/WEB-INF/views/LoginForm.jsp");
		
	}

	
	
		
		
	
	

}
