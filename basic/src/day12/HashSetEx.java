package day12;

import java.util.HashSet;
import java.util.Iterator;
// set: �ߺ� x, ���� x
public class HashSetEx {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("�θ���");
		
		System.out.println("hs: "+hs);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
