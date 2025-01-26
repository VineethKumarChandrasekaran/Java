package com.qsp.oops;
import java.util.*;
public class CollectionFrameworkEx {

	public static void main(String[] args) {
	    ArrayList <String> a = new ArrayList <String>();
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the String");
        a.add(s.next());
        System.out.println("The given String is");
        for(String i : a)
        {
        	System.out.println(i);
        }
        System.out.println(a);
	}

}
