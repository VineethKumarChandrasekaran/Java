package com.practice;

import java.util.Scanner;

public class ConvertingNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Binary String : ");
        String a = s.nextLine();
        
        StringBuilder flip = new StringBuilder();
        
        for (char ch : a.toCharArray()) {
			flip.append(ch == '0' ? '1' : '0');//Using Ternary Operator
		}
        System.out.println(flip.toString());
	}

}
