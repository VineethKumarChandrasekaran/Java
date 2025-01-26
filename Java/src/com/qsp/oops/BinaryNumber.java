package com.qsp.oops;
import java.util.Scanner;
public class BinaryNumber {

	public static void main(String[] args) {
		String binary="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Integer Value: ");
		int n=s.nextInt();
		while(n>0)
		{
			int rem=n%2;
			binary=rem+binary;
			n=n/2;
		}
     System.out.println("The Binary Value of the given Integer value is "+binary);
	}
}
