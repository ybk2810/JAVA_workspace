package day12;

public class TestMain5 {
	public static void main(String[] args) {
		String[] str = {"´ëÇÑ¹Î±¹","¿ùµåÄÅ","¿ì½Â"};
		Float[] data = {183.0f,187.0f,300.0f,240.0f};
		Integer[] data2 = {300,200,100,400,500,300,400};
		
		GexEx1<String> ge1 = new GexEx1<String>();
		ge1.setArray(str);
		ge1.print();
		
		GexEx1<Float> ge2 = new GexEx1<Float>();
		ge2.setArray(data);
		ge2.print();
		
		GexEx1<Integer> ge3 = new GexEx1<Integer>();
		ge3.setArray(data2);
		ge3.print();
		
//		
//		GexEx1<Double> ge3 = new GexEx1<Double>();
//		
//		ArrayList<String> list = new ArrayList<String>();
	}
}
