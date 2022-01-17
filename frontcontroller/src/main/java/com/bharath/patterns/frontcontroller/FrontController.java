package com.bharath.patterns.frontcontroller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		CommandHelper commandHelper = new CommandHelper();
		Command command = commandHelper.getCommand(requestURI);
		String view = command.execute(request, response);
		Dispatcher dispatcher = new Dispatcher();
		dispatcher.dispatch(request, response, view);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
