package com.microsoft.shop.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.microsoft.shop.service.ItemService;
import com.microsoft.shop.service.LoginService;

public class ControllerServlet extends HttpServlet{
	
	private LoginService loginservice;
	private ItemService itemService;
	
	@Override
	public void init() throws ServletException {
		loginservice = new LoginService();
		itemService = new ItemService();
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		String action = request.getParameter("action");
		String nextPage = "/login.jsp";
		
		
		
		if(page !=null) {
			if(page.equalsIgnoreCase("login")) {
				String user = request.getParameter("username");
				String password = request.getParameter("password");
				boolean isValid = loginservice.authenticate(user, password);
				if(isValid) {
					nextPage = "/items.jsp";
					request.setAttribute("items", itemService.fetchAllItems());
				} else {
					nextPage = "/login.jsp";
					request.setAttribute("loginError", "invalid username or password");
				}
			}else if(page.equalsIgnoreCase("items")) {
				
			}
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}


	@Override
	public void destroy() {
		
	}

	
	

}
