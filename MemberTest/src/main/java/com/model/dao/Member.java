package com.model.dao;

import com.core.DB;
import com.model.dto.MemberBean;
import java.sql.*;

/**
 * 회원 추가, 삭제, 조회, 로그인
 *
 */
public class Member {
	/**
	 * 회원 추가
	 * 
	 * @param member
	 * @return Boolean true - 추가 성공
	 */
	public boolean insertMember(MemberBean member) {
		if (member == null) 
			return false;
		
		String memPw = member.getMemPw();
		
		String sql = "CALL InsertMember(?, ?, ?)";
		try (Connection conn = DB.getConnection();
			 CallableStatement cstmt = conn.prepareCall(sql)) {
			cstmt.setString(1, member.getMemId());
			cstmt.setString(2, memPw);
			cstmt.setString(3, member.getMemNm());
			int rs = cstmt.executeUpdate(); // 반영된 투플의 갯수 
			if (rs > 0) 
				return true;
			
		} catch (SQLException | ClassNotFoundException e) {
			// 로그 기록 ... 
			return false;
		}
		
		return false;
	}
}
