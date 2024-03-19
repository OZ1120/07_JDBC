package edu.kh.bookList.model.dao;

import static edu.kh.bookList.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.bookList.model.dto.BookList;

public class BookDAOImpl implements BookDAO  {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	public BookDAOImpl() {
		try {
			prop = new Properties();
			String path = BookDAOImpl.class.getResource("/edu/kh/bookList/sql/sql.xml").getPath();
			prop.loadFromXML(new FileInputStream(path));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public List<BookList> selectAll(Connection conn) throws SQLException {

		List<BookList> bookList = new ArrayList<BookList>();

		try {
			String sql = prop.getProperty("selectAll");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String bookTitle = rs.getString("BOOK_TITLE");
				String bookWriter = rs.getString("BOOK_WRITER");
				String readDate = rs.getString("READ_DATE");
				
				BookList book = new BookList(bookTitle, bookWriter, readDate);
				
				bookList.add(book);
				
			}
			
		} finally {
			close(rs);
			close(stmt);
		}
		return bookList;
	}
	
	
	// 책삭제
	@Override
	public int deleteBook(Connection conn, String bookTitle) throws SQLException {
		
		int result = 0;
		
		try {
			
			String sql = prop.getProperty("deleteBook");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bookTitle);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		return result;
	}

	
	
	// 책 검색
	@Override
	public List<BookList> search(Connection conn, String keyword) throws SQLException {
		
		List<BookList> bookList = new ArrayList<BookList>();
		
		try {
			String sql = prop.getProperty("search");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, keyword);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookTitle = rs.getString("BOOK_TITLE");
				String bootWriter = rs.getString("BOOK_WRITER");
				String readDate = rs.getString("READ_DATE");
				
				BookList book = new BookList(bookTitle, bootWriter, readDate);
				bookList.add(book);
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		return bookList;
	}
	
	// 책 추가
	@Override
	public int add(Connection conn, String bookTitle, String bookWriter) throws SQLException {
		int result = 0;
		try {
			String sql = prop.getProperty("add");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookTitle);
			pstmt.setString(2, bookWriter);

			result = pstmt.executeUpdate();
		
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	// 수정 페이지
	@Override
	public BookList selectBook(Connection conn, String bookTitle) throws SQLException {
		BookList book = null;
		try {
			String sql = prop.getProperty("selectBook");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookTitle);

			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				
			}
			
		} finally {
			// TODO: handle finally clause
		}
		
		
		return book;
	}
	
}
