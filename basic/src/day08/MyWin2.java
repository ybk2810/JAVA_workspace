package day08;

//Ctrl+Shift+o
import java.awt.Color;
import java.awt.Frame;

// �� Ŭ������ ������â�� �ǵ���
public class MyWin2 extends Frame {
	
	MyWin2(){
//		super();//�θ������; frame()
		super("�񰡿��� ������");//�θ������; frame()
		setTitle("���� ������");
		setSize(300, 500);
		this.setLocation(300, 300);
		this.setBackground(Color.PINK);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWin2 mw = new MyWin2();
		
	}
}
