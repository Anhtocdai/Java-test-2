package com.laptrinhjavaweb.controller.web;

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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.fasterxml.jackson.core.JsonTokenId;
import com.google.gson.Gson;
import com.laptrinhjavaweb.model.UserModel;

public class LoginHandling extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		Gson gson = new Gson();
		FileReader jsonFile = new FileReader("C:\\Users\\DungManh Laptop\\Downloads\\dethiMang\\User.json");
		JSONTokener token = new JSONTokener(jsonFile);
		JSONObject jsonObject = new JSONObject(token);
		
		JSONArray jsonArray = jsonObject.getJSONArray("userName");
		//JSONArray jsonArray_pass = jsonObject.getJSONArray("password");
		
		for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject userObject = jsonArray.getJSONObject(i);
			if (userObject.getJSONArray("userName").equals(userName)
			&& userObject.getJSONArray("password").equals(password)) {
			req.getRequestDispatcher(password).include(req, resp);
			}
			else {
				PrintWriter out = resp.getWriter();
				out.println("Tai khoan hoac mat khau sai, vui long thu lai");
			}
		}
		
		
		
	}
	
	
	

}


