package com.tekpyramid.arrayprograms;

public class SecondMaximumNumberInProgram {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        
        for(int i=0; i<=a.length-1; i++) {
        	if(max<a[i]) {
        		secondmax = max;
        		max = a[i];
        	}else if(secondmax<max && a[i]!=max) {
        		secondmax = a[i];
        	}
        }
        System.out.println("Maximum Number in the Array is " + max);
		System.out.println("Second Max Number in the Array is " + secondmax);
	}

}
