package com.tekpyramid.stringprograms;

import java.util.Scanner;

public class AllPossibleSubStringsInAString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String a = s.next();
		
		for(int i=0; i<=a.length();i++) {
			for(int j=i+1; j<=a.length();j++) {
				System.out.print(a.substring(i, j)+" ");
			}
			System.out.println();
		}

	}

}
