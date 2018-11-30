package day16;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, WindowListener, Runnable, KeyListener {
	CardLayout cl;
	JPanel jp1, jp2, jpSouth;
	JLabel jIP, jPort;
	JTextField jtfIP, jtfPort, jtfData;
	JButton jbtnConn, jbtnExit, jbtnSend;
	JTextArea jta;
	JScrollPane jsp;
	String ip, port;

	Socket s;
	BufferedReader br;
	PrintWriter pw;

	ChatClient() {
		cl = new CardLayout();
		setLayout(cl);

		jp1 = new JPanel();
		jp2 = new JPanel();
		jpSouth = new JPanel();
		jIP = new JLabel("IP");
		jPort = new JLabel("PORT");
		jtfIP = new JTextField("192.168.0.206");
		jtfPort = new JTextField("5000");
		jbtnConn = new JButton("CONNECT");
		jbtnExit = new JButton("EXIT");

		jtfData = new JTextField(20);
		jbtnSend = new JButton("SEND");
		jta = new JTextArea();
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jbtnConn.addActionListener(this);
		jbtnExit.addActionListener(this);
		jbtnSend.addActionListener(this);
		addWindowListener(this);// �̺�Ʈó��

		// JFrame: BorderLayout
		jp1.setLayout(null);// ��ġ������ x

		// ��� ������Ʈ�� ������� ��ġ ����
		jIP.setBounds(70, 50, 60, 50);
		jPort.setBounds(70, 150, 60, 50);
		jtfIP.setBounds(200, 50, 160, 50);
		jtfPort.setBounds(200, 150, 160, 50);
		jbtnConn.setBounds(50, 450, 100, 50);
		jbtnExit.setBounds(250, 450, 100, 50);

		// �߰�
		jp1.add(jIP);
		jp1.add(jPort);
		jp1.add(jtfIP);
		jp1.add(jtfPort);
		jp1.add(jbtnConn);
		jp1.add(jbtnExit);
		add(jp1, "login");

		jp2.setLayout(new BorderLayout());
		jp2.add(jsp, "Center");
		jpSouth.add(jtfData);
		jpSouth.add(jbtnSend);

		jtfData.addKeyListener(this);

		jp2.add(jpSouth, "South");
		add(jp2, "chat");

		cl.show(getContentPane(), "login");

		setTitle("");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ChatClient();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == jbtnConn) {
			cl.show(getContentPane(), "chat");
			ip = jtfIP.getText();
			port = jtfPort.getText();
			// ä�� ����
			vchat();
		} else if (obj == jbtnExit) {
			System.exit(0);
		} else if (obj == jbtnSend) {
			send();
		}
	}// actionPerformed() end

	private void send() {
		String data = jtfData.getText();
		pw.println(data);
		pw.flush();

		jtfData.setText("");// ����ģ �� �����
		jtfData.requestFocus();// ��Ŀ���� ������
	}

	private void vchat() {
		// ��Ƽ������
		// JFrame������ thread�� extents���ϱ� ������ Runnable���
		// 1.���-> Runnable �������̽� ����
		// 2.run() override
		// 3. new Thread(������ü)
		// 4. start()

		Thread th = new Thread(this);
		th.start();

	}// vchat end

	@Override
	public void run() {
		// ��Ĺ ����
		try {
			s = new Socket(ip, Integer.parseInt(port));
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())));
			System.out.println(br);
			System.out.println(pw);

			String data = null;
			while (true) {
				data = br.readLine();
				jta.append(data + "\n");

				// ���� ��ũ�� ���� �Ʒ��� �̵�
				JScrollBar jsb = jsp.getVerticalScrollBar();

				int v = jsb.getMaximum();
				jsb.setValue(v);

			}
		} catch (NumberFormatException e) {
			System.out.println("��Ʈ��ȣ�� �߸��Ǿ����ϴ�.");

		} catch (UnknownHostException e) {
			System.out.println("ip�� �̻��ؿ�");

		} catch (IOException e) {

		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		System.out.println(key);
		if (key == 10) {
			send();

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
