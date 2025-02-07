package com.tekpyramid.assignment;

import java.util.Scanner;

public class StringReverseWithRecursion {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
        String a = s.next();
        
        System.out.println("The Reverse of String : "+reverse(a));
	}
	
	public static String reverse(String a) {
		if(a.isEmpty()) {
			return a;
		}
		
		return reverse(a.substring(1))+a.charAt(0);
	}

}
