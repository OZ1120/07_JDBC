package edu.kh.bookList.controller;

import java.io.IOException;
import java.util.List;

import edu.kh.bookList.model.dto.BookList;
import edu.kh.bookList.model.service.BookService;
import edu.kh.bookList.model.service.BookServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/booklist/search")
public class SearchServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			BookService service = new BookServiceImpl();
			
			String keyword = req.getParameter("keyword");
			
			List<BookList> bookList = service.search(keyword);
			
			req.setAttribute("bookList", bookList);
			
			
			String path = "/WEB-INF/views/search.jsp";
			req.getRequestDispatcher(path).forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
