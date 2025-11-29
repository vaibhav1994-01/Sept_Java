package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// set - 1.Duplicates are not allowed
		//       2. single null value is allowed
		//		 3. order of insertion is not maintained
		
		HashSet<String> set = new HashSet();
		set.add("Software");
		set.add("Testing");
		set.add("Automation");
		set.add("Manual");
		set.add(null);
		set.add(null);
		
		System.out.println("===============Using forEach Loop===================");
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println("===============Using Iterator===================");
		Iterator<String> s1 = set.iterator();
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		
	}

}
