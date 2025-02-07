package com.tekpyramid.stringprograms;

public class ReverseTheSentenceWithoutReversingTheSpace {

	public static void main(String[] args) {
		String a = "India is my country";
		String a1 = a.replace(" ", "");
        int index = a1.length()-1;
        
        for(int i=0; i<=a.length()-1; i++) {
        	if (a.charAt(i)==' ') {
				System.out.print(" ");
			} else {
                System.out.print(a1.charAt(index));
                index--;
			}
        }
		
	}

}
