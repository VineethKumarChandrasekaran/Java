package com.tekpyramid.assignment;

import java.util.Scanner;

public class SubStringLengthLargerThanThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String a = s.next();
		
		for(int i=0; i<=a.length();i++) {
			for(int j=i+1; j<=a.length();j++) {
				String b = a.substring(i, j);
				if(b.length()>=3) {
					System.out.print(b+" ");
				}
			}
			System.out.println();
		}

	}

}
