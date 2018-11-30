package day12;

public class Floatarray {
	Float[] array;

	// getter, setter 추가
	public Float[] getArray() {
		return array;
	}

	public void setArray(Float[] array) {
		this.array = array;
	}
	
	// print() 모든 요소를 출력
	public void print() {
		for(Float x: array) {
			System.out.println(x);
		}
	}
	
}
