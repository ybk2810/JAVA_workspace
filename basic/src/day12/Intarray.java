package day12;

public class Intarray {
	Integer[] array;

	// getter, setter �߰�
	public Integer[] getArray() {
		return array;
	}

	public void setArray(Integer[] array) {
		this.array = array;
	}
	
	// print() ��� ��Ҹ� ���
	public void print() {
		for(Integer x: array) {
			System.out.println(x);
		}
	}
}
