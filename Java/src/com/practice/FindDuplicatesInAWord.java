package com.practice;

public class FindDuplicatesInAWord {

	public static void main(String[] args) {
		String a = "aaabbbcccdddabcde";
        for(int i=0; i<=a.length()-1; i++) {
        	char ch = a.charAt(i);
        	if(a.indexOf(ch)!=a.lastIndexOf(ch) && i==a.indexOf(ch)) {
        		System.out.print(ch+" ");
        	}
        }
	}

}
