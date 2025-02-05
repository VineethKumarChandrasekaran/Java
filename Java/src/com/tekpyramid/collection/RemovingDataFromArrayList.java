package com.tekpyramid.collection;

import java.util.ArrayList;

public class RemovingDataFromArrayList {

	public static void main(String[] args) {
		ArrayList cars = new ArrayList();
		cars.add("BMW M2");
		cars.add("BMW M3");
		cars.add("BMW M4");
		cars.add("BMW M5");
		
		System.out.println(cars);
		
		cars.remove(0);
		System.out.println(cars);
		cars.remove("BMW M5");
		System.out.println(cars);
        cars.remove("Agera");
        System.out.println(cars);
	}

}
