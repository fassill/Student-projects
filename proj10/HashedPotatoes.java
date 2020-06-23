package proj10;

import java.util.HashSet;
import java.util.Iterator;

public class HashedPotatoes {

	public static void main(String[] args) {
		
		HashSet<Integer> hashbrown = new HashSet<Integer>();
		hashbrown.add(13);
		hashbrown.add(12);
		hashbrown.add(34);
		hashbrown.add(48);
		
		Iterator<Integer> it = hashbrown.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
		 
		
		

	}

}
