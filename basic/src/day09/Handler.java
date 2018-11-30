package day09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// interface는 추상메서드와 상수
// 3. 핸들러 클래스 구현
public class Handler implements ActionListener {
	// event가 발생할 때 자동으로 호출
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("누르지마...");
//		System.exit(0);// 정상종료
		MyWin3 mw = new MyWin3();
	}

}
