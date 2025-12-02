package collections;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		//1. key and Value
		//2. Keys should be unique and duplicate values are allowed
		
		java.util.Map<Integer, String> map = new HashMap();
		map.put(1, "Maharashtra");//1 is key, Maharashtra is value.
		map.put(2, "Karnataka");
		map.put(3, "Gujrat");
		map.put(4, "Andhra Pradesh");
		
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		//System.out.println(map.remove(3));
		//System.out.println(map.entrySet());
		
		for(int k :map.keySet()) {
			System.out.println(map.get(k));
		}
		
	}

}
