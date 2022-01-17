package com.bharath.patterns.mvc.assignment.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bharath.patterns.mvc.assignment.model.AssignmentModel;

/**
 * Servlet implementation class AssignmentController
 */
public class AssignmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));

		AssignmentModel model = new AssignmentModel();
		int result = model.getGreaterOfTwo(num1, num2);
		request.setAttribute("result", result);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("assignmentResult.jsp");
		requestDispatcher.forward(request, response);
	}

}
