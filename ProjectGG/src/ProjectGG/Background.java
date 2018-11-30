package ProjectGG;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Background extends JFrame {
   ImageIcon icPar3 , icFlag;

   public Background() {
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Par3 Hole");
      setBounds(150, 0, 1300, 865);
      icPar3 = new ImageIcon("src/images/Par3Hole.png");
      icFlag = new ImageIcon("src/images/TestFlag.png");

      JPanel background = new JPanel() {
         public void paintComponent(Graphics g) {
        	 super.paintComponent(g);
            g.drawImage(icPar3.getImage(), 0, 0, null);
            g.drawImage(icFlag.getImage(), 1000, 650, null);
            setOpaque(false);
         }
      };
      
      background.setLayout(null);
      add(background);
      setVisible(true);
   }

   public static void main(String[] args) {
      Background frame = new Background();
   }
}