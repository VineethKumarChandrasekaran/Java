package com.tekpyramid.assignment.arrayprogram;

public class ThirdMinimumValueInArray {

    public static void main(String[] args) {
        int[] a = {8, 2, 3, 1, 5, 6, 7, 4};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) { 
            if (a[i] < min) { 
                thirdMin = secondMin;
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin && a[i] != min) { 
                thirdMin = secondMin;
                secondMin = a[i];
            } else if (a[i] < thirdMin && a[i] != secondMin && a[i] != min) { 
                thirdMin = a[i];
            }
        }

        System.out.println("Minimum Number in the Array is " + min);
        System.out.println("Second Minimum Number in the Array is " + secondMin);
        System.out.println("Third Minimum Number in the Array is " + thirdMin);
    }
}
