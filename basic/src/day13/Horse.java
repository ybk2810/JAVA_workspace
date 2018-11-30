package day13;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Horse extends Thread{
	JButton jbtn;
	ImageIcon icon;
	
	Horse(JButton jbtn, ImageIcon icon){
		this.jbtn = jbtn;
		this.icon = icon;
	}
	
	@Override
	public void run() {
		Random rnd = new Random();
		for(int i = 0; i<200; i++) {
			try {
				Thread.sleep(rnd.nextInt(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jbtn.setLocation(jbtn.getX()+3,jbtn.getY());
		}
		jbtn.setIcon(icon);
	}
}
