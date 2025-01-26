package com.qsp.oops;
import java.util.Scanner;
public class UserArray {

	public static void main(String[] args) {
		String a[]=new String[4];
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the Name");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.next();
		}
		System.out.println("You have entered the following names");
		for(String i:a)
		{
			System.out.println(i);
		}
	}

}
