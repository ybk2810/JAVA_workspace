package day08;

public class StringEx1 {
	public static void main(String[] args) {
		// java 글자 출력
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
			System.out.println("동일한 객체");
		}else{
			System.out.println("다른 객체");
		}
		//Object class의 equals()
		//Override 한 method
		//내용비교
		if(str1.equals(str2)) {
			System.out.println("동일한 객체");
		}else{
			System.out.println("다른 객체");
		}
		
		System.out.println(str1);
		System.out.println(str1.toString());
		System.out.println(str1.toString());
		System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str1.hashCode()));
		System.out.println("-------------");
		
		String str3 = "java";
		String str4 = "java";
		
		if(str3 == str4) {
			System.out.println("동일한 객체");
		}else{
			System.out.println("다른 객체");
		}
		if(str3.equals(str4)) {
			System.out.println("동일한 객체");
		}else{
			System.out.println("다른 객체");
		}
		
		str4 = "oracle";
		System.out.println("str3: "+str3);
		System.out.println("str4: "+str4);
		
		System.out.println("6개월째 월급이 ㅠㅠ");
		
		String msg = "";
		
		for(int i = 0; i<100; i++) {
			msg+="*";
		}
		
		
		
		
		
	}
}
