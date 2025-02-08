package com.tekpyramid.assignment.arrayprogram;

import java.util.Arrays;

public class StringArrayRightRotation {

	public static void main(String[] args) {
		String a = "My name is Vineeth";
		String[] b = a.split(" ");
		
		for(int i=b.length;i>1;i--) {
			String temp = b[b.length-1];
			
			for(int j=b.length-1;j>0;j--) {
				b[j] = b[j-1];
			}
			
			b[0]=temp;
			System.out.println(Arrays.toString(b));
		}
		
	}

}
