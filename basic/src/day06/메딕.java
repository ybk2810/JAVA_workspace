package day06;

public class �޵� {
	int hp, mp, ġ���, ����, x, y, �̵��ӵ�, �����Ÿ�;

	�޵�() {
		System.out.println("�⺻ ������");
		hp = 100;
		mp = 100;
		ġ��� = 3;
		���� = 5;
		x = 0;
		y = 0;
		�̵��ӵ� = 5;
		�����Ÿ� = 3;
	}

	void ġ��() {
		System.out.println("������");
	}
	void ġ��(���� m) {
		System.out.println("������++");
		m.hp+=ġ���;
	}

	void �̵�() {
		System.out.println("����");
	}

	void Ȧ��() {
		System.out.println("�ű⼭");
	}
	void ��Ʈ��() {
		System.out.println("�ٹ��� �̻�~~~");
	}

	void status() {
		System.out.println("---------------");
		System.out.println("ü��: " + hp);
		System.out.println("�����Ÿ�: " + �����Ÿ�);
		System.out.println("ġ���: " + ġ���);
		System.out.println("����: " + ����);
	}
	
	void ���() {
		System.out.println("���~~~");
	}
}
	
	