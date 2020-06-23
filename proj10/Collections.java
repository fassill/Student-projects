package proj10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add(3,"Z"); // will place z at index 3
		System.out.println("Size of arraylist:"+a1.size());
		System.out.println(a1);
		
		System.out.println();
		
		for(int i = 0; i <a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println();
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("F");
		l1.add("B");
		l1.add("D");
		l1.add("E");
		l1.addLast("Z");
		l1.addFirst("A");
		
		System.out.println(l1);
		
		System.out.println();
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("E");
		hs.add("F");
		System.out.println(hs); // duplicates removed
		
		System.out.println();
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		System.out.println(ts); // result is ordered alphabetically
		
		System.out.println();
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Fassil");
		a2.add("Sini");
		a2.add("Kevyn");
		a2.add("Miller");
		a2.add(2,"Kyle");
		Iterator<String> it = a2.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		System.out.println();
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("100", "Fassil");
		hm.put("200", "Sini");
		hm.put("300", "Kevyn");
		hm.put("400", "Kyle");
		
		System.out.println(hm.get("300"));
		
		System.out.println();
		
		HashMap <String, String> hm2 = new HashMap<String, String>();
		hm2.put("100", "luffy");
		hm2.put("200", "zoro");
		hm2.put("300", "nami");
		hm2.put("400", "usopp");
		System.out.println(hm2.get("100"));
			}
		
	}


