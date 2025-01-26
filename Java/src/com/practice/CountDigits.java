package com.practice;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        while (number > 0) {
        	number /= 10;
            count++;
        }

        if (count == 0) {
            count = 1;
        }

        System.out.println("The number of digits in the given number is: " + count);
    }
}

