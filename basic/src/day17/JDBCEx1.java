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

// 1. JDBC driver �ε�
// 2. Connection ��ü ����
// 3. SQL���� �ۼ�
// 4. ���尴ü�� ����
// 5. ���� ����
// 6. Resultset ��ü�� ���� (select����)
// 7. �ڿ��ݳ�

public class JDBCEx1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
		// jdbc���� oracle�� thin
		// @ip
		// port: 1521
		// orcl: DB�̸�
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
		String sql = "SELECT * FROM dept";
		
		try {
			// 4. ���尴ü�� ����
			stmt = conn.createStatement();
			
			// 5. ���� ����
			rs = stmt.executeQuery(sql);
			
			// 6. Resultset ��ü�� ���� (select����)
			System.out.println("rs: " + rs);
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString(3); // 3��°(colomn�� 1,2,3 ���� )
				System.out.println(deptno + " : " + dname + " : " + loc);
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
