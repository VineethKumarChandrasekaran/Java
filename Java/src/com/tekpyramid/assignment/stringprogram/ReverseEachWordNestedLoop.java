package com.tekpyramid.assignment.stringprogram;

import java.util.Scanner;

public class ReverseEachWordNestedLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        System.out.print("Reversed Sentence: ");
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
