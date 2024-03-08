package com.laptrinhjavaweb.controller.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

public class AuthenticationFilterHandling implements Filter{
	
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
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Xử lý trước khi request được chuyển đến Servlet
    	
        // Gọi chain.doFilter() để chuyển request đến Servlet tiếp theo trong chuỗi Filter
        chain.doFilter(request, response);

        // Xử lý sau khi Servlet hoàn thành xử lý request
    }
    
    @Override
    public void destroy() {
        // Hủy filter
    }
}
	
	

}
