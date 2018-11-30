package day12;

public class StringArray {
	String[] array;

	// getter, setter 추가
	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}
	
	// print() 모든 요소를 출력
	public void print() {
		for(String x: array) {
			System.out.println(x);
		}
	}
	
}
