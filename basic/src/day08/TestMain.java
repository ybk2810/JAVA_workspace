package day08;

//Phone, SmartPhone
public class TestMain {
	
	//public: ��𿡼��� ���ٰ�����
	//static: instance �������� ���ٰ�����
	//void: return ���� ����
	//main: main�̶�� �̸��� method
	//�Ű�����(String[] args) ���� �޼���
	public static void main(String[] args) {
		
		SmartPhone.manufacturer = "�ﾫ";
		// static �ǹ�
		// �ν��Ͻ�ȭ �ϱ������� ��밡���� ����
		// �ش� Ŭ������ ���뺯��
		SmartPhone.call("119");
		
//		SmartPhone sp1 = new SmartPhone("ȭ����", "�ȵ���̵�", "���", "010-1234-5678");
//		SmartPhone sp2 = new SmartPhone("ȭ����", "�ȵ���̵�", "�Ƴ�7x", "010-3333-4444");
//		sp1.call("010-1111-2222");
//		sp1.receive();
//		
//		sp1.manufacturer = "������";
////		sp2.manufacturer = "������";
//		//static ������ ��� ����� 
//		
//		System.out.println(sp1.manufacturer);
//		System.out.println(sp2.manufacturer);
//		
//		
//		
//		
		
	}
}
