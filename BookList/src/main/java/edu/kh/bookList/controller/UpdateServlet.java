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
	
 // 수정 페이지 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			BookService service = new BookServiceImpl();
			String bookTitle = req.getParameter("bookTitle");
			
			BookList book = service.selectBook(bookTitle);
			
			if(book != null) {
				req.setAttribute("book", book);
				String path = "/WEB-INF/views/update.jsp";
				req.getRequestDispatcher(path).forward(req, resp);
			}else {
				req.getSession().setAttribute("message", "존재하는 책이 없습니다");
				resp.sendRedirect("/");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}
