package com.tekpyramid.stringprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWithLinkedHashSet {

	public static void main(String[] args) {
		String a = "aaabbbcccabc";
		LinkedHashSet hash = new LinkedHashSet();
        for (int i=0;i<=a.length()-1;i++) {
        	hash.add(a.charAt(i));
        }
        System.out.println(hash);
	}

}
