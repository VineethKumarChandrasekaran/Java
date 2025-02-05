package com.tekpyramid.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUsage {

	public static void main(String[] args) {
		ArrayList koenigsegg = new ArrayList();
		koenigsegg.add("Jesko");
		koenigsegg.add("Agera");
		koenigsegg.add("Gemera");
		
		System.out.println(koenigsegg);
		
		Iterator iterate = koenigsegg.iterator();

		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}

}
