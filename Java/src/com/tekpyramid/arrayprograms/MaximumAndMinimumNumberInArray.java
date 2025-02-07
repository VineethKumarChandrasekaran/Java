package com.tekpyramid.arrayprograms;

public class MaximumAndMinimumNumberInArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int max = a[0];
		int min = a[0];

		for (int i = 1; i <= a.length - 1; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		
		System.out.println("Maximum Number in the Array is " + max);
		System.out.println("Minimum Number in the Array is " + min);
	}

}
