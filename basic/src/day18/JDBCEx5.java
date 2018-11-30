package day18;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JDBCEx5 extends JFrame implements ActionListener {
	// 0. ��������
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.32:1521:orcl";
	String user = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sql = new StringBuffer();

	JLabel jlNo, jlName, jlLoc, jlDeptno;
	TextField jtfNo, jtfName, jtfLoc, jtfDeptno;
	JButton jtbnSave, jtbnRead;

	JDBCEx5() {
		setLayout(null);

		jlNo = new JLabel("No");
		jlName = new JLabel("Name");
		jlLoc = new JLabel("Loc");
		jtfNo = new TextField(10);
		jtfName = new TextField(10);
		jtfLoc = new TextField(10);
		jtbnSave = new JButton("SAVE");
		jlDeptno = new JLabel("Deptno");
		jtfDeptno = new TextField(10);
		jtbnRead = new JButton("READ");

		jlNo.setBounds(50, 30, 100, 30);
		jlName.setBounds(200, 30, 100, 30);
		jlLoc.setBounds(350, 30, 100, 30);
		jtfNo.setBounds(50, 60, 100, 30);
		jtfName.setBounds(200, 60, 100, 30);
		jtfLoc.setBounds(350, 60, 100, 30);
		jtbnSave.setBounds(100, 100, 300, 30);
		jlDeptno.setBounds(50, 160, 100, 30);
		jtfDeptno.setBounds(200, 160, 100, 30);
		jtbnRead.setBounds(100, 200, 300, 30);

		add(jlNo);
		add(jlName);
		add(jlLoc);
		add(jtfNo);
		add(jtfName);
		add(jtfLoc);
		add(jtbnSave);
		add(jlDeptno);
		add(jtfDeptno);
		add(jtbnRead);

		jtbnSave.addActionListener(this);
		jtbnRead.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JDBCEx5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == jtbnSave) {
			String no = jtfNo.getText().trim();// ��������: trim
			int n = Integer.parseInt(no);// int�� ����ȯ
			String dname = jtfName.getText().trim();// ��������: trim
			String loc = jtfLoc.getText().trim();// ��������: trim
			System.out.println(no + " : " + dname + " : " + loc);
			try {
				// 1. JDBC driver �ε�
				Class.forName(driver);

				// 2. Connection ��ü ����
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("conn: " + conn);
				// 3. SQL���� �ۼ�
				StringBuffer sb = new StringBuffer();
				sb.append("INSERT INTO dept ");
				sb.append("VALUES ( DEPT_DEPTNO.NEXTVAL,?,?) ");

				// 4. ���尴ü�� ����
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setInt(1, n);
				pstmt.setString(1, dname);
				pstmt.setString(2, loc);
				// 5. ���� ����
				pstmt.executeUpdate();

				// 6. Resultset ��ü�� ���� (select����)
			} catch (ClassNotFoundException e1) {
				System.out.println("����̹� �ε� ����");
			} catch (SQLException e1) {
				System.out.println("DB ���� ����");
			} finally {
				// 7. �ڿ��ݳ�
				try {
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} else if (obj == jtbnRead) {
			try {
				// 1. JDBC driver �ε�
				Class.forName(driver);
				// 2. Connection ��ü ����
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("conn: " + conn);
			} catch (ClassNotFoundException e1) {
				System.out.println("����̹� �ε� ����");
			} catch (SQLException e1) {
				System.out.println("DB ���� ����");
			}

			// 3. SQL���� �ۼ�
			sql.append("SELECT * FROM dept ");
			sql.append("WHERE DEPTNO = ? "); // ���� �ٿ��ֱ� ����̱� ������ ���� ����

			try {
				// 4. ���尴ü�� ����
				pstmt = conn.prepareStatement(sql.toString());

				// 5. ���� ����
				String dno = jtfDeptno.getText().trim();// ��������: trim
				int dn = Integer.parseInt(dno);// int�� ����ȯ
				pstmt.setInt(1, dn);

				// 6. Resultset ��ü�� ���� (select����)
				rs = pstmt.executeQuery();
				rs.next();
				
				String deptName = rs.getString("dname");
				String locName = rs.getString("loc");
				jtfNo.setText("" + dn);
				jtfName.setText(deptName);
				jtfLoc.setText(locName);
				

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				// 7. �ڿ��ݳ�
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}
