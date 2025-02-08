package com.tekpyramid.assignment.stringprogram;

import java.util.Scanner;

public class ReverseTheSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        System.out.print("Reversed Sentence: ");
        for (int i = words.length - 1; i >= 0; i--) { 
            for (int j = 0; j < words[i].length(); j++) { 
                System.out.print(words[i].charAt(j)); 
            }
            System.out.print(" ");
        }
    }
}
