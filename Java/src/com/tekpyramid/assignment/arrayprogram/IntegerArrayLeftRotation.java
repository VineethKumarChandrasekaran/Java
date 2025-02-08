package com.tekpyramid.assignment.arrayprogram;

import java.util.Arrays;

public class IntegerArrayLeftRotation {

	public static void main(String[] args) {
		int[] b = {1,2,3,4,5};
		
		for(int i=1;i<=b.length;i++) {
			int temp = b[0];
			
			for(int j=0;j<b.length-1;j++) {
				b[j] = b[j+1];
			}
			
			b[b.length-1]=temp;
			System.out.println(Arrays.toString(b));
		}
		
	}

}
