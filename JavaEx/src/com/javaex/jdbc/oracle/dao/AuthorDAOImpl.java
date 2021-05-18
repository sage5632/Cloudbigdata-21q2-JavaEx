package com.javaex.jdbc.oracle.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class AuthorDAOImpl implements AuthorDAO {
	// 공통 접속
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbur1,
					"C##PARKJH","1234");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		}
		return conn;
	}
	
	@Override
	public List<AuthorVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		// SELECT
		ResultSet rs = null;
		// 결과 객체
		List<AuthorVO> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			// 쿼리
			String sql = "SELECT author_id, author_name, author_desc " +
			"FROM author";
			// 쿼리 실행
			rs = stmt.executeQuery(sql);
			
			// ResultSet -> Java 객체로 변환
			while(rs.next()) { // 다음 레코드가 있으면 반환
				Long id = rs.getLong(1);
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3);
				
				// DTO 객체
				AuthorVO vo = new AuthorVO(id, authorName, authorDesc);
				// DTO 객체 -> List 추가
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				
			}
		}
		return list;
	}

	@Override
	public List<AuthorVO> serach(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorVO get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(AuthorVO vo) {
		// .executeUpdate 메서드 -> int (삽입된 레코드 수)
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			// 실행 계획
			String sql = "INSERT INTO author VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			// 파라미터 바인딩
			pstmt.setString(1,  vo.getAuthorName());
			pstmt.setString(2,  vo.getAuthorDesc());		
		//쿼리 수행
		insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
		
		return 1 == insertedCount; // 삽입된 레코드가 1개면 성공
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(AuthorVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
