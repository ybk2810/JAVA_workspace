package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx2 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. JDBC driver �ε�
			Class.forName(driver);
			
			// 2. Connection ��ü ����
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn: " + conn);
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}
		
		// 3. SQL���� �ۼ�
		String sql = "SELECT EMPNO, ENAME, SAL, JOB FROM emp";
		
		try {
			// 4. ���尴ü�� ����
			stmt = conn.createStatement();
			
			// 5. ���� ����
			rs = stmt.executeQuery(sql);
			
			// 6. Resultset ��ü�� ���� (select����)
			System.out.println("rs: " + rs);
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String sal = rs.getString(3); // 3��°(colomn�� 1,2,3 ���� )
				String job = rs.getString(4); // 4��°(colomn�� 1,2,3 ���� )
				System.out.println(empno + " : " + ename + " : " + sal + " : " + job);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			// 7. �ڿ��ݳ�
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
