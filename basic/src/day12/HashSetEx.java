package day12;

import java.util.HashSet;
import java.util.Iterator;
// set: 중복 x, 순서 x
public class HashSetEx {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("딸기");
		hs.add("포도");
		hs.add("포도");
		hs.add("포도");
		hs.add("포도");
		hs.add("포도");
		hs.add("포도");
		hs.add("포도");
		hs.add("포도");
		hs.add("포도");
		hs.add("망고");
		hs.add("두리안");
		
		System.out.println("hs: "+hs);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
