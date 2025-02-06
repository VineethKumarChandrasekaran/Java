package com.tekpyramid.collection;

import java.util.HashMap;
import java.util.*;

public class EntrySetUsage {

	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(7, "Dhoni");
		hash.put(3, "Raina");
		hash.put(8, "Jadeja");
		
		System.out.println(hash);
		
		for (Map.Entry<Integer, String> ref : hash.entrySet()) { //used to get the datas in Key value pair
			System.out.println(ref.getKey()+" - "+ref.getValue());
		}

	}

}
