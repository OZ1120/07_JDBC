package edu.kh.dept.controller;

import java.io.IOException;
import java.sql.Connection;

import edu.kh.dept.common.JDBCTemplate;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet : 현재 클래스를 서블릿으로 등록 (서버 실행 시 객체 생성)
//		+URL 매핑
@WebServlet("/department/selectAll")
public class SelectAllServlet extends HttpServlet {

	
	// Get방식 요청 처리
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException{
		
		try {
			Connection conn = JDBCTemplate.getConnection();
			
			System.out.println(conn);
			
			JDBCTemplate.close(conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
