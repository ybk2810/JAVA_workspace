package day05;

// TestMain4
public class ���� {
	int x, y, hp, ���ݷ�, ����, ��Ÿ�;
	int �̵��ӵ�, ���ݼӵ�;

	public ����() {
		x = 0;
		y = 0;
		hp = 100;
		���ݷ� = 4;
		���� = 3;
		��Ÿ� = 3;
		�̵��ӵ� = 4;
		���ݼӵ� = 3;
		System.out.println("�⺻ ������");
	}

	void �����ϱ�() {
		System.out.println("�ѶѶѶ�~~~");
	}

	void �̵��ϱ�() {
		System.out.println("��!! ���..");
	}

	void ����ϱ�() {
		System.out.println("����~~~~");
	}

	void ��Ʈ��() {
		System.out.println("�ٹ��� �̻�~~~");
	}

	void ������() {
		if (hp > 5) {
			hp -= 5;
			���ݷ� += 3;
			���ݼӵ� += 2;
			�̵��ӵ� += 2;
			System.out.println("��~~~ ��~~~");
		}
	}

	void status() {
		System.out.println("---------------");
		System.out.println("ü��: " + hp);
		System.out.println("��Ÿ�: " + ��Ÿ�);
		System.out.println("���ݷ�: " + ���ݷ�);
		System.out.println("����: " + ����);
	}
}
