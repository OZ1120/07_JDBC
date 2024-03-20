package edu.kh.bookList.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShopDAO {
	
	private PreparedStatement pstmt;
	private ResultSet rs ;
	
	// 같은 성별이 몇명인가?
	public int selectGender(Connection conn,String gender) {
		
		int resutl = 0; // 결과 저장용 변수
		try {
			String sql = "SELECT COUNT(*) FROMG sHOP_MEMBER"
					+ "WHERE GENDER = ?";
			
			pstmt =conn.prepareStatement(sql); // SQL 미리 적재
			pstmt.setString(1, gender);
			
			rs = pstmt.executeQuery();// 결과 행 1행짜리 ResultSet 반환
			
			if(rs.next()) {
				// 아래 두개 다 정답!
				result = rs.getInt("COUNT(*)");// 컬럼명
				// result = rs.getInt(1); // 컬럼순서
			}
			
			
		}finally {
			close(rs);
			close(pstmt);
		}
		return result;
	}
	

}
