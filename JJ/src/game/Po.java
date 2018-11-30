package game;

import javax.swing.JButton;

public class Po extends Thread{
	JButton jbtn;
	int a;
	
	Po(JButton jbtn, int a){
		this.jbtn = jbtn;
		this.a = a;
	}
	
	@Override
	public void run() {
		for (int j = 0; j <= 20; j++) {
			int px = jbtn.getX();
			int py = jbtn.getY();
			double c = -1 / 16 * (px * px - 3) + 5;
			jbtn.setLocation(px + a, py - (int) c);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		for (int j = 0; j <= 20; j++) {
			int px = jbtn.getX();
			int py = jbtn.getY();
			double c = 1 / 16 * (px * px + 3) - 5;
			jbtn.setLocation(px + a, py - (int) c);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}
