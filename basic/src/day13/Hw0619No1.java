package day13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hw0619No1 extends JFrame implements ActionListener {
	JButton[] numbers;
	JButton genNum;

	public Hw0619No1() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 300, 400, 200);
		setTitle("Lottery Macine");
		setLayout(null);

		numbers = new JButton[6];
		genNum = new JButton("!!START!!");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new JButton();
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
		new Hw0619No1();
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
		for (int i = 0; i < numbers.length; i++)
			numbers[i].setText(Integer.toString(nums[i]));
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