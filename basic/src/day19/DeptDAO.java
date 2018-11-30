package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// Database Access Object
public class DeptDAO {
	// 0. ��������
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
	String user = "scott";
	String password = "tiger";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	StringBuffer sb = new StringBuffer();

	public DeptDAO() {
		// ������
		// 1. JDC driver �ε�
		// 2. Connection ��ü ����
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("����̺� �ε�����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		} // try~catch end
	} // constructer end

	// CRUD
	// 1) ���̺� ��ü��ȸ
	public ArrayList<DeptVO> selectAll() {
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		// SQL���� �ʱ�ȭ
		sb.setLength(0); // ���� ���̸� 0����

		// 3. SQL���� �ۼ�
		sb.append("SELECT* FROM dept");

		try {
			// 4. ���尴ü�� ����
			pstmt = conn.prepareStatement(sb.toString());
			// 5. ���� ���� (ResultSet ��ü)
			rs = pstmt.executeQuery();

			// 6. ���ڵ庰 ���� ó��
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				// VO
				DeptVO vo = new DeptVO();
				vo.setDeptno(deptno);
				vo.setDname(dname);
				vo.setLoc(loc);

				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 7. �ڿ��ݳ�
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

		return list;
	}

	// 2) Ư�� ������ 1�� ��ȸ
	public DeptVO selectOne(int no) {
		// SQL���� �ʱ�ȭ
		sb.setLength(0); // ���� ���̸� 0����

		// 3. SQL���� �ۼ�
		sb.append("SELECT * FROM DEPT ");
		sb.append("WHERE deptno = ?");

		System.out.println("SQL�� ���: " + sb.toString());

		DeptVO vo = new DeptVO();
		try {
			// 4. ���尴ü�� ����
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);

			// 5. �������
			rs = pstmt.executeQuery();

			// 6. ResultSet ��ü�� ���� (select����)
			rs.next();
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			vo.setDeptno(deptno);
			vo.setDname(dname);
			vo.setLoc(loc);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 7. �ڿ��ݳ�
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
		return vo;
	}

	// 3) �߰�
	public void insertOne(DeptVO vo) {
		// SQL���� �ʱ�ȭ
		sb.setLength(0); // ���� ���̸� 0����

		// 3. SQL���� �ۼ�
		sb.append("INSERT INTO DEPT ");
		sb.append("VALUES ( DEPT_DEPTNO.NEXTVAL, ?, ? ) ");

		try {
			// 4. ���尴ü�� ����
			pstmt = conn.prepareStatement(sb.toString());

			// 5. �������
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());

			int result = pstmt.executeUpdate();
			System.out.println("result: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 7. �ڿ��ݳ�
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
	}

	// 4) ����
	public void updateOne(DeptVO vo) {
		// SQL���� �ʱ�ȭ
		sb.setLength(0); // ���� ���̸� 0����

		// 3. SQL���� �ۼ�
		sb.append("UPDATE dept ");
		sb.append("SET dname = ?, loc = ? ");
		sb.append("WHERE deptno = ? ");
		
		try {
			// 4. ���尴ü�� ����
			pstmt = conn.prepareStatement(sb.toString());
			// 5. �������
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			pstmt.setInt(3, vo.getDeptno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 7. �ڿ��ݳ�
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
		

	}

	// 5) ����
	public void deleteOne(int no) {
		// SQL���� �ʱ�ȭ
		sb.setLength(0); // ���� ���̸� 0����

		// 3. SQL���� �ۼ�
		sb.append("DELETE DEPT ");
		sb.append("WHERE deptno = ? ");

		try {
			// 4. ���尴ü�� ����
			pstmt = conn.prepareStatement(sb.toString());
			// 5. �������
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 7. �ڿ��ݳ�
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
	}
	
	public void close() {
		// ��������
		try {
			if (rs != null)	rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
} // class end
