package com.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicatesInASentence {

	public static void main(String[] args) {
		
		String a = "My name is My name is Vineeth Kumar";
		String[] b = a.split(" ");
        
		Set<String> unique = new LinkedHashSet<String>();
		Set<String> duplicate = new LinkedHashSet<String>();
		
		for(int i=0; i<=b.length-1; i++) {
			
			if(!unique.add(b[i])) {
				duplicate.add(b[i]);
			}
		}
		System.out.println(duplicate);
	}

}
