package com.tekpyramid.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorUsage {

	public static void main(String[] args) {
		ArrayList koenigsegg = new ArrayList();
		koenigsegg.add("Jesko");
		koenigsegg.add("Agera");
		koenigsegg.add("Gemera");
		
		System.out.println(koenigsegg);
		
		 ListIterator iterate = koenigsegg.listIterator();
		 

		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		while (iterate.hasPrevious()) {
			System.out.println(iterate.previous());
		}
	}

}
