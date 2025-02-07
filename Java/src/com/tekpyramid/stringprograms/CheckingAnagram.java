package com.tekpyramid.stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckingAnagram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String a = s.next();
		System.out.println("Enter Second String : ");
		String b = s.next();
		
	    if(a.length()==b.length()) {
	    	a = a.toLowerCase();
	    	b = b.toLowerCase();
	    	
	    	char[] ch1 = a.toCharArray();
	    	char[] ch2 = b.toCharArray();
	    	
	    	Arrays.sort(ch1);
	    	Arrays.sort(ch2);
	    	
	    	if(Arrays.equals(ch1, ch2)) {
	    		System.out.println("The given String are Anagram");
	    	}else {
	    		System.out.println("The given String are not an Anagram");
	    	}
	    }else {
	    	System.out.println("The given String are not an Anagram");
	    }
	    	

	}

}
