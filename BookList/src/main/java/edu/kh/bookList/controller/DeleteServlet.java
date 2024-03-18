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

@WebServlet("/booklist/delet")
public class DeleteServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			// 서비스 객체 생성
			BookService service = new BookServiceImpl();
			// 제출된 파라미터 얻어오기
			String bookTitle = req.getParameter("bookTitle");
			// 서비스 메서드 호출 후 결과 반환 받기
			int result = service.deleteBook(bookTitle);
			
			String message = null;
			HttpSession session = req.getSession();
			
			// session 에 성공/실페 메세지 속성 추가
			if(result >0) message = "삭제 성공";
			else		message = "삭제 실패";
			
			session.setAttribute("message", message);
			
			// 전체 부서 조회 재요청
			resp.sendRedirect("selectAll");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
