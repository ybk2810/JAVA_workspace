package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Choice extends JFrame implements ActionListener{
	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	JButton jbtnL, jbtnR, jbtnS;
	ImageIcon imgL1, imgL2, imgL3, imgL4;
	ImageIcon imgR1, imgR2, imgR3, imgR4, imgS;
	ImageIcon btnimg1, btnimg2, btnimg3, btnimg4;
	int sum =0;
	Mo m;
	Jo j;
	Kang k;
	Hong h;
	
	
	Choice(){
		jbtn1 = new JButton("°­µ¿³×¸ð");
		jbtn2 = new JButton("Á¶¼¼ÈÞ");
		jbtn3 = new JButton("È«Àè¸Ç");
		jbtn4 = new JButton("¸ð³ª¹Ì");
		jbtnL = new JButton("");
		jbtnR = new JButton("");	
		jbtnS = new JButton("SELECT");
		
		imgL1 = new ImageIcon("src/gameImg/img1.jpg");
		imgL2 = new ImageIcon("src/gameImg/img2.jpg");
		imgL3 = new ImageIcon("src/gameImg/img3.png");
		imgL4 = new ImageIcon("src/gameImg/img4.jpg");
		
		imgR1 = new ImageIcon("src/gameImg/imgR1.jpg"); 
		imgR2 = new ImageIcon("src/gameImg/imgR2.jpg");
		imgR3 = new ImageIcon("src/gameImg/imgR3.jpg");
		imgR4 = new ImageIcon("src/gameImg/imgR4.jpg");
		imgS = new ImageIcon("src/gameImg/imgs.jpg");
		
		btnimg1 = new ImageIcon("src/gameImg/btnimg1.jpg");
		btnimg2 = new ImageIcon("src/gameImg/btnimg2.jpg");
		btnimg3 = new ImageIcon("src/gameImg/btnimg3.jpg");
		btnimg4 = new ImageIcon("src/gameImg/btnimg4.jpg");
		
		
		jbtnL.setBounds(30, 50, 350, 450);
		jbtnR.setBounds(400, 50, 350, 450);
		jbtn1.setBounds(20, 550, 150, 150);
		jbtn2.setBounds(220, 550, 150, 150);                                                                                  
		jbtn3.setBounds(420, 550, 150, 150);
		jbtn4.setBounds(620, 550, 150, 150);
		jbtnS.setBounds(620, 715, 150, 40);
		
		jbtnS.setIcon(imgS);

		jbtnL.setBackground(Color.white);
		jbtnR.setBackground(Color.white);
		
		jbtn1.setIcon(btnimg1);
		jbtn2.setIcon(btnimg2);
		jbtn3.setIcon(btnimg3);
		jbtn4.setIcon(btnimg4);
		
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		jbtn3.addActionListener(this);
		jbtn4.addActionListener(this);
		jbtnS.addActionListener(this);
		
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);
		add(jbtnL);
		add(jbtnR);
		add(jbtnS);
		
		setTitle("1P °í¸£±â");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 50, 800, 800);
		//setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Choice();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == jbtn1) {
			jbtnL.setIcon(imgL1);
			jbtnR.setIcon(imgR1);
		}else if(obj == jbtn2) {
			jbtnL.setIcon(imgL2);
			jbtnR.setIcon(imgR2);
		}else if(obj == jbtn3) {
			jbtnL.setIcon(imgL3);
			jbtnR.setIcon(imgR3);
		}else if(obj == jbtn4) {
			jbtnL.setIcon(imgL4);
			jbtnR.setIcon(imgR4);
		}
		/*
		else if(obj == jbtnS) {
			if(jbtnL.getIcon() == imgL1) {
				k= new Kang();
				return ;
			}
			setVisible(false);
			Choice2 ch = new Choice2();
			ch.setVisible(true);
		}*/
	}
}
