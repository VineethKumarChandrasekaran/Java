package com.tekpyramid.arrayprograms;

import java.util.Arrays;

public class ShiftingZerosToLeftSideInArray {

	public static void main(String[] args) {
		int a[] = {1,0,2,0,3,0,4,0,5,0};
        int result[] = new int[a.length];
        int index = result.length-1;
        
        for(int i=a.length-1; i>=0; i--) {
        	if (a[i]!=0) {
				result[index--]=a[i];
			}
        }
        System.out.println(Arrays.toString(result));
	}

}
