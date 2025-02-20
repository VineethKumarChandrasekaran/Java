package com.zupee.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfCharacterInString {

	public static void main(String[] args) {
		String a = "aaabbccccd";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<=a.length()-1; i++) {
			if (map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			} else {
               map.put(a.charAt(i), 1);
			}
		}
        System.out.println(map);
	}

}
