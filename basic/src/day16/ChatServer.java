package day16;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatServer extends JFrame implements ActionListener {
	JTextArea jta;
	JScrollPane jsp;
	JButton jbtn;
	ServerSocket ss;
	ArrayList<MServer> list = new ArrayList<MServer>();

	public ChatServer() {
		jta = new JTextArea();
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		Font f = new Font("���", Font.BOLD, 15);
		jta.setFont(f);
		jbtn = new JButton("EXIT");
		jbtn.addActionListener(this);

		add(jsp, "Center");
		add(jbtn, "South");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setTitle("ChatServer");
		setVisible(true);

		// ä�ý���
		vChat();
	}

	public void vChat() {
		// ����� ���� ���� ��ü ����
		try {
			ss = new ServerSocket(5000);
			while (true) {
				// ���Ӵ��
				Socket client = ss.accept();
				MServer ms = new MServer(client);
				list.add(ms);
				ms.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatServer();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtn) {
			System.exit(0);
		}
	}// actrionPerformed() end

	// innerClass
	class MServer extends Thread {
		Socket s;
		String ip;
		PrintWriter pw;
		BufferedReader br;

		// ������
		MServer(Socket s) {
			this.s = s;
			// ip
			ip = s.getInetAddress().getHostAddress();
			try {
				// pw
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())));
				// br
				br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// �а� ���� ���
		String msg = null;

		@Override
		public void run() {
			brodcast("[" + ip + "] �� ȯ���մϴ�.");
			try {
				while (true) {
					msg = br.readLine();
					jta.append("[" + ip + "]" + msg + "\n");// �д� ���
					brodcast("[" + ip + "]: " + msg);
					// ���罺ũ�� ���� �Ʒ��� �̵�
					JScrollBar jsb = jsp.getVerticalScrollBar();

					int v = jsb.getMaximum();
					jsb.setValue(v);
				}

			} catch (Exception e) {
				list.remove(this);
				brodcast(ip + "���� �����ϼ̽��ϴ�.");
			}
		}

		private void brodcast(String data) {
			for (MServer ms : list) {
				ms.pw.println(data);
				ms.pw.flush();
			}
		} // brodcast end

	} // MServer end

} // class end
