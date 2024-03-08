package com.laptrinhjavaweb.controller.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.UserModel;

@WebServlet(urlPatterns = {"/dang-ki"})

public class LoginForm extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		UserModel user1 = new UserModel();
		req.setAttribute("model", user1);
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/signin.jsp"); // trỏ vào controller
		rd.include(req, resp);
	}
}
