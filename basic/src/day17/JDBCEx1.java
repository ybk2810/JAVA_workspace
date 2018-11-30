package day17;
// DB => Oracle

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//		 ms-SQL
//		 MySQL
//		 MariaDB
// JDBC driver

// JDBC

// 1. JDBC driver 로딩
// 2. Connection 객체 생성
// 3. SQL문을 작성
// 4. 문장객체를 생성
// 5. 문장 실행
// 6. Resultset 객체로 리턴 (select문만)
// 7. 자원반납

public class JDBCEx1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
		// jdbc에서 oracle에 thin
		// @ip
		// port: 1521
		// orcl: DB이름
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. JDBC driver 로딩
			Class.forName(driver);
			
			// 2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn: " + conn);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
		
		// 3. SQL문을 작성
		String sql = "SELECT * FROM dept";
		
		try {
			// 4. 문장객체를 생성
			stmt = conn.createStatement();
			
			// 5. 문장 실행
			rs = stmt.executeQuery(sql);
			
			// 6. Resultset 객체로 리턴 (select문만)
			System.out.println("rs: " + rs);
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString(3); // 3번째(colomn은 1,2,3 번재 )
				System.out.println(deptno + " : " + dname + " : " + loc);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			// 7. 자원반납
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
