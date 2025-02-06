package com.tekpyramid.stringprograms;

public class SumOfNumberInString {

	public static void main(String[] args) {
		String a = "1a2b3c4d5e";
        int sum =0;
        
        for(int i=0; i<=a.length()-1; i++) {
        	if(a.charAt(i)>='0' && a.charAt(i)<='9') {
        		sum = sum+a.charAt(i)-48;//ASCII Value of 0 is 48. We are converting it into ASCII Value and sub with 48.
        	}
        }
        System.out.println(sum);
	}

}
