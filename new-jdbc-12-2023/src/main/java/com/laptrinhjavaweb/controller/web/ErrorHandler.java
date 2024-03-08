package com.laptrinhjavaweb.controller.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;

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

@WebServlet(urlPatterns = {"/trang-loi"})
public class ErrorHandler extends HttpServlet {
	
    private HashMap<Integer, String> errorPages;
    
    
    //viet mot phuong thuc, bo ma vao
   public String ErrorHand(int errorCode) {
	  if (errorPages.containsKey(errorCode)) {
		  String x = (String) errorPages.get(errorCode);
		  return x+ ".jsp";
	  }
	  return null;
   }
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		        PrintWriter out = resp.getWriter();
		        out.print("Khong tim thay trang: 404 - NOT FOUND");
		     if (ErrorHand(resp.)
		    		 resp.superClass();
		      RequestDispatcher rd = req.getRequestDispatcher("/views/web/error.jsp"); //trỏ vào trang error.jsp
		    rd.forward(req, resp);
		    
	}

	
}
