package edu.kh.bookList.controller;

import java.io.IOException;

import edu.kh.bookList.model.service.BookService;
import edu.kh.bookList.model.service.BookServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet ("/booklist/add")
public class AddServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			
			BookService service = new BookServiceImpl();
			
			String bookTitle = req.getParameter("bookTitle");
			String bookWriter = req.getParameter("bookWriter");
			
			int result = service.add(bookTitle,bookWriter);
			
			String message = null;
			HttpSession session = req.getSession();
			
			if(result>0) message = "책 추가 완료";
			else message ="추가 실패";
			
			session.setAttribute("messgae", message);
			
			String path = "/";
			req.getRequestDispatcher(path).forward(req, resp);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
