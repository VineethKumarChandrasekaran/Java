package com.zupee.practice;

public class Pallindrome {

	public static void main(String[] args) {
		String a ="aabbaa";
		boolean flag = true;
		
		for(int i=0,j=a.length()-1; i<=a.length()/2; i++,j--) {
			if(a.charAt(i)!=a.charAt(j)) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("The given String is Palindrome");
		}else {
			System.out.println("The given String is not a Palindrome");
		}

	}

}
