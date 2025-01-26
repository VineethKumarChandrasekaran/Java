package com.qsp.oops;
import java.util.Scanner;
public class DeleteElement {

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
		System.out.println("Array Before Deleting an Element");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
        System.out.print("Enter the index of the element to delete: ");
		int index = s.nextInt();
		if(index<0||index>=a.length)
		{
			System.out.println("Invalid Index");
		}
		else
		{
			int b[]=new int [size-1];
			for(int i=0,j=0;i<=a.length-1;i++)
			{
				if(i!=index)
				{
					b[j++]=a[i];
				}
			}
			System.out.println("Array after deleting the element at index " + index + ":");
            for (int i=0; i<=b.length-1; i++) {
                System.out.print(b[i] + " ");
            }
		}

	}

}
