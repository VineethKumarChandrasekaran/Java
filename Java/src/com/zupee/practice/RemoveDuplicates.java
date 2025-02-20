package com.zupee.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String a = "aaabbbabawsxartyjn";
       
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<=a.length()-1; i++) {
			set.add(a.charAt(i));
		}
		System.out.print(set);
	}

}
