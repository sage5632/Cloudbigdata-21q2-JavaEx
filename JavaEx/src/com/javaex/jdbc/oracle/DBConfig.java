package com.javaex.jdbc.oracle;

import java.sql.*;
public class DBConfig {
	public static String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static String DBUSER = "hr";
	public static String DBPASS = "hr";
	
	static Connection getConnection() throws SQLException {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			} catch (ClassNotFoundException e) {
				System.err.println("드라이버 로드 실패!");
			}
		return conn;
	}
}
