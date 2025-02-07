package com.tekpyramid.stringprograms;

public class ConsecutiveOccuranceOfCharacter {

	public static void main(String[] args) {
		String a = "aaabbbcccabcc";
		int count=1;
		for(int i=0; i<a.length()-1;i++) {
			
			if(a.charAt(i) == a.charAt(i+1) ) {
				count++;
			}else {
				System.out.println(a.charAt(i)+"-"+count);
				count = 1;
			}
			
		}
       System.out.println(a.charAt(a.length()-1)+"-"+count);
	}

}
