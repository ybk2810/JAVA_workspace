package day09;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin7 extends Frame {
	Button btnYes, btnNo;
	Label lb;
	MyWin7(){
		//배치관리자 x
		setLayout(null);
		
		//컴포넌트 초기화
		btnYes = new Button("YES");
		btnNo = new Button("NO");
		lb = new Label("비가오는 날에 파전을 먹어본적이 있다.");
		
		//컴포넌트의 킈와 위치를 지정
		btnYes.setBounds(100, 400, 100, 50);
		btnNo.setBounds(400, 400, 100, 50);
		lb.setBounds(50, 50, 250, 50);
		
		Handler3 h = new Handler3();
		btnYes.addActionListener(h);
		btnNo.addActionListener(h);
		
		//컴포넌트 부착
		add(btnYes);
		add(btnNo);
		add(lb);
		
		//Yes 누르면 파전좋아..
		//No 누르면 동동주가 좋아
		
		setBounds(100,100,800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWin7();
	}

}


class Handler3 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		System.out.println(cmd);
		if(cmd.equals("YES")) {
			System.out.println("파전좋아..");
		}else if(cmd.equalsIgnoreCase("NO")) {
			System.out.println("동동주가 좋아");
		}
	}
}