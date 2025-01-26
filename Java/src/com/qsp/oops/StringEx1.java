package com.qsp.oops;
import java.util.Scanner;
public class StringEx1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String : ");
	String a = s.next();
	String b = "";
	String c= "";
    for(int i=0;i<=a.length()-1;i++)
    {
    	char ch=a.charAt(i);
    	if(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' ||ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9')
    	{
    		b+=ch;
    	}
    	else
    	{
    		c+=ch;
    	}
    	
    }
    System.out.println("The Integers in the String is "+b);
    System.out.println("The Alphabets in the String is "+c);
    System.out.println("The Merged Output : "+b+c);
	}
}
