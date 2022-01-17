package com.bharath.patterns.frontcontroller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Dispatcher {

	public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) {

		if (view != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(mapPageToView(view));
			try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String mapPageToView(String view) {
		if (view.equals("showStudentDetails")) {
			return "viewStudentDetails.jsp";
		}

		return null;
	}

}
