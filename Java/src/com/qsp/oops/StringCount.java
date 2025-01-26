package com.qsp.oops;
import java.util.Scanner;
public class StringCount {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the String :");
    String a = s.next();
    String b = "";
	String c= "";
	String d= "";
	int number=0;
	int alphabet=0;
	int character=0;
    for(int i=0;i<=a.length()-1;i++)
    {
    	char ch=a.charAt(i);
    	if(Character.isDigit(ch))
    	{
    		b+=ch;
    		number++;
    	}
    	else if(Character.isLetter(ch))
    	{
    		c+=ch;
    		alphabet++;
    	}
    	else
    	{
    		d+=ch;
    		character++;
    	}
    	
    }
    System.out.println("The Numbers in the String is : "+b);
    System.out.println("The Alphabets in the String is : "+c);
    System.out.println("The SpecialCharacters in the String is : "+d);
    System.out.println("The Numbers Count in the String is : "+number);
    System.out.println("The Aplhabets Count in the String is : "+alphabet);
    System.out.println("The Sepcial Characterss Count in the String is : "+character);
	}
}
