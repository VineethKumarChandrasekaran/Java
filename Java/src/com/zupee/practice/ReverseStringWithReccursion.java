package com.zupee.practice;

public class ReverseStringWithReccursion {

	public static void main(String[] args) {
		String a = "Vineeth";
		int count = a.length()-1;
		rev(a,count);
	}

	public static void rev(String a, int i) {
		if(i>=0) {
			System.out.print(a.charAt(i--));
			rev(a,i);
		}
	}
}
