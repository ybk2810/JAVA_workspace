package day13;

// Thread : ���μ��������� ���صǴ� �帧�� ����

// ��Ƽ ������ ȯ��
// 1.Thread Ŭ������ ���
//	1-1. Thread Ŭ������ ���
//	1-2. ���ÿ� ó���ϰ��� �ϴ� �ڵ带 run() override �ؼ� ����
//	1-3. start() method ȣ��
// 2.Runnable interface�� ����

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		String name = th.getName();
		System.out.println("���� ������ ��: " + name);
	}
}
