package ProjectGG;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	Image icPar3, icFlag;
	Client f;
	BufferedImage ball1, ball2, ball3, ball4;
	int x, y; // 티샷위치

	GamePanel(Client f) {
		this.f = f;
		// 게임에 사용될 몇가지 도형을 BufferedImage에 그린다
		icPar3 = Toolkit.getDefaultToolkit().getImage("src/images/Par3Hole.png");
		icFlag = Toolkit.getDefaultToolkit().getImage("src/images/TestFlag.png");
		
		ball1 = new BufferedImage(30, 30, BufferedImage.TYPE_INT_ARGB);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(icPar3, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(icFlag, 1000, 650, 70, 100, this);
		setOpaque(false);
	}


//	long prevTime, currTime;
//
//	public void sendGameData() {
//		try {
//			while (true) {
//				try {
//					f.oos.reset(); // 직렬화 도중에 호출되면 오류발생
//					break;
//				} catch (Exception ex) {
//					ex.printStackTrace();
//				}
//			}
//			synchronized (this) {
//				f.oos.writeObject(f.gd);
//			}
//			f.oos.flush();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//	}
}
