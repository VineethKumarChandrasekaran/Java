package com.tekpyramid.stringprograms;

import java.util.LinkedHashMap;

public class RemoveDuplicatesWithLinkedHashMap {

	public static void main(String[] args) {
		String a = "aaabbbcccabc";
		LinkedHashMap<Character, Integer> hash = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<=a.length()-1;i++) {
			if(hash.containsKey(a.charAt(i))) {
				hash.put(a.charAt(i), hash.get(a.charAt(i))+1);
			}else {
				hash.put(a.charAt(i), 1);
			}
		}
		System.out.println(hash.keySet());
	}
}
