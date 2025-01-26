package com.qsp.oops;
import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of First Array");
		int size1=s.nextInt();
		int a[]=new int[size1];
		System.out.println("Enter the Elements of First Array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the Size of Second Array");
		int size2=s.nextInt();
		int b[]=new int[size2];
		System.out.println("Enter the Elements of Second Array");
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=s.nextInt();
		}
        System.out.println("The Result of Merged Array is");
        int c[]=new int [size1+size2];
        for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
        for(int i=0;i<=b.length-1;i++)
		{
        	c[i+a.length]=b[i];
		}
        for(int i=0;i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}
	}

}
