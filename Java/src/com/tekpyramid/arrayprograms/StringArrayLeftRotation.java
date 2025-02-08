package com.tekpyramid.arrayprograms;

import java.util.Arrays;

public class StringArrayLeftRotation {

	public static void main(String[] args) {
		String a = "My name is Vineeth";
		String[] b = a.split(" ");
		
		for(int i=1;i<=b.length;i++) {
			String temp = b[0];
			
			for(int j=0;j<b.length-1;j++) {
				b[j] = b[j+1];
			}
			
			b[b.length-1]=temp;
			System.out.println(Arrays.toString(b));
		}
		
	}

}
