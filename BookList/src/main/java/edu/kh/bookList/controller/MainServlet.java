package edu.kh.bookList.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import edu.kh.bookList.model.dto.BookList;
import edu.kh.bookList.model.service.BookService;
import edu.kh.bookList.model.service.BookServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("")
public class MainServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		try {
			// 책 목록 조회
			
			BookService service = new BookServiceImpl();

		  
		  List<BookList> bookList = service.selectAll();
		  
		  req.setAttribute("bookList", bookList);
			
			
			String path = "/WEB-INF/views/main.jsp";
			
			req.getRequestDispatcher(path).forward(req, resp);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
