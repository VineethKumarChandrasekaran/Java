package com.tekpyramid.collection;

import java.util.HashMap;

public class RemoveElementFromHashMap {

	public static void main(String[] args) {
		HashMap hash = new HashMap();
		hash.put(7, "Dhoni");
		hash.put(3, "Raina");
		hash.put(8, "Jadeja");
		
		System.out.println(hash);
		
		hash.put(3, "Suresh Raina");
		System.out.println(hash);
		
		hash.put("Yuvraj", 12);
		System.out.println(hash);
		
		hash.put(null, "Virendra Sehwag");
		System.out.println(hash);
		
		hash.remove(null);//remove method with only key
		System.out.println(hash);
		
		hash.remove("Yuvraj", 12);//remove method with key and value
		System.out.println(hash);
		
		hash.remove(12);//remove method used with unknown value so that hashmap remains the same
		System.out.println(hash);
	}

}
