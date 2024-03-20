package edu.kh.bookList.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShopDAO2 {
	
	private PreparedStatement pstmt;
	private ResultSet rs ;
	
	// memberId가 일치하는 회원의 phone 수정하기
	public int updateMember(Connection conn,String memberId, String phone) {
		
		// 결과 저장용 변수
		 int result = 0; // 수정된 행의 개수 저장
		try {
			String sql = "UPDATE SHOP_MEMBER SET "
					+ "PHONE = ?"
					+"WHERE MEMBER_ID =?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, memberId);
			
			result = pstmt.executeUpdate(); // DML은 executeUpdate
														// 변경된 행의 개수 반환
			
			
			
		}finally {
			close(pstmt);
		}
		return result ;
	}
	

}
