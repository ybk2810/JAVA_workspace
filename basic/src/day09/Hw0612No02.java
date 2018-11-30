package day09;
//HwWin1 에서 종료버튼을 추가하고 누를때 "종료합니다~~~ " 출력 후 
//프로그램이 종료할수 있도록 코드를 작성!
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hw0612No02 extends Frame implements ActionListener {
	Button btnExit;
	
	Hw0612No02(){
		setLayout(null);
		btnExit = new Button("종료");
		
		btnExit.setBounds(200, 400, 100, 50);
		
		btnExit.addActionListener(this);
		
		add(btnExit);
		
		setTitle("배치관리자테스트");
		setBounds(100,100,800,600);
		
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		
		Button[] btn = new Button[50];
		for(int i = 0; i<btn.length; i++) {
			btn[i] = new Button((i+1)+"button");
			add(btn[i]);
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Hw0612No02 mw = new Hw0612No02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		System.out.println(obj);
		if(obj == btnExit) {
			System.out.println("종료합니다~~~");
		}
		System.exit(0);
	}
}
