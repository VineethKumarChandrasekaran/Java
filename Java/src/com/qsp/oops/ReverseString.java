package com.qsp.oops;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String a = s.nextLine();
	String b= "";
	char ch[]=a.toCharArray();
	char ch1[]= {};
	for(int i=a.length()-1;i>=0;i++)
	{	
				ch1[i]+=ch[i];
				System.out.println(ch1[i]);
	}	
	}
  
}
