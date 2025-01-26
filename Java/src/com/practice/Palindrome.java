package com.practice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String to Check whether it is Palindrome or Not : ");
	String a = s.nextLine();
	char b[] = a.toCharArray();
	char c[] = new char[a.length()];
	for(int i=a.length()-1, j=0; i>=0; i--, j++) {
		c[j] = a.charAt(i);
	}
	String d = new String(c);
	if(a.equalsIgnoreCase(d)) {
		System.out.println("The given String is a Planidrome");
	}else {
		System.out.println("The given String is Not a Planidrome");
	}
	}

}
