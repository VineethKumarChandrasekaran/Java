package com.tekpyramid.collection;
import java.util.*;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList cars = new ArrayList();
		cars.add("Pagani");
		cars.add("Alfa Romeo");
		cars.add("Koenigsegg");
		cars.add("Maserati");
		
		System.out.println(cars);
		
		cars.add("McLaren");
		cars.add(0,"Lexus");
		cars.add(null);
		cars.add(null);
		cars.add(9999);
		
		System.out.println(cars);
	}

}
