package com.laptrinhjavaweb.controller.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.laptrinhjavaweb.model.UserModel;

@WebServlet(urlPatterns = { "/thanh-cong" })
public class FormInput extends HttpServlet {	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
	out.println("Hello");
	UserModel roleUser = new UserModel(req.getParameter("username"),
			req.getParameter("pass"), req.getParameter("name"),
			req.getParameter("bob"), req.getParameter("address"), 
			req.getParameter("gender"));
    HttpSession session = req.getSession(true);
    session.setAttribute("userName", roleUser.getUserName());
    session.setAttribute("password", roleUser.getPass());
    if (session.isNew()) {
    	out.print("<h1> Hi there, you are my very new Client! Take your beatiful time here. </h1>");
    	out.print(session.getAttribute("userName"));
    }
    else {
    	out.print("<h1> Hi my old one! How you are going these days </h1>");
    	//Bây giờ nó sẽ luôn hiện ra tôi là old one. Vì tôi đang tương tác với server
    	//qua một client.
    }
    

	}	
}

