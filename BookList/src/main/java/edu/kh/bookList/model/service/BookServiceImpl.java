package edu.kh.bookList.model.service;

import static edu.kh.bookList.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.kh.bookList.model.dao.BookDAO;
import edu.kh.bookList.model.dao.BookDAOImpl;
import edu.kh.bookList.model.dto.BookList;

public class BookServiceImpl implements BookService{

	private BookDAO dao = null;
	
	public BookServiceImpl() {
		dao= new BookDAOImpl();
	}
	
	@Override
	public List<BookList> selectAll() throws SQLException {
		
		Connection conn = getConnection();
		
		List<BookList> bookList = dao.selectAll(conn);
		
		close(conn);
		
		return bookList;
	}
	
	
	// 책 삭제
	@Override
	public int deleteBook(String bookTitle) throws SQLException {
		Connection conn = getConnection();
		
		int result = dao.deleteBook(conn, bookTitle);
		
		if(result>0) commit(conn);
		else   rollback(conn);
		
		close(conn);
		
		return result;
	}
	
}
