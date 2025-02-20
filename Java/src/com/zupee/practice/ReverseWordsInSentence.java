package com.zupee.practice;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String a = "My Name is Vineeth Kumar";
		String[] b = a.split(" ");
		
		for(int i=0; i<=b.length-1; i++) {
			StringBuilder sb = new StringBuilder(b[i]);
			System.out.print(sb.reverse()+" ");
		}
	}

}
