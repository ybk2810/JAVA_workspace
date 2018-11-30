package day08;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "java oracle";
		char ch = str.charAt(3);
		System.out.println("ch: "+ch);
		
		String str2 = "월요일";
		
		//문자열 연결
		String str3 = str.concat(str2);//연결
		System.out.println("str3: "+str3);
		String str4 = "월요일".concat("화요일");
		System.out.println("str4: "+str4);
		
		String s1 = "월요일";
		String s2 = "화요일";
		String s3 = "수요일";
		String s4 = "목요일";
		String s5 = "금요일";
			
		System.out.println(s1.concat(s2).concat(s3).concat(s4).concat(s5));
		System.out.println("-------------");
		
		
		System.out.println("str: "+str);
		boolean flag = str.contains("java");
		System.out.println("flag: "+flag);
		
		String str5 = "JAVA ORACLE";
		if(!str.equals(str5)){
			System.out.println("대소문자가 다름");
		}
		
		if(str.equalsIgnoreCase(str5)) {
			System.out.println("대소문자 무시하고 내용비교");
		}
		
		// r 이라는 글자가 몇번째에 위치하는지를 반환
		int position = str.indexOf('r');
		System.out.println(position);
		
		// 2번째부터 6번째 전까지 글자 리턴
		System.out.println(str.substring(2,6));
		
		// ID 추출
		System.out.println();
		String email = "ybk2810@naver.com";
		
		int position1 = email.indexOf('@');
		System.out.println(position1);
		System.out.println("ID만 추출: " + email.substring(0,position1));
		
		char[] ch1 = str.toCharArray();
		
		//for 문 출력?
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]);
		}
		
		// 향상된 for문, 개선된 for문
		// for(자료형 변수명 : 배열명)
		for(char c : ch1) {
			System.out.print(c);
		}
		
		int a = 20;
		//숫자를 String 변환?
		String a2 = ""+a;
		String a3 = String.valueOf(a);
		
		System.out.println("a2: "+a2);
		System.out.println("a3: "+a3);
		
		
	}
}
