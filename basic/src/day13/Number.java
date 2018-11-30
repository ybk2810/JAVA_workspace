package day13;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Number extends Thread {
	ImageIcon[] img;
	JButton jb;
	Random r = new Random();

	public Number(ImageIcon[] img, JButton jb) {
		this.img = img;
		this.jb = jb;
	}

	public void run() {
		int ran;

		Thread th = Thread.currentThread();
		th.setPriority(MAX_PRIORITY);
		while (!th.isInterrupted()) {
			jb.setIcon(img[r.nextInt(45)]);
			try {
				Thread.sleep(35 + r.nextInt(40));
			} catch (InterruptedException e) {
				break;
			}
		}

		for (int i = 0; i < Integer.parseInt(jb.getActionCommand()) * 5; i++) {
			ran = r.nextInt(45);
			jb.setIcon(img[ran]);
			try {
				Thread.sleep(r.nextInt(300) + i * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Color c = new Color(0, 0, 0);
		jb.setBackground(c);
	}
}
