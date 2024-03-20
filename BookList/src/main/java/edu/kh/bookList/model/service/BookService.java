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

	/** 책 검색
	 * @param keyword
	 * @return bookList
	 * @throws SQLException
	 */
	List<BookList> search(String keyword) throws SQLException;

	/** 책 추가
	 * @param bookTitle
	 * @param bookWriter
	 * @return result
	 * @throws SQLException
	 */
	int add(String bookTitle, String bookWriter) throws SQLException;

	/** 수정 페이지
	 * @param bookTitle
	 * @return book
	 * @throws SQLException
	 */
	BookList selectBook(String bookTitle) throws SQLException;

}
