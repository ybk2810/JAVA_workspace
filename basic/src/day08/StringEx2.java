package day08;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "java oracle";
		char ch = str.charAt(3);
		System.out.println("ch: "+ch);
		
		String str2 = "������";
		
		//���ڿ� ����
		String str3 = str.concat(str2);//����
		System.out.println("str3: "+str3);
		String str4 = "������".concat("ȭ����");
		System.out.println("str4: "+str4);
		
		String s1 = "������";
		String s2 = "ȭ����";
		String s3 = "������";
		String s4 = "�����";
		String s5 = "�ݿ���";
			
		System.out.println(s1.concat(s2).concat(s3).concat(s4).concat(s5));
		System.out.println("-------------");
		
		
		System.out.println("str: "+str);
		boolean flag = str.contains("java");
		System.out.println("flag: "+flag);
		
		String str5 = "JAVA ORACLE";
		if(!str.equals(str5)){
			System.out.println("��ҹ��ڰ� �ٸ�");
		}
		
		if(str.equalsIgnoreCase(str5)) {
			System.out.println("��ҹ��� �����ϰ� �����");
		}
		
		// r �̶�� ���ڰ� ���°�� ��ġ�ϴ����� ��ȯ
		int position = str.indexOf('r');
		System.out.println(position);
		
		// 2��°���� 6��° ������ ���� ����
		System.out.println(str.substring(2,6));
		
		// ID ����
		System.out.println();
		String email = "ybk2810@naver.com";
		
		int position1 = email.indexOf('@');
		System.out.println(position1);
		System.out.println("ID�� ����: " + email.substring(0,position1));
		
		char[] ch1 = str.toCharArray();
		
		//for �� ���?
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]);
		}
		
		// ���� for��, ������ for��
		// for(�ڷ��� ������ : �迭��)
		for(char c : ch1) {
			System.out.print(c);
		}
		
		int a = 20;
		//���ڸ� String ��ȯ?
		String a2 = ""+a;
		String a3 = String.valueOf(a);
		
		System.out.println("a2: "+a2);
		System.out.println("a3: "+a3);
		
		
	}
}
