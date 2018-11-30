package day09;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWin9 extends Frame implements WindowListener {
	//이벤트 소스: 현재 창
	MyWin9(){
		//addXXXXListener()
		//XXXXListener 인터페이스명
		addWindowListener(this);
		
		setTitle("창닫기");
		setBounds(100,100,800,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyWin9();
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 열릴 때");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 닫히는 중일 때");
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 닫힌 후에");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("아이콘화 되었을대 호출");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("아이콘에서 현재창모양으로 변할 때 호출");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("활성화 되었을 때 호출");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("비활성화 되었을 때 호출");
	}
}
