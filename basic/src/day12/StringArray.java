package day12;

public class StringArray {
	String[] array;

	// getter, setter �߰�
	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}
	
	// print() ��� ��Ҹ� ���
	public void print() {
		for(String x: array) {
			System.out.println(x);
		}
	}
	
}
