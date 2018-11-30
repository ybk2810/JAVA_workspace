package day12;

public class Intarray {
	Integer[] array;

	// getter, setter 추가
	public Integer[] getArray() {
		return array;
	}

	public void setArray(Integer[] array) {
		this.array = array;
	}
	
	// print() 모든 요소를 출력
	public void print() {
		for(Integer x: array) {
			System.out.println(x);
		}
	}
}
