package com.qsp.oops;
import java.util.Scanner;
public class StringEx {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String : ");
	String a = s.next();
	String b = "";
	String c= "";
    for(int i=0;i<=a.length()-1;i++)
    {
    	char ch=a.charAt(i);
    	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
    	{
    		b+=ch;
    	}
    	else
    	{
    		c+=ch;
    	}
    	
    }
    System.out.println("The Vowels in the String is : "+b);
    System.out.println("The Consonants in the String is : "+c);
    System.out.println(b+c);
	}
}
