package com.qsp.oops;

public class PrimeNumber {

    public static void main(String[] args) 
    {
        int[] a = {3, 5, 7, 2, 8, 1, 4, 10, 6, 9};

        System.out.println("Prime numbers in the array are:");
        
        for (int i = 0; i <=a.length-1; i++) 
        {
            if (isPrime(a[i])) 
            {
                System.out.print(a[i] + " ");
            }
        }
    }
    private static boolean isPrime(int b) 
    {
        if (b <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= b/2; i++) 
        {
            if (b % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
