package day13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing extends JFrame implements ActionListener {
	Horse h1, h2, h3;
	JButton jbtn1, jbtn2, jbtn3, start;
	ImageIcon img1, img2;

	Racing(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		setLayout(null);

		img1 = new ImageIcon("src/images/horse.gif");
		img2 = new ImageIcon("src/images/horsestop.gif");
		jbtn1 = new JButton(img2);
		jbtn2 = new JButton(img2);
		jbtn3 = new JButton(img2);
		start = new JButton("START");

		// event
		start.addActionListener(this);

		jbtn1.setBounds(50, 50, 120, 60);
		jbtn2.setBounds(50, 200, 120, 60);
		jbtn3.setBounds(50, 350, 120, 60);
		start.setBounds(400, 450, 200, 100);

		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(start);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Racing("∞Ê∏∂¿Â");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(h1 == null) {
			jbtn1.setIcon(img1);
			jbtn2.setIcon(img1);
			jbtn3.setIcon(img1);
	
			h1 = new Horse(jbtn1, img2);
			h2 = new Horse(jbtn2, img2);
			h3 = new Horse(jbtn3, img2);
			
			h1.start();
			h2.start();
			h3.start();
		}
	}
}
