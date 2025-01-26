package com.qsp.oops;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = s.nextLine();
        String[] b = a.trim().split("\\s+");
        int c = b.length;
        System.out.println("Number of words: " + c);
    }
}
