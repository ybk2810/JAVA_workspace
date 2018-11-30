package day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hw0618No1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		Random rnd = new Random();

		while (list.size() != 200) {
			list.add(rnd.nextInt(100) + 1);
		}
		System.out.println("list: " + list);

		Scanner scan = new Scanner(System.in);
		System.out.print("number :");
		int number = scan.nextInt();
		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			Object obj2 = list.get(i);
			Integer s1 = (Integer) obj2;
			if (number == s1) {
				cnt++;
			}
		}
		System.out.println("같은숫자: " + cnt);
	}
}
