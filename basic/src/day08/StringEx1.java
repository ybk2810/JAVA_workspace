package day08;

public class StringEx1 {
	public static void main(String[] args) {
		// java ���� ���
		char c1 = 'j';
		char c2 = 'a';
		char c3 = 'v';
		char c4 = 'a';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		System.out.print(c4);
		System.out.println("-------------");
		
		char[] c = {'j','a','v','a'};
		
		for(int i = 0; i<c.length;i++) {
			System.out.print(c[i]);
		}
		System.out.println("-------------");
		
		String str1 = new String("java");
		String str2 = new String("java");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("������ ��ü");
		}else{
			System.out.println("�ٸ� ��ü");
		}
		//Object class�� equals()
		//Override �� method
		//�����
		if(str1.equals(str2)) {
			System.out.println("������ ��ü");
		}else{
			System.out.println("�ٸ� ��ü");
		}
		
		System.out.println(str1);
		System.out.println(str1.toString());
		System.out.println(str1.toString());
		System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str1.hashCode()));
		System.out.println("-------------");
		
		String str3 = "java";
		String str4 = "java";
		
		if(str3 == str4) {
			System.out.println("������ ��ü");
		}else{
			System.out.println("�ٸ� ��ü");
		}
		if(str3.equals(str4)) {
			System.out.println("������ ��ü");
		}else{
			System.out.println("�ٸ� ��ü");
		}
		
		str4 = "oracle";
		System.out.println("str3: "+str3);
		System.out.println("str4: "+str4);
		
		System.out.println("6����° ������ �Ф�");
		
		String msg = "";
		
		for(int i = 0; i<100; i++) {
			msg+="*";
		}
		
		
		
		
		
	}
}
