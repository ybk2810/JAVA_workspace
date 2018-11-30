package day13;

import java.util.ArrayList;
import java.util.Random;

// �ڵ��� ����
public class Car {
	ArrayList<String> list;
	String[] carNameList = {
			"Ƽ��", "�غ�ī", "Ÿ��", " �����̵�", "���������"
	};
	Random rnd = new Random();
	
	Car(){
		list =  new ArrayList<String>();
	}
	//������ �̸� �����ϴ� �޼���
	public String getCar() {
		// int length = carNameList.length;
		// int no = rnd.nextInt;
		// carNameList[no]
		return carNameList[rnd.nextInt(carNameList.length)];
	}
	// ���� ���� method: push()
	public synchronized void push(String car) {
		System.out.println("�������: " + list);
		System.out.println("�ڵ����� ����Ǿ����ϴ�" + car);
		list.add(car);
		// ��ٸ��� ������ �����...
		if(list.size()>=3) {
			this.notifyAll();
		}
	}
	//���� ��� method: pop()
	public synchronized String pop() {
		System.out.println("���� ����" + list);
		if(list.size()==0) {
			System.out.println("���� ��ٸ�����.");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String carName = list.remove(list.size()-1);
		System.out.println("����մϴ�: "+carName);
		return carName;
	}
}
