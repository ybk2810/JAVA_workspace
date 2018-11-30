package day12;

public class ExceptionEx6 {
	public static void main(String[] args){
		call();
	}
	
	static void call() {
		String[] str = {"9","a","300","20"};
		
		int res = 0;
		
		for(int i = 0 ; i<str.length;i++){
			try {
				res += Integer.parseInt(str[i]);
			}catch(Exception e){
				
			}
		}
		System.out.println("res : " + res);
	}
}
