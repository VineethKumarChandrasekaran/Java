package com.qsp.oops;

public class ArrayEx {

	public static void main(String[] args) {
     int a[]=new int [5];
     a[0]=1;
     a[1]=2;
     a[2]=3;
     a[3]=4;
     a[4]=5;
     int b=a[0];
     for(int i=0;i<=a.length-1;i++)
     {
    	 if(a[i]<b)
    	 {
    		 b=a[i];
    	 }
     }
     System.out.println("The Smallest Number in the Array is "+b);
	}

}
