package edu.kh.bookList.controller;

import java.io.IOException;

import edu.kh.bookList.model.dto.BookList;
import edu.kh.bookList.model.service.BookService;
import edu.kh.bookList.model.service.BookServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/booklist/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			BookService service = new BookServiceImpl();
			String bookTitle = req.getParameter("bookTitle");
			
			BookList book = service.selectBook(bookTitle);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
