package dao1204;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbconnect1204.DBConnect;

public class MemberDao {
	
	//1. 회원가입
	public int InsertDo(String userId, String userPw, String email, String userName) {
		int result = 0;
		
		System.out.println("ID : " + userId + " | Password : " + userPw + " | email : " + email + " | Name : " + userName);
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into usertable(userid, userpw, email, username) values(?,?,?,?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, email);
			pstm.setString(4, userName);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	//2. 회원조회
	
	
	//3. 회원수정
	public int UpdateDo(String userId, String userPw, String email, String userName) {
		int result = 0;
		
		System.out.println("ID : " + userId + " | Password : " + userPw + " | email : " + email + " | Name : " + userName);
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "update usertable userPw=?, email=?, userName=? where userId=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userPw);
			pstm.setString(2, email);
			pstm.setString(3, userName);
			pstm.setString(4, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {}
		}
		return result;
	}
	
	//4. 회원탈퇴
	public int DeleteDo(String userId, String userPw, String email, String userName) {
		int result = 0;
		
		System.out.println("ID : " + userId + " | Password : " + userPw + " | email : " + email + " | Name : " + userName);
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "delete from where userId=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
