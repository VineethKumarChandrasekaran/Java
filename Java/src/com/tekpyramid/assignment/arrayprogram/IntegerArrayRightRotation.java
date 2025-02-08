package com.tekpyramid.assignment.arrayprogram;

import java.util.Arrays;

public class IntegerArrayRightRotation {

	public static void main(String[] args) {
		int[] b = {1,2,3,4,5};
		
		for(int i=b.length;i>1;i--) {
			int temp = b[b.length-1];
			
			for(int j=b.length-1;j>0;j--) {
				b[j] = b[j-1];
			}
			
			b[0]=temp;
			System.out.println(Arrays.toString(b));
		}

	}

}
