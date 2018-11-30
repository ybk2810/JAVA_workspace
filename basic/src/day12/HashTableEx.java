package day12;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		
		ht.put("¹İÀå", "ÅÂÁ¾¾¾");
		ht.put("ºÎ¹İÀå", "»óÁØ¶ì");
		ht.put("Á¡½É", "±¹¹°¶±ººÀÌ");
		ht.put("Àú³á", "±¹¹°¶±ººÀÌ");
		ht.put("Á¡½É", "Â«»Í");
		
		//key Áßº¹x
		//value Áßº¹o
		//key°¡ ÁßºÏµÇ¸é µ¤¾î¾º¾îÁü
		
		System.out.println("ht: "+ht);
		
		Set s = ht.keySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj+": "+ht.get(obj));
		}
		
		
	}
}
