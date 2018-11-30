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
		System.out.print("�˻��� �μ��� �Է�: ");
		String no = sc.nextLine();
		
		no = no.toUpperCase();
		
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
		sql.append("SELECT DEPTNO, DNAME, LOC FROM dept "); 
		sql.append("WHERE DNAME = ? "); // ���� �ٿ��ֱ� ����̱� ������ ���� ����
		// bind ����
		
		try {
			//4. ���尴ü�� ����
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, no);
			
			//5. ���� ����
			rs = pstmt.executeQuery();
			
			//6. Resultset ��ü�� ���� (select����)
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
