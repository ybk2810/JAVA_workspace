package day05;

//TestMain6
public class GuGuDan {
	int dan;

	GuGuDan() {
		System.out.println("�⺻ ������");
	}

	void print() {
		for (int i = 1; i <= 9; i++) {
			System.out.print(dan + " * " + i + " = " + (dan * i));
		}
	}
}
