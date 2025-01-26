package com.qsp.oops;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
    HashSet<String> a = new HashSet<String>();
    a.add("Whitefield");
    a.add("HSR Layout");
    a.add("JayaNagar");
    a.add("BTM");
    for(String i:a)
    {
    	if(i.equalsIgnoreCase("BTM"))
    	{
    		System.out.println("BTM is Present in the HashSet");
    	}
    	else
    	{
    		System.out.println("BTM is not Present in the HashSet");
    	}
    }
	}

}
