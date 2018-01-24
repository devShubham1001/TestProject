package com.skilrock.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.spi.RegisterableService;
import javax.servlet.ServletException;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilrock.bean.RegistrationBean;
import com.skilrock.service.RegistrationService;

import java.sql.*;
import java.util.Arrays;

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String fname = request.getParameter("uname");
		String gender = request.getParameter("gender");
		String address = request.getParameter("uaddress");
		String mail= request.getParameter("umail");
		String language[] = request.getParameterValues("languages");
		String phone= request.getParameter("uphone");
		String userid = request.getParameter("uid");
		String userpassword = request.getParameter("upass");
		
		RegistrationBean registrationBean = new RegistrationBean();
		registrationBean.setName(fname);
		registrationBean.setPhone(phone);
		registrationBean.setAddress(address);
		registrationBean.setEmail(mail);
		registrationBean.setUserId(userid);
		registrationBean.setLanguage(language);
		registrationBean.setUserpassword(userpassword);
		registrationBean.setGender(gender);
		
		
		
		RegistrationService registerableService = new RegistrationService();
		int count = registerableService.saveRegistration(registrationBean);
		 if(count>0) out.println("data inserted");
	      else out.println("data not inserted");
		 
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	
	}

}


