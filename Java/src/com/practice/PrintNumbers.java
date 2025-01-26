package com.practice;

public class PrintNumbers {

	public static void main(String[] args) {
		char start = 'A'; 
        char end = 'd';   

        for (int c = start - 64; c <= end; c++) {
            System.out.println(c);
        }
	}

}

