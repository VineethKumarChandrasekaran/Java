package com.tekpyramid.assignment.stringprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDuplicateCharacterInTheStringUsingEntrySet {

	public static void main(String[] args) {
		String a = "aaabbbcccabcd";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char ch : a.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}

		System.out.println("Duplicate Characters : ");
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()>1) {
				System.out.print(entry.getKey());
			}
		}
	}

}
