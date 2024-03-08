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


//@WebServlet(urlPatterns = { "/trang-chu" })

@WebServlet(name = "TrangChu", urlPatterns = {"/trang-chu"} //Đánh dấu lớp hiện tại là một servlet
 //initParams = {
//@WebInitParam(name = "abc", value = "xyzt") //Trong InitPam, tất cả đều là String 
//}
		)

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserModel userModel = new UserModel();
		//userModel.setFullName("Quyen Phan");
		request.setAttribute("model", userModel);
		
		response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp"); //trỏ vào controller
        rd.forward(request, response);
	}
        /*
     
        String title = "Reading All Form Parameters";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 \" + \"transitional//en\">\\n";
        out.println(docType +
                "<html>\\n" +
                "<head><title>" + title + "</title></head>\\n" +
                "<body bgcolor = \"#f0f0f0\">\\n" +
                "<h1 align = \"center\">" + title + "</h1>\\n" +
                "<table width = \"100%\" border = \"1\" align = \"center\">\\n" +
                "<tr bgcolor = \"#949494\">\\n" +
                "<th>Param Name</th>" +
                "<th>Param Value (s)</th>\\n" +
                "</tr>\\n"
            ); 
        
       

        
		
@SuppressWarnings("rawtypes")
Enumeration headerNames = request.getHeaderNames();
 while (headerNames.hasMoreElements()) {
	 String headerName = (String) headerNames.nextElement();
	 out.print("<tr><td>" + headerName + "</td>\n)");
	 String headValue =request.getHeader(headerName);
	 out.println("<td> " + headValue + "</td></tr>\n");
 }
	out.println("</table>\n</body></html>");
	 
	
	 
	
 }
	
	/* private class ServletConfig_Do implements ServletConfig {
	    ServletConfig x;
		
	    ServletConfig_Do(ServletConfig a) {
	    	
	    }
	    
		@Override
		public String getServletName() {
			// TODO Auto-generated method stub
			
			return null;
		}
		
		@Override
		public ServletContext getServletContext() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Enumeration getInitParameterNames() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getInitParameter(String name) {
			// TODO Auto-generated method stub
			return null;
		}
	};
/*
	private class Vidu_HttpResponse {
	    public void redirect(HttpServletResponse response, String url) {
	        String encodedURL = response.encodeRedirectURL(url);
	        try {
	            response.sendRedirect(encodedURL);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	     public void addCookie_TuiDo(HttpServletResponse response, Cookie cookie) {	     
	     try {
	      response.addCookie(cookie);	  
	    }
	    catch (IOException e) {
	      e.printStackTrace();
	}
	}
	
	public void addDateHeader_Tuido(String name, long date) {
	 try {
	 
	
	

*/
	
	
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}

