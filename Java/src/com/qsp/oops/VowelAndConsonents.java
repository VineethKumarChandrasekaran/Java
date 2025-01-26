package com.qsp.oops;
import java.util.Scanner;
public class VowelAndConsonents {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the String :");
    String a = s.next();
    String b = "";
	String c= "";
	int vowel=0;
	int consonant=0;
    for(int i=0;i<=a.length()-1;i++)
    {
    	char ch=a.charAt(i);
    	if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
    	{
    	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
    	{
    		b+=ch;
    		vowel++;
    	}
    	else
    	{
    		c+=ch;
    		consonant++;
    	}
    	}
    }
    System.out.println("The Vowels in the String is : "+b);
    System.out.println("The Consonants in the String is : "+c);
    System.out.println("The Vowels Count in the String is : "+vowel);
    System.out.println("The Consonants Count in the String is : "+consonant);
	}
}


