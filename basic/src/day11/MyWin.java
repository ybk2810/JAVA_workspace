package day11;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWin extends Frame{

	MyWin() {
		
//		WindowAdapter wa = new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		};
				
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setBounds(100, 100, 800, 600);
		setVisible(true);
	}

	public static void main(String[] srgs) {
		new MyWin();
	}

} // MyWin class end

//class Test extends WindowAdapter{
//	@Override
//	public void windowClosing(WindowEvent e) {
//		// TODO Auto-generated method stub
//		super.windowClosing(e);
//	}
//}