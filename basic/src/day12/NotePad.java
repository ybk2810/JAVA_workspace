package day12;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotePad extends JFrame implements ActionListener {
	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu jmFile, jmHelp;
	JMenuItem jmiNew, jmiOpen, jmiSave, jmiExit;
	JMenuItem jmiHelp;

	NotePad() {
		setTitle("제목없음 - 메모장");
		// 메뉴관련 컴포넌트를 초기화
		jmb = new JMenuBar();
		jmFile = new JMenu("FILE");
		jmHelp = new JMenu("HELP");
		jmiNew = new JMenuItem("NEW");
		jmiOpen = new JMenuItem("OPEN");
		jmiSave = new JMenuItem("SAVE");
		jmiExit = new JMenuItem("EXIT");
		jmiHelp = new JMenuItem("HELP");
		// 이벤트 처리
		// 종류 버튼을 누르면 종료
		// new버튼을 내용삭제
		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiHelp.addActionListener(this);

		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator();// 구분선
		jmFile.add(jmiExit);
		jmHelp.add(jmiHelp);

		// meny ==> menubar
		jmb.add(jmFile);
		jmb.add(jmHelp);

		setJMenuBar(jmb);

		jta = new JTextArea();
		Font f = new Font("고딕", Font.BOLD, 25);
		jta.setFont(f);

		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		add(jsp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NotePad();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jmiExit) {
			int result = JOptionPane.showConfirmDialog(this, "종료", "종료하시겠습니까?", JOptionPane.YES_NO_OPTION);
			if (result == 0) {
				System.exit(0);
			}
		} else if (obj == jmiNew) {
			String txt = jta.getText();
			if (txt.length() > 0) {
				int result = JOptionPane.showConfirmDialog(this, "변경 내용을 제목없음에 저장하시겠습니까?", "메모장",
						JOptionPane.YES_NO_OPTION);
				if (result == 0) {
					System.out.println("save");
				}
			}
			jta.setText("");
		} else if (obj == jmiOpen) {
			JFileChooser jfc = new JFileChooser("c:\\");
			int result = jfc.showOpenDialog(this);
			System.out.println(result);
			if (result == JFileChooser.APPROVE_OPTION) {
				File f = jfc.getSelectedFile();
				try {
					BufferedReader br = new BufferedReader(new FileReader(f));
					String line = "";
					String data = "";
					while ((line = br.readLine()) != null) {
						data += line + "\n";
					}
					jta.setText(data);
					// System.out.println(f.getAbsolutePath());
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} else if (obj == jmiSave) {
			JFileChooser jfc = new JFileChooser();
			int result = jfc.showSaveDialog(this);

			if (result == JFileChooser.APPROVE_OPTION) {
				File f = jfc.getSelectedFile();
				
				try {
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
					pw.println(jta.getText());
					pw.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		}
	}
}
