package day07;

public class ������ũ extends Terran {

	������ũ() {
		lebel = 1;
		x = 0;
		y = 0;
		hp = 100;
		��Ÿ� = 3;
		���ݷ� = 10;
		�̵��ӵ� = 4;
		���ݼӵ� = 2;
	}

	������ũ(int lebel) {
		this();
		this.���ݷ� = ���ݷ� + lebel * 4;
		this.hp = hp + lebel * 5;
		this.�̵��ӵ� = �̵��ӵ� + lebel * 1;
		this.���ݼӵ� = ���ݼӵ� + lebel * 1;
	}

	void �����ϱ�(���� m) {
		System.out.println("------�����ϱ� �޼���:" + m);
		m.hp -= ���ݷ�;
		System.out.println("ŸŸ��Ÿ�y");
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

}
