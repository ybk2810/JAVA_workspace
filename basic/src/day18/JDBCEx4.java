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

		jlNo = new JLabel("부서번호");
		jlName = new JLabel("부서명");
		jlLoc = new JLabel("부서위치");
		jtfNo = new TextField(10);
		jtfName = new TextField(10);
		jtfLoc = new TextField(10);
		jtbn = new JButton("저장");

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

		String no = jtfNo.getText().trim();// 공백제거: trim

//		int n = Integer.parseInt(no);// int로 형변환
		String dname = jtfName.getText().trim();// 공백제거: trim
		String loc = jtfLoc.getText().trim();// 공백제거: trim

		// 0. 변수선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. JDBC driver 로딩
			Class.forName(driver);

			// 2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn: " + conn);
		} catch (ClassNotFoundException e1) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e1) {
			System.out.println("DB 연결 실패");
		}
		// 3. SQL문을 작성
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO dept ");
		sb.append("VALUES ( DEPT_DEPTNO.NEXTVAL,?,?) "); // 갖다 붙여넣기 기능이기 때문에 끝에 띄어쓰기
		// bind 변수

		// 4. 문장객체를 생성
		try {
			pstmt = conn.prepareStatement(sb.toString());
			// pstmt.setInt(1, n);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			// 5. 문장 실행
			pstmt.executeUpdate();

			// 6. Resultset 객체로 리턴 (select문만)
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			// 7. 자원반납
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
