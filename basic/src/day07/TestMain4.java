package day07;

public class TestMain4 {
	public static void main(String[] args) {
		���� m1 = new ����();
		���� m2 = new ����();
		// ���� m3 = new ����();
		�޵� me = new �޵�();
		������ũ st = new ������ũ();

		m2.status();
		m1.�����ϱ�(m2);
		m2.status();
		System.out.println("---------------------");

		// ������ũ���� ���� ����?
		st.�����ϱ�(m2);
		m2.status();
		System.out.println("---------------------");

		m2.�����ϱ�(st);
		st.status();
		System.out.println("---------------------");

		m2.�����ϱ�(me);
		me.status();
		System.out.println("---------------------");

	}
}
