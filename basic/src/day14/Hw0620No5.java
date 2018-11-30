package day14;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Hw0620No5 extends JFrame implements ActionListener{
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JButton btnSource = new JButton("source");
	JButton btnDest = new JButton("dest");
	JButton btnCopy = new JButton("copy");
	
	File f ;
	File f2 ;
	Hw0620No5(){
		setLayout(null);
		setSize(500,350);
		setLocation(100,100);
		setTitle("복사기");
		
		tf1.setSize(250,25);
		tf1.setLocation(50, 50);
		
		tf2.setSize(250,25);
		tf2.setLocation(50, 100);
		
		btnSource.setSize(80,25);
		btnSource.setLocation(350, 50);
		
		btnDest.setSize(80,25);
		btnDest.setLocation(350, 100);
		
		btnCopy.setSize(300,100);
		btnCopy.setLocation(80, 200);
		
		btnSource.addActionListener(this);
		btnDest.addActionListener(this);
		btnCopy.addActionListener(this);
		
		add(btnCopy);
		add(btnDest);
		add(btnSource);
		add(tf1);
		add(tf2);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btnSource) {
			JFileChooser jfc = new JFileChooser("c:\\");
			int result = jfc.showOpenDialog(this); // 파일 불러오기 전에 선택할수있게끔
			if(result == JFileChooser.APPROVE_OPTION){     // 파일 츄저를 선택한 결과가 승인된 것이면!
				 f = jfc.getSelectedFile();
				tf1.setText(f.getAbsolutePath());   
	}
		}else if(obj ==btnDest ) {
			JFileChooser jfc = new JFileChooser("c:\\");
			int result = jfc.showSaveDialog(this); // 파일 불러오기 전에 선택할수있게끔
			if(result == JFileChooser.APPROVE_OPTION){     // 파일 츄저를 선택한 결과가 승인된 것이면!
				f2 = jfc.getSelectedFile();
				tf2.setText(f2.getAbsolutePath());   
	}
		
	}else if (obj == btnCopy) {
		

		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(f));
		BufferedWriter bw = null;
	
			bw = new BufferedWriter(new FileWriter(f2));
		
		
		PrintWriter pw = new PrintWriter(bw);
		String line = null;
		br.readLine();
		while((line = br.readLine())!=null) {
			System.out.println(line);
			pw.println(line);
		}pw.flush();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	}
	public static void main(String[] args) {
		Hw0620No5 hw = new Hw0620No5();
	}

}
