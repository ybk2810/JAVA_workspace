package day05;

public class TestMain5 {
	public static void main(String[] args) {
		Human H = new Human();

		System.out.println("name:" + H.name);
		System.out.println("eye:" + H.eye);
		System.out.println("gender:" + H.gender);
		System.out.println("arm:" + H.arm);
		System.out.println("age:" + H.age);
		System.out.println("job:" + H.job);
		System.out.println("종특:" + H.종특);

		H.스틸();
		H.빠르게달리기();
		H.축지법();
	}
}
