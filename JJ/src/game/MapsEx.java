 package game;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class MapsEx extends JFrame implements ActionListener {
 
    JButton jbtn1, jbtn2, jbtn3, jbtn4;
    JButton map, start;
    ImageIcon img1, img2, img3, img4, img5;
    ImageIcon btnimg1, btnimg2, btnimg3, btnimg4;
     
    MapsEx(){
     
        jbtn1 = new JButton("µ¿±¼");
        jbtn2 = new JButton("Åë³ª¹«");
        jbtn3 = new JButton("ÇÏ´Ã");
        jbtn4 = new JButton("°è°î");
         
        map = new JButton("");
        start = new JButton("START");
         
        img1 = new ImageIcon("src/MapImage/cave.gif");
        img2 = new ImageIcon("src/MapImage/log.gif");
        img3 = new ImageIcon("src/MapImage/sky.gif");
        img4 = new ImageIcon("src/MapImage/valley.gif");
        img5 = new ImageIcon("src/MapImage/map2.png");
     
        map.setBounds(80, 50, 1200, 450);
        jbtn1.setBounds(120, 550, 150, 150);
        jbtn2.setBounds(420, 550, 150, 150);                                                                                  
        jbtn3.setBounds(720, 550, 150, 150);
        jbtn4.setBounds(1020, 550, 150, 150);
        start.setBounds(620, 715, 150, 40);
     
        jbtn1.addActionListener(this);
        jbtn2.addActionListener(this);
        jbtn3.addActionListener(this);
        jbtn4.addActionListener(this);
        start.addActionListener(this);
        map.setIcon(img5);
         
        add(jbtn1);
        add(jbtn2);
        add(jbtn3);
        add(jbtn4);
        add(map);
        add(start);
     
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 50, 1400, 800);
       //setVisible(true);
     
     
    }
    public static void main(String[] args) {
        new MapsEx();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
 
        Object obj = e.getSource();
         
        if(obj == jbtn1) {
            map.setIcon(img1);
        }else if(obj == jbtn2) {
            map.setIcon(img2);
        }else if(obj == jbtn3) {
            map.setIcon(img3);
        }else if(obj == jbtn4) {
            map.setIcon(img4);
    }
         
    }
    }
 
