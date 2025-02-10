package com.tekpyramid.stringprograms;

import java.util.Scanner;

public class ComparingTwoVariablesWithTernaryOperator {

	public static void main(String[] args) {
		int a = 15;
        int b = 10;
        String value = a<b?"("+a+","+b+")":"("+b+","+a+")";
        
        System.out.println(value);
	}

}
