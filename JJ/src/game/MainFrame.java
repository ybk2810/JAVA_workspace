package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame implements ActionListener {

   JScrollPane scrollPane;
   JButton start, explanation;
   Image bg;
   ImageIcon gamestart, stt; 
   DrawPanel draw;

   MainFrame(){
      
      
      
      Toolkit tool = Toolkit.getDefaultToolkit();
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      gamestart = new ImageIcon("src/gameImg/as1.png");
      
      explanation = new JButton("조작방법");
      start = new JButton("");

      start.setBorderPainted(false);
      explanation.setBorderPainted(false);
      explanation.setBackground(Color.WHITE);
      //start.setOpaque(false);
      draw = new DrawPanel();
      
      
      draw.setLayout(null);
      Dimension d = tool.getScreenSize();   //폭과 높이를 캡슐화해주는 클래스.
      int w = (int)d.getWidth();
      int h = (int)d.getHeight();
      
   
      int x = w/2-800/2;
      int y = h/2-800/2;
      
      setBounds(x, y, 800, 800);
      
      
      start.addActionListener(this);
      explanation.addActionListener(this);
      
      start.setBounds(300, 670, 150, 50);
      explanation.setBounds(650, 700, 100, 25);
      start.setIcon(gamestart);
   
      draw.add(start);
      draw.add(explanation);
      
      getContentPane().add(draw);
   
   
      
      
   }
   
   
   @Override
   public void actionPerformed(ActionEvent e) {
         
      Object obj = e.getSource();
      if(obj == start) {
         
      }else if(obj == explanation) {
         setVisible(false);
         Explanation x = new Explanation();
         x.setVisible(true);
      }
   }
}



class DrawPanel extends JPanel{
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Image img = Toolkit.getDefaultToolkit().getImage("src/gameImg/ba.jpg");
      g.drawImage(img, 0, 0,getWidth(),getHeight(), this);
   }
}

