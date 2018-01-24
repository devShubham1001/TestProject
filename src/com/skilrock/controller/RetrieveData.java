package com.skilrock.controller;

import com.skilrock.bean.RegistrationBean;
import com.skilrock.dao.*;
import com.skilrock.service.RegistrationService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RetrieveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ArrayList<RegistrationBean> bean = new ArrayList<RegistrationBean>();
		response.setContentType("text/html");
		RegistrationService registrationservice = new RegistrationService();
		bean= registrationservice.fetchData();
		
		request.setAttribute("ar", bean);
		 RequestDispatcher rd=request.getRequestDispatcher("first1.jsp");  
	        rd.forward(request, response);  
		//response.sendRedirect("first1.jsp");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	
	}

}
