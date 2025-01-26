package com.qsp.oops;
import java.util.*;
public class StringSortArrayList {

	public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<String>();
	a.add("BMW");
	a.add("AUDI");
	a.add("MCLARNE");
	a.add("VOLVO");
	a.add("BENZ");
	a.add("BUGATTI");
	System.out.println("Before Sorting"+a);
    Collections.sort(a);
    System.out.println("After Sorting"+a);
    for (String i:a)
    {
    	System.out.println("String Length of "+i +" is "+ i.length());
    }
	}

}
