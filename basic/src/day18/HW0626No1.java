package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HW0626No1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 부서명 입력: ");
		String no = sc.nextLine();
		
		no = no.toUpperCase();
		
		// 0. 변수선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		 
		try {
			//1. JDBC driver 로딩
			Class.forName(driver);
			
			// 2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn: " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
		
		//3. SQL문을 작성
		sql.append("SELECT DEPTNO, DNAME, LOC FROM dept "); 
		sql.append("WHERE DNAME = ? "); // 갖다 붙여넣기 기능이기 때문에 끝에 띄어쓰기
		// bind 변수
		
		try {
			//4. 문장객체를 생성
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, no);
			
			//5. 문장 실행
			rs = pstmt.executeQuery();
			
			//6. Resultset 객체로 리턴 (select문만)
			System.out.println("rs: " + rs);
			while(rs.next()) {
				int deptno = rs.getInt("DEPTNO");
				String dname = rs.getString("DNAME");
				String loc = rs.getString("loc");
				System.out.println(deptno + " : " + dname + " : " + loc);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 7. 자원반납
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
