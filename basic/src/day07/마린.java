package day07;

// ������ ����
// ��������
// ��������(�������)

public class ���� extends Terran implements Flyable {
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

	����(int ���ݷ�, int hp, int �̵��ӵ�, int ���ݼӵ�) {
		this();
		this.���ݷ� = ���ݷ�;
		this.hp = hp;
		this.�̵��ӵ� = �̵��ӵ�;
		this.���ݼӵ� = ���ݼӵ�;
	}

	����(int lebel) {
		this();
		this.���ݷ� = ���ݷ� + lebel * 4;
		this.hp = hp + lebel * 5;
		this.�̵��ӵ� = �̵��ӵ� + lebel * 1;
		this.���ݼӵ� = ���ݼӵ� + lebel * 1;
	}

	void �����ϱ�(Terran m) {
		System.out.println("�����ϱ� �޼���:" + m);
		m.hp -= ���ݷ�;
		System.out.println("�ٴٴٴٴٴ�");
	}
	// void �����ϱ�(���� m) {
	// System.out.println("�����ϱ� �޼���:"+m);
	// m.hp-=���ݷ�;
	// System.out.println("�ٴٴٴٴٴ�");
	// }
	//
	// void �����ϱ�(������ũ m) {
	// System.out.println("------�����ϱ� �޼���:"+m);
	// m.hp-=���ݷ�;
	// System.out.println("�ٴٴٴٴٴ�");
	// }
	//
	// void �����ϱ�(�޵� m2) {
	// System.out.println("------�����ϱ� �޼���:"+m2);
	// m2.hp-=���ݷ�;
	// System.out.println("�ٴٴٴٴٴ�");
	// }

	void ������() {
		if (hp > 5) {
			hp -= 5;
			���ݷ� += 3;
			���ݼӵ� += 2;
			�̵��ӵ� += 2;
			System.out.println("��~~~ ��~~~");
		}
	}

	@Override
	public void fly() {
		System.out.println("����");
		// TODO Auto-generated method stub
		
	}
	

}
