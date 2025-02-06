package com.tekpyramid.stringprograms;

public class PrintUniqueCharacterInTheString {

	public static void main(String[] args) {
		String a = "aaabbbcccabc";
		for(int i=0; i<=a.length()-1;i++) {
			char ch = a.charAt(i);
			if(a.indexOf(ch)==a.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}

	}

}
