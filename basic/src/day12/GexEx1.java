package day12;
// �ڷ����� �����Ͻÿ� �����ϴ� ���� �ƴ϶� runtime �ÿ� �����ϵ���
// ���ʸ�
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
