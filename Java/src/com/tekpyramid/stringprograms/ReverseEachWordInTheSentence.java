package com.tekpyramid.stringprograms;

public class ReverseEachWordInTheSentence {

	public static void main(String[] args) {
		String a = "Welcome to Tek Pyramid";
		
		String[] b = a.split(" ");
		
		for(int i=0; i<b.length; i++) {
			StringBuilder sb = new StringBuilder(b[i]);
			System.out.print(sb.reverse()+" ");
		}

	}

}
