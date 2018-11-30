package day08;

//Ctrl+Shift+o
import java.awt.Color;
import java.awt.Frame;

// 내 클래스를 윈도우창이 되도록
public class MyWin2 extends Frame {
	
	MyWin2(){
//		super();//부모생성자; frame()
		super("비가오는 월요일");//부모생성자; frame()
		setTitle("나의 윈도우");
		setSize(300, 500);
		this.setLocation(300, 300);
		this.setBackground(Color.PINK);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWin2 mw = new MyWin2();
		
	}
}
