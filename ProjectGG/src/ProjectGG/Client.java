package ProjectGG;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client extends JFrame implements WindowListener {
	String ip;
	ImageIcon icPar3, icFlag;
	Socket socket;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	boolean loop = true; // 클라이언트 측의 게임루프 실행/종료 결정

	// GameBackground gbg;
	GamePanel gp;
	GameData gd; // 서버와 게임 데이터를 주고 받을 때 사용할 데이터 포맷
	ImageIcon icon;
	

	public Client() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		setTitle("Golf Game Par3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 0, 1300, 865);
		// getContentPane().setLayout(null);// error

//		gp = new GamePanel(this);
//		gp.setLayout(null);
//		getContentPane().add(gp);
		
		Par3Game t = new Par3Game();
		t.requestFocus();
		t.setLayout(null);
		getContentPane().add(t);
		
//		connect();// 서버에 접속한다

		setVisible(true);
	}

	/** 서버연결에 성공하면 입출력 스림을 생성하고 입력 쓰레드를 실행한다 */
	private void connect() {
		try {
			ip = "192.168.0.11";
			socket = new Socket(ip, 1234);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());

			// 서버로부터 게임 데이터를 수신하는 쓰레드
			new Thread() {
				@Override
				public void run() {
					System.out.println("접속성공");
					Point2D ballPos = null;

					while (loop) {
						// 서버측에서 전송된 게임 데이터를 수신함
						// gd = (GameData) ois.readObject();

						// 화면을 그린다
						// gp.repaint();

					}
				}
			}.start();
		} catch (UnknownHostException e) {
			System.out.println("ip ERROR");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input & Output Exception");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Client();
				new Par3Game();
			}
		});
	}

	@Override
	public void windowClosing(WindowEvent e) {
		try {
			if (ois != null)
				ois.close();
			if (oos != null)
				oos.close();
			if (socket != null)
				socket.close();
		} catch (IOException e1) {
			System.out.println("CLIENT_WINDOWCLOSING_IOEXCEPTION");
			e1.printStackTrace();
		}
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
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
}