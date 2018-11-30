package day20;
//day10 Login
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 1. ��������
// 2. ����̹��ε�
// 3. Connection ��ü ����
// 4. SQL�� �ۼ�
// 5. ���尴ü
// 6. ����(select ==> ResultSet)
// 7. ���ڵ庰 ���� ó��
// 8. �ڿ��ݳ�
public class MemberDAO {
	// 1. ��������
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
			// 2. ����̹��ε�
			Class.forName(driver);
			// 3. Connection ��ü ����
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("����̺� �ε�����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		} // try~catch end
	} // constructor end
	
//	isXXX()
//	File f = new File('c:\Hello.java');
//	f.isDirectory();
	
	public boolean isLogIn(String id, String pw) {
		// 4. SQL�� �ۼ�
		sb.setLength(0);
		sb.append("SELECT ID FROM MEMBER ");
		sb.append("WHERE id = ? AND pw = ? ");
		boolean isOK = false;
		try {
			// 5. ���尴ü
			pstmt = conn.prepareStatement(sb.toString());
			
			// 6. ����(select ==> ResultSet)
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			// 7. ���ڵ庰 ���� ó��
			isOK = rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 8. �ڿ��ݳ�
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
