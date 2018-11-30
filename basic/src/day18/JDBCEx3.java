package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//1. JDBC driver �ε�
//2. Connection ��ü ����
//3. SQL���� �ۼ�
//4. ���尴ü�� ����
//5. ���� ����
//6. Resultset ��ü�� ���� (select����)
//7. �ڿ��ݳ�

public class JDBCEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �μ��� ��ȣ�� �Է�: ");
		int no = sc.nextInt();
		
		// 0. ��������
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		 
		try {
			//1. JDBC driver �ε�
			Class.forName(driver);
			
			// 2. Connection ��ü ����
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn: " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}
		
		//3. SQL���� �ۼ�
		sql.append("SELECT EMPNO, ENAME, SAL, JOB FROM emp "); 
		sql.append("WHERE DEPTNO = ? "); // ���� �ٿ��ֱ� ����̱� ������ ���� ����
		// bind ����
		
		try {
			//4. ���尴ü�� ����
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			
			//5. ���� ����
			rs = pstmt.executeQuery();
			
			//6. Resultset ��ü�� ���� (select����)
			System.out.println("rs: " + rs);
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				System.out.println(empno + " : " + ename + " : " + sal);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 7. �ڿ��ݳ�
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
