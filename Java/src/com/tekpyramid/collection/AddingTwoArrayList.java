package com.tekpyramid.collection;

import java.util.ArrayList;

public class AddingTwoArrayList {

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
	}

}
