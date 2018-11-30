package day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class TestMain2 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
//		for(int i = 0; i<100; i++) {
//			System.out.println(rnd.nextInt(45)+1);
//		}
		
		HashSet hs = new HashSet();
		while(hs.size()!=6) {
			hs.add(rnd.nextInt(45)+1);
		}
		System.out.println("hs: "+hs);
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"\t");
		}
		
	}
}
