package day12;
// 자료형을 컴파일시에 결정하는 것이 아니라 runtime 시에 결정하도록
// 제너릭
public class GexEx1<T> {
	T[] array;

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	
	public void print() {
		for(T x: array) {
			System.out.println(x);
		}
	}
	
	
	
}
