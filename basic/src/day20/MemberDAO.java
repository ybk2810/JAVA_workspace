package day20;
//day10 Login
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 1. 변수선언
// 2. 드라이버로딩
// 3. Connection 객체 생성
// 4. SQL문 작성
// 5. 문장객체
// 6. 실행(select ==> ResultSet)
// 7. 레코드별 로직 처리
// 8. 자원반납
public class MemberDAO {
	// 1. 변수선언
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
	String user = "scott";
	String password = "tiger";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	StringBuffer sb = new StringBuffer();
	
	// CRUD
	public MemberDAO() {
		try {
			// 2. 드라이버로딩
			Class.forName(driver);
			// 3. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 로딩실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		} // try~catch end
	} // constructor end
	
//	isXXX()
//	File f = new File('c:\Hello.java');
//	f.isDirectory();
	
	public boolean isLogIn(String id, String pw) {
		// 4. SQL문 작성
		sb.setLength(0);
		sb.append("SELECT ID FROM MEMBER ");
		sb.append("WHERE id = ? AND pw = ? ");
		boolean isOK = false;
		try {
			// 5. 문장객체
			pstmt = conn.prepareStatement(sb.toString());
			
			// 6. 실행(select ==> ResultSet)
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			// 7. 레코드별 로직 처리
			isOK = rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 8. 자원반납
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isOK;
	}
	// selectALL()
	// selectONE()
	// insertOne()
	// updateOne()
	// deleteOne()
	
} // class end
