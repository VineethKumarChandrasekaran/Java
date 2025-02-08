package com.tekpyramid.arrayprograms;

import java.util.Arrays;

public class SumOfTwoIntegerArrays {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10,11};
		
		int size = a.length<b.length?b.length:a.length;
		
		int[] sum = new int[size];
		
		for(int i=0; i<size; i++) {
			if(i<a.length) {
				sum[i]+=a[i];
			}
			if (i<b.length) {
				sum[i]+=b[i];
			}
		}
        System.out.println(Arrays.toString(sum));
	}

}
