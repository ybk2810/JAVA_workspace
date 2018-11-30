package day17;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class WinEx6 extends JFrame{
	Image img;
	
	TCanvas can;
	
	Container panel;
	
	WinEx6(){
		Toolkit tool = Toolkit.getDefaultToolkit();
		img = tool.getImage("src/images/A.jpg");
		
		Dimension d = tool.getScreenSize();
		
		int w = (int)d.getWidth();
		int h = (int)d.getHeight();
		// 현재 프레임을 화면의 정중앙에 위치
		
		int x = w/2-800/2;
		int y = h/2-800/2;

		can = new TCanvas(img);
		
		panel = getContentPane();
		panel.add(can);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(x,y, 800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WinEx6();
	}
}
