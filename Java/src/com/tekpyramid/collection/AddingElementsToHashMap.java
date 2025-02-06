package com.tekpyramid.collection;

import java.util.HashMap;

public class AddingElementsToHashMap {

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

	}

}
