package com.laptrinhjavaweb.controller.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.laptrinhjavaweb.model.UserModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AuthenticationFilterHandling implements Filter{
	//Độ lại interface Filter thôi :>>>
	/*
	 * dau sau nay khong ai biet chua nang cua no la gi het nhug
	 * ta van phai tap code tay
	 * va hieu duoc y nghia cua no!
	 */
	
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // khởi tạo filter
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        // Xử lý trước khi request được chuyển đến Servlet
    	//vì đây là Servlet for authentication 
    	if (isAuthenticated(req)) {
    		chain.doFilter(req, resp);
    		RequestDispatcher rd = req.getRequestDispatcher("/dang-nhap");
    	}
    	else {
    		RequestDispatcher rd = req.getRequestDispatcher("/trang-chu");
    		rd.include(req, resp);
    		
    		
    	}
    	
        // Gọi chain.doFilter() để chuyển request đến Servlet tiếp theo trong chuỗi Filter
        

        // Xử lý sau khi Servlet hoàn thành xử lý request
    }
    
    private boolean isAuthenticated(HttpServletRequest req) {
       Cookie[] c = req.getCookies(); //lấy tất cả cookie
       String userName = req.getAttribute("userName");
       String pass = req.getAttribute("pass");
       for (Cookie cookie  : c) {
    	   if (cookie.getName().equals("session_ID")) {
    		   String session_ID = cookie.getValue();
    		   String path = "C:\\Users\\DungManh Laptop\\Downloads\\test.json";
    		   FileReader jsonFile = new FileReader(path);
    		   BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
    	       Gson gson = new Gson();
    	       UserModel[] jsonUser = gson.fromJson(bufferedReader, UserModel[].class);
    	       for(UserModel user : jsonUser) {
    	    	   if (user.getUserName().equals(userName) && user.getPass().equals(pass)) {
    	    		   return true;
    	    	   }
    	       }
    	       
    	       return false;
    	   }
    		   
    		   
    		  
    		   
    		   
    		   		
    		   
    		   
    		   //check xem userName và pass có trùng hay không
    	   }
       }
       
    }
    @Override
    public void destroy() {
        // Hủy filter
    }
}
	
	

