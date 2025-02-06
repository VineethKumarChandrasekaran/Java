package com.tekpyramid.stringprograms;

import java.util.Scanner;

public class ReverseStringWithAndWithoutVariable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a = s.next();
		String b = "";

		//Logic 1 - With Extra Variable
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		System.out.println("The Reverse of the given String : " + b);
		
		//Logic 2 - Without Extra Variable
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print("The Reverse of the given String : " +a.charAt(i)); 
		}

	}

}
