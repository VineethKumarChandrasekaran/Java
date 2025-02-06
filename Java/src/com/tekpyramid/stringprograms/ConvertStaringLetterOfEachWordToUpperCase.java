package com.tekpyramid.stringprograms;

public class ConvertStaringLetterOfEachWordToUpperCase {

	public static void main(String[] args) {
		String a = "dhoni is the best finisher";
         String[] b = a.split(" ");
         for(int i=0; i<=b.length-1; i++) {
        	 String c = b[i];//Take each string from the String Array
        	 char ch = Character.toUpperCase(c.charAt(0));//Converting the first letter of each string into uppercase
        	 System.out.print(ch+c.substring(1)+" ");//Concatinating first character and rest of the characters from the string
         }
	}

}
