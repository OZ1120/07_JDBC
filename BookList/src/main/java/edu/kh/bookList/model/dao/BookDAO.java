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

	/** 책 검색
	 * @param conn
	 * @param keyword
	 * @return
	 * @throws SQLException
	 */
	List<BookList> search(Connection conn, String keyword) throws SQLException;

	/** 책 추가
	 * @param conn
	 * @param bookTitle
	 * @param bookWriter
	 * @return
	 * @throws SQLException
	 */
	int add(Connection conn, String bookTitle, String bookWriter) throws SQLException;

	/** 수정 페이지
	 * @param conn
	 * @param bookTitle
	 * @return book
	 * @throws SQLException
	 */
	BookList selectBook(Connection conn, String bookTitle) throws SQLException;


}
