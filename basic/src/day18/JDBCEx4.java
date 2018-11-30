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

public class JDBCEx4 extends JFrame implements ActionListener {
	JLabel jlNo, jlName, jlLoc;
	TextField jtfNo, jtfName, jtfLoc;
	JButton jtbn;

	JDBCEx4() {
		setLayout(null);

		jlNo = new JLabel("�μ���ȣ");
		jlName = new JLabel("�μ���");
		jlLoc = new JLabel("�μ���ġ");
		jtfNo = new TextField(10);
		jtfName = new TextField(10);
		jtfLoc = new TextField(10);
		jtbn = new JButton("����");

		jlNo.setBounds(50, 70, 100, 30);
		jlName.setBounds(200, 70, 100, 30);
		jlLoc.setBounds(350, 70, 100, 30);
		jtfNo.setBounds(50, 100, 100, 30);
		jtfName.setBounds(200, 100, 100, 30);
		jtfLoc.setBounds(350, 100, 100, 30);
		jtbn.setBounds(200, 200, 100, 30);

		add(jlNo);
		add(jlName);
		add(jlLoc);
		add(jtfNo);
		add(jtfName);
		add(jtfLoc);
		add(jtbn);

		jtbn.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JDBCEx4();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		String no = jtfNo.getText().trim();// ��������: trim

//		int n = Integer.parseInt(no);// int�� ����ȯ
		String dname = jtfName.getText().trim();// ��������: trim
		String loc = jtfLoc.getText().trim();// ��������: trim

		// 0. ��������
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

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
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO dept ");
		sb.append("VALUES ( DEPT_DEPTNO.NEXTVAL,?,?) "); // ���� �ٿ��ֱ� ����̱� ������ ���� ����
		// bind ����

		// 4. ���尴ü�� ����
		try {
			pstmt = conn.prepareStatement(sb.toString());
			// pstmt.setInt(1, n);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			// 5. ���� ����
			pstmt.executeUpdate();

			// 6. Resultset ��ü�� ���� (select����)
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
	}
}
