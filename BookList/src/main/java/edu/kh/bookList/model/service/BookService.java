package edu.kh.bookList.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import edu.kh.bookList.model.dto.BookList;

public interface BookService {

	List<BookList> selectAll() throws SQLException;

	/** 책 삭제
	 * @param bookTitle
	 * @return result
	 * @throws SQLException
	 */
	int deleteBook(String bookTitle) throws SQLException;
	

	

}
