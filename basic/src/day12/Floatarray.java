package day12;

public class Floatarray {
	Float[] array;

	// getter, setter �߰�
	public Float[] getArray() {
		return array;
	}

	public void setArray(Float[] array) {
		this.array = array;
	}
	
	// print() ��� ��Ҹ� ���
	public void print() {
		for(Float x: array) {
			System.out.println(x);
		}
	}
	
}
