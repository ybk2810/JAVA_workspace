package day12;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		
		ht.put("����", "������");
		ht.put("�ι���", "���ض�");
		ht.put("����", "����������");
		ht.put("����", "����������");
		ht.put("����", "«��");
		
		//key �ߺ�x
		//value �ߺ�o
		//key�� �ߺϵǸ� �������
		
		System.out.println("ht: "+ht);
		
		Set s = ht.keySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj+": "+ht.get(obj));
		}
		
		
	}
}
