package day17;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class TCanvas extends JPanel{
	Image img;
	
	public TCanvas(Image img) {
		super();
		this.img = img;
	}
	// AWT ==> paint(g)
	// SWING ==> paintComponent(g)
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0,0,this);
	}
}
