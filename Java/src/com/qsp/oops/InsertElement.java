package com.qsp.oops;
import java.util.Scanner;
public class InsertElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elements of Array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array Before Insert an Element");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
        System.out.print("Enter the index of the element to Insert: ");
		int index = s.nextInt();
		if(index<0||index>=a.length)
		{
			System.out.println("Invalid Index");
			return;
		}
		System.out.println("Enter the New Element : ");
		int b = s.nextInt();
		int c[] = new int[size+1];
        for (int i = size-1; i > index; i--) 
        {
            c[i] = a[i - 1];
        }
        c[index] = b;
        System.out.println("Array after inserting the new element:");
        for (int i = 0; i <= c.length-1; i++) {
            System.out.print(c[i] + " ");
        }

	}

}
