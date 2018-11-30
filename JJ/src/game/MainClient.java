package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainClient {
	static Mo m;
	static Jo j;
	static Kang k ;
	static Hong h;
	static Tank t1 ;
	static Tank t2 ;
	static TestMap tm ;
	
	
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		mf.setVisible(true);
		Choice c = new Choice();
		Choice2 c1 = new Choice2();	
		MapsEx map = new MapsEx();
		
		
		mf.start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mf.setVisible(false);
				c.setVisible(true);
			}
		});
		
		c.jbtnS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c.jbtnL.getIcon() == c.imgL1) {
					k = new Kang();
					t1 =new Tank(k);
				}else if(c.jbtnL.getIcon() ==c.imgL2) {
					j = new Jo();
					t1 = new Tank(j);
				}else if(c.jbtnL.getIcon() ==c.imgL3) {
					h = new Hong();
					t1 = new Tank(h);
				}else if(c.jbtnL.getIcon() ==c.imgL4) {
					m = new Mo();
					t1 = new Tank(m);
				}
				c.setVisible(false);
				c1.setVisible(true);
			}
		});
		c1.jbtnS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c1.jbtnL.getIcon() == c1.imgL1) {
					k = new Kang(); 
					t2 =new Tank(k);
					tm = new TestMap(t1,t2);
						
				}else if(c1.jbtnL.getIcon() == c1.imgL2) {
					j = new Jo();
					t2 =new Tank(j);
					tm = new TestMap(t1,t2);
						
				}else if(c1.jbtnL.getIcon() == c1.imgL3) {
					h = new Hong();
					t2 =new Tank(h);
					tm = new TestMap(t1,t2);
					
				}else if(c1.jbtnL.getIcon() == c1.imgL4) {
					m = new Mo();
					t2 =new Tank(m);
					tm = new TestMap(t1,t2);
				}
				c1.setVisible(false);
				//tm.setVisible(true);	
				map.setVisible(true);
			}
		});
		
		map.start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				map.setVisible(false);
				tm.setVisible(true);
			}
		});
	}
	
}
