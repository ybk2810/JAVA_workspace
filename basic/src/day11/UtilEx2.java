package day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilEx2 {
	public static void main(String[] args) {
		// ���� ���� Ŭ����
		Date d = new Date(20,1,3); //deprecated
		System.out.println(d);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String time = sdf.format(d);
		System.out.println(time);
	}
}
