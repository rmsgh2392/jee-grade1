package com.web.grade.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.grade.DAOImpl.GradeDAOImpl;


@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "move":
			 request.getRequestDispatcher
			(String.format(
			GradeDAOImpl.VIEW_PATH,"student"
			,request.getParameter("dest")))
			.forward(request, response);
			break;
		case "register":
			 request.getRequestDispatcher
			(String.format(
			GradeDAOImpl.VIEW_PATH,"student"
			,request.getParameter("dest")))
			.forward(request, response);
			break;
		case "login":
			 request.getRequestDispatcher
			("index.jsp")
			.forward(request, response);
			break;
			
		default:
			break;
		}
	
//		RequestDispatcher rd = request.getRequestDispatcher
//		(String.format("WEB-INF/views/student/%s.jsp",request.getParameter("dest")));
//		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
