package day06;

// ������ ����
// ��������
// ��������(�������)

public class ���� {
	int lebel, x, y, hp, ��Ÿ�, ���ݷ�, ����, ���ݼӵ�, �̵��ӵ�;

	����() {
		lebel = 1;
		x = 0;
		y = 0;
		hp = 100;
		��Ÿ� = 5;
		���ݷ� = 4;
		�̵��ӵ� = 3;
		���ݼӵ� = 2;
	}
	
	����(int ���ݷ�,int hp) {
		this();
		this.���ݷ� = ���ݷ�;
		this.hp = hp;
		this.�̵��ӵ� = �̵��ӵ�;
		this.���ݼӵ� = ���ݼӵ�;
	}

	����(int lebel) {
		this();
		this.���ݷ� = ���ݷ�+lebel*4;
		this.hp = hp+lebel*5;
		this.�̵��ӵ� = �̵��ӵ�+lebel*1;
		this.���ݼӵ� = ���ݼӵ�+lebel*1;
	}

	void �����ϱ�() {
		System.out.println("�εεεε�");
	}
	
	void �����ϱ�(���� m) {
		System.out.println("�����ϱ� �޼���:"+m);
		m.hp-=���ݷ�;
		System.out.println("�ٴٴٴٴٴ�");
	}
	
	void �����ϱ�(������ũ m) {
		System.out.println("------�����ϱ� �޼���:"+m);
		m.hp-=���ݷ�;
		System.out.println("�ٴٴٴٴٴ�");
	}
	
	void �̵��ϱ�() {
		System.out.println("��!! ���..");
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
