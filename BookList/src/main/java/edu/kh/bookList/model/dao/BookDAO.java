package edu.kh.bookList.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.kh.bookList.model.dto.BookList;

public interface BookDAO {

	List<BookList> selectAll(Connection conn) throws SQLException;

	/** 책 삭제
	 * @param conn
	 * @param bookTitle
	 * @return result
	 * @throws SQLException
	 */
	int deleteBook(Connection conn, String bookTitle) throws SQLException;

	

}
