package com.qsp.oops;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Word:");
        String a = s.nextLine();
        s.close();
        char[] b = a.toCharArray();
        char[] c = new char[a.length()];
        for (int i = a.length() - 1, j = 0; i >= 0; i--, j++) 
        {
            c[j] = a.charAt(i);
        }
        String d = new String(c);
        if (a.equals(d)||a.equalsIgnoreCase(d)) 
        {
            System.out.println("The Given Word is a Palindrome");
        } 
        else 
        {
            System.out.println("The Given Word is Not a Palindrome");
        }
    }
}
