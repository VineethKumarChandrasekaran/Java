package com.tekpyramid.collection;

import java.util.ArrayList;

public class SearchingElementInArrayList {

	public static void main(String[] args) {
		ArrayList koenigsegg = new ArrayList();
		koenigsegg.add("Jesko");
		koenigsegg.add("Agera");
		koenigsegg.add("Gemera");
		
		System.out.println(koenigsegg);
		
		ArrayList bugatti = new ArrayList();
		bugatti.add("la voiture noire");
		bugatti.add("veyron");
		bugatti.add("chiron");
		
		System.out.println(bugatti);
		
		ArrayList cars = new ArrayList();
		cars.addAll(koenigsegg);
		cars.addAll(bugatti);
		System.out.println(cars);
		
		System.out.println(cars.contains("Agera"));
        System.out.println(cars.contains("Agera R"));
        
        System.out.println(cars.indexOf("la voiture noire"));
        System.out.println(cars.indexOf("divo"));
        
        System.out.println(cars.containsAll(bugatti));
        System.out.println(cars.containsAll(koenigsegg));
        System.out.println(koenigsegg.containsAll(bugatti));
        
        System.out.println(cars);
        System.out.println(cars.retainAll(koenigsegg));
        System.out.println(cars);
	}

}
