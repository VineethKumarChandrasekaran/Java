package com.tekpyramid.stringprograms;

import java.util.Arrays;

public class SwapFirstAndLastWordInTheString {

	public static void main(String[] args) {
		String a = "dhoni is the best finisher";
        String[] b = a.split(" ");
        
        String temp = b[0];
        b[0] = b[b.length-1];
        b[b.length-1] = temp;
        
        for(int i=0; i<=b.length-1; i++) {
        	System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(b));
	}

}
