package com.google.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.google.SeaBattle.main.SeaBattleMain;
/**
 * @author Yura Hilevich
 */
public class SeabatlleController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		SeaBattleMain sbm = new SeaBattleMain();
		sbm.seaBattleMain();
		return new ModelAndView("/WEB-INF/views/private_office.jsp");
	}

}
