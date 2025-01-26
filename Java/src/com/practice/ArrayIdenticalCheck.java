package com.practice;

import java.util.Scanner;

public class ArrayIdenticalCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the size of the second array:");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }
        boolean areIdentical = areArraysIdentical(array1, array2);
        if (areIdentical) {
            System.out.println("The arrays are identical.");
        } else {
            System.out.println("The arrays are not identical.");
        }

        sc.close();
    }
    public static boolean areArraysIdentical(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
