package com.examples.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.dao.BookDao;

@WebServlet("/BookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  static final String List_Books ="books.jsp";
	private static final String  Insert_Edit="insert.jsp";
	private BookDao bookDao;

	public BookController() {
		super();
		// TODO Auto-generated constructor stub
		bookDao =new BookDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String action = request.getParameter("action");
		String forward = null;
		if(action.equals("list")){
			forward =List_Books;
			request.setAttribute("books",bookDao.getAllBooks());
		}else if(action.equals("insert")){
			
	forward=Insert_Edit;
	}
	else if(action.equals("edit")){
		int id =0;
		
	}
	else if(action.equals("delete")){
		
	}
	RequestDispatcher rd =request.getRequestDispatcher(forward);
	rd.forward(request, response);

	
}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
