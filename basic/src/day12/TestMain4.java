package day12;

public class TestMain4 {
	public static void main(String[] args) {
		String[] str = {"´ëÇÑ¹Î±¹","¿ùµåÄÅ","¿ì½Â"};
		Float[] data = {183.0f,187.0f,300.0f,240.0f};
		Integer[] data2 = {300,200,100,400,500,300,400};
		
		StringArray sa = new StringArray();
		sa.setArray(str);
		sa.print();
		
		Floatarray fa = new Floatarray();
		fa.setArray(data);
		fa.print();
		
		Intarray ia = new Intarray();
		fa.setArray(data);
		fa.print();
	}
}
