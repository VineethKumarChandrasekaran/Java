package com.tekpyramid.assignment.arrayprogram;

public class SecondMinimumNumberInTheArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        
        for(int i=0; i<=a.length-1; i++) {
        	if(min>a[i]) {
        		secondmin = min;
        		min = a[i];
        	}else if(secondmin>a[i] && a[i]>min) {
        		secondmin = a[i];
        	}
        }
        System.out.println("Minimum Number in the Array is " + min);
		System.out.println("Second Minimum Number in the Array is " + secondmin);

	}

}
