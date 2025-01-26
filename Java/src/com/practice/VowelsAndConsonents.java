package com.practice;
import java.util.*;
public class VowelsAndConsonents {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String a = s.nextLine();
    String b ="";
    String c ="";
    int vowel = 0;
    int consonent = 0;
    for(int i=0; i<=a.length()-1; i++) {
    	char ch = a.charAt(i);
    	if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z') {
    		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
    			b+=ch;
    			vowel++;
    		}else {
    			c+=ch;
    			consonent++;
    		}
    	}
    }
    System.out.println("The Total No.of Charaters in the given String is : "+(a.length()-1));
    System.out.println("The Vowels in the given String is : "+b);
    System.out.println("The Consonents in the given String is : "+c);
    System.out.println("The No.of Vowels in the given String is : "+vowel);
    System.out.println("The No.of Consonents in the given String is : "+consonent);
	}

}
