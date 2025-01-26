package com.qsp.oops;
import java.util.*;
public class ProductList {

	public static void main(String[] args) {
    ArrayList<Product> a=new ArrayList<Product>();
    a.add(new Product("Chcocolate","Nestle"));
    a.add(new Product("Coffee","London Dairy"));
    a.add(new Product("Corn Flakes","Kellogs"));
    
    for(Product i:a)
    {
    	if(i.brand.equalsIgnoreCase("Nestle"))
    	{
    		System.out.println(i);
    	}
    }
	}

}
