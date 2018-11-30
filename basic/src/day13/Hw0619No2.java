package day13;

//��ȣ�� ��ư ��� �������� 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Hw0619No2 extends JFrame implements ActionListener {
	JButton[] numbers;
	JButton genNum;
	ImageIcon[] icon;

	public Hw0619No2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 300, 400, 200);
		setTitle("Lottery Macine");
		setLayout(null);

		icon = new ImageIcon[46];
		numbers = new JButton[6];
		genNum = new JButton("!!START!!");
		
		for (int i = 0; i < icon.length; i++) {
			icon[i] = new ImageIcon("src/images/Lotto/ball"+(i+1)+".png");
		}
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new JButton(icon[45]);
			numbers[i].setBounds(15 + 60 * i, 35, 55, 50);
			numbers[i].setFocusable(false);
			add(numbers[i]);
		}

		genNum.setBounds(150, 115, 100, 40);
		genNum.addActionListener(this);
		add(genNum);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Hw0619No2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random r = new Random();
		int[] nums = new int[6];
		boolean check = false;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(45) + 1;
			for (int j = 0; j < nums.length; j++)
				if (nums[j] == nums[i] && i != j)
					check = true;
			if (check) {
				check = false;
				i--;
			}
		}
		bubbleSort(nums);
		for (int i = 0; i < numbers.length; i++) {
//			numbers[i].setText(Integer.toString(nums[i]));
			numbers[i].setIcon(icon[(nums[i]-1)]);
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