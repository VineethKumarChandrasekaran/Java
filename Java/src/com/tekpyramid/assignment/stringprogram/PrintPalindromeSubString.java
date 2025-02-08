package com.tekpyramid.assignment.stringprogram;

import java.util.Scanner;

public class PrintPalindromeSubString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String a = s.next();
		
		for(int i=0; i<=a.length()-1;i++) {
			for(int j=i+1; j<=a.length();j++) {
				String b = a.substring(i, j);
				String c = "";
				for(int k=b.length()-1;k>=0;k--) {
					c+=b.charAt(k);
				}
				if(b.equals(c))
					System.out.print(b+" ");
				
			}
			System.out.println();
		}

	}

}
