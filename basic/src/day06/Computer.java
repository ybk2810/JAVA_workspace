package day06;

//Hw0607No7
public class Computer {
	int specifications;
	String name;
	String version;
	
	Computer(){
		specifications = 0;
		name = "samsung";
		version = "a123456789";
	}
	
	void run() {
		System.out.println("start");
	}
	void stop() {
		System.out.println("stop");
	}
}
