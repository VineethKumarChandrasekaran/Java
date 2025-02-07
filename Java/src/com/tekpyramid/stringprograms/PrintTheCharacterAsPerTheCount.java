package com.tekpyramid.stringprograms;

public class PrintTheCharacterAsPerTheCount {

	public static void main(String[] args) {
		String a = "a3b3c4";
		
		for(int i=0; i<a.length()-1;i=i+2) {
			char ch = a.charAt(i);
			int num = a.charAt(i+1)-48;
			
			for(int j=0; j<num; j++) {
				System.out.print(ch);
			}
		}

	}
}
