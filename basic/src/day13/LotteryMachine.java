package day13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LotteryMachine extends JFrame implements ActionListener {
	JButton[] numbers = new JButton[6];
	JButton genNum;
	ImageIcon[] img = new ImageIcon[45];
	Number[] num = new Number[6];
	boolean startFlag = false;
	ImageIcon ball = new ImageIcon("src/image/ball46.png");

	public LotteryMachine() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 300, 400, 200);
		setTitle("Lottery Macine");
		setLayout(null);

		for (int i = 0; i < img.length; i++) {
			img[i] = new ImageIcon("src/image/ball" + (i + 1) + ".png");
			img[i].setDescription("" + i);
		}

		genNum = new JButton("!!START!!");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new JButton(ball);
			numbers[i].setBounds(15 + 60 * i, 35, 55, 50);
			numbers[i].setFocusable(false);
			numbers[i].setActionCommand("" + i);
			add(numbers[i]);
		}

		genNum.setBounds(150, 115, 100, 40);
		genNum.addActionListener(this);
		add(genNum);

		setVisible(true);
	}

	public static void main(String[] args) {
		new LotteryMachine();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!startFlag) {
			startFlag = true;
			genNum.setText("!! Stop !!");
			for (int i = 0; i < num.length; i++) {
				num[i] = new Number(img, numbers[i]);
				num[i].start();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		} else {
			for (int i = 0; i < num.length; i++)
				num[i].interrupt();
			genNum.setText("!!!TADA!!!");
		}
	}

	public static void bubbleSort(int[] num) {
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++)
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
		}
	}
}
