package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Explanation extends JFrame implements ActionListener{
	
	JButton back;
	Image image;
	DrawsPanel draws;
	
	
	Explanation(){
		
		back = new JButton("뒤로가기");		
		draws = new DrawsPanel();
		Toolkit tool = Toolkit.getDefaultToolkit();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    draws.setLayout(null);
		Dimension d = tool.getScreenSize();	//폭과 높이를 캡슐화해주는 클래스.
		int w = (int)d.getWidth();
		int h = (int)d.getHeight();
		
		int x = w/2-800/2;
		int y = h/2-800/2;
		setBounds(x, y, 800, 800);
		
		back.addActionListener(this);		
		back.setBounds(630, 60, 100, 50);
		
		draws.add(back);
		
		add(draws);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == back) {	
			setVisible(false);
			MainClient a = new MainClient();
			a.main(null);
			
		}
		
	}
}

class DrawsPanel extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = Toolkit.getDefaultToolkit().getImage("src/gameImg/setting.jpg");
		g.drawImage(img, 0, 0,getWidth(),getHeight(), this);
	}
}

