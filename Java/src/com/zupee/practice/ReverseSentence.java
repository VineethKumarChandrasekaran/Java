package com.zupee.practice;

public class ReverseSentence {

	public static void main(String[] args) {
		String a = "My Name is Vineeth Kumar";
		String[] b = a.split(" ");

		for(int i=b.length-1; i>=0; i--) {
			System.out.print(b[i]+" ");
		}
	}

}
