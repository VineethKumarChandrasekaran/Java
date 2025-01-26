package com.qsp.oops;
import java.util.Scanner;
public class FloatArray {

	public static void main(String[] args) {
		float a[]=new float[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Values");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextFloat();
		}
		FloatArray.view(a);
	}
	public static void view(float a[])
	{
		System.out.println("The Updated Values in the System are");
		for(float i:a)
		{
			System.out.println(i);
		}
	}

}
