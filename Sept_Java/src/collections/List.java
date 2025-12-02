package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		ArrayList cart = new ArrayList();
		cart.add("Trees");
		cart.add('T');
		cart.add("100");
		System.out.println("ReadingList");
		 
		System.out.println("===============Using forEach Loop===================");
		for(Object c :cart) {
			System.out.println(c);
		}
		
		System.out.println("===============Using Iterator===================");
		Iterator itr = cart.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
