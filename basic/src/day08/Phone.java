package day08;
// Phone Ŭ������ ��ӹ޴� SmartPhone Ŭ���� �ۼ�

//��Ż�, os�� 

//�����ϱ�
//ī�޶� ����ϱ�
//
public class Phone {
	String modelName, phoneNumber;
	static String manufacturer;
	int serialNumber;
	
	//��ȭ�ɱ�(��ȭ��ȣ)
	public static void call(String number) {
		System.out.println(number + "��ȣ�� ��ȭ�Ŵ���..");
	}
	
	//��ȭ�ޱ�
	public void receive() {
		System.out.println("��������~~~ ");
	}
	
}
