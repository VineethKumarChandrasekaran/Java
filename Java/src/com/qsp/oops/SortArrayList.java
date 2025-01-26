package com.qsp.oops;
import java.util.*;
public class SortArrayList {

	public static void main(String[] args) {
    ArrayList<Boolean> a = new ArrayList<Boolean>();
    a.add(true);
    a.add(false);
    System.out.println("Before Sorting"+a);
    Collections.sort(a);
    System.out.println("After Sorting"+a);
	}

}
