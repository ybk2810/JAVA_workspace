package day06;

public class Monkey {
	int eye;
	int nose;
	int mouse;
	int tail;

	Monkey() {
		eye = 2;
		nose = 1;
		mouse = 1;
		tail = 1;
		System.out.println("기본생성자");
	}

	void eating(String food) {
		System.out.println(food + "eating");
	}

	void grimpetree() {
		System.out.println("grimpetree");
	}

	void sleeping() {
		System.out.println("sleeping");
	}
}
