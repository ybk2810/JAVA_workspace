package day09;

import java.awt.Button;
import java.awt.Frame;

public class MyWin3 extends Frame {
	Button btn;
	
	MyWin3(){
		setTitle("AWT FRAME");
		setSize(800, 600);
		setLocation(400,300);
		
		// 멤버변수 초기화
		btn = new Button("날 클릭해봐!");
		
		// btn에 Action을 감지할 수 있는 Listener를 부착
		Handler h = new Handler();
		
		// addActionLintener(ActionListener l)
		// ActionListener 인터페이스를 구혀난 객체를 매개변수로 갖는 addActionLintener()
		btn.addActionListener(h);
		
		//버튼을 부착(Frame후손, Container 후손)
		add(btn);
		
		// event 처리 순서
		// 1. 이벤트 소스 결정
		// 2. 리스너 부착: 리스닝중 이벤트가 발생하면 자동으로 핸들러 호출
		// 3. 핸들러 구현
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWin3 mw = new MyWin3();
	}
}
