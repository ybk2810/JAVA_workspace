package day05;
//Hw0605No6
public class FormatData {
	int f;
	int []b;
//	float f;
	
	FormatData(){
		System.out.println("기본 생성자");
	}
	
	void print(int a) {
		System.out.println(a);
	}
	void print(int []b) {
		System.out.print("["+"\t");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.print("]");
		System.out.println();
	}
	void print(float f) {
		System.out.println(f);
	}
}
