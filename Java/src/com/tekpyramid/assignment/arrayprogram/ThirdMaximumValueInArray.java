package com.tekpyramid.assignment.arrayprogram;

public class ThirdMaximumValueInArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE; 

        for (int i = 0; i < a.length; i++) { 
            if (a[i] > max) { 
                thirdmax = secondmax;
                secondmax = max;
                max = a[i];
            } else if (a[i] > secondmax && a[i] != max) { 
                thirdmax = secondmax;
                secondmax = a[i];
            } else if (a[i] > thirdmax && a[i] != secondmax && a[i] != max) { 
                thirdmax = a[i];
            }
        }

        System.out.println("Maximum Number in the Array is " + max);
        System.out.println("Second Max Number in the Array is " + secondmax);
        System.out.println("Third Max Number in the Array is " + thirdmax);
    }
}
