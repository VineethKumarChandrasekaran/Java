package com.qsp.oops;
import java.util.ArrayList;
public class FloatIntegerArrayEx {

	public static void main(String[] args) {
    ArrayList <Float> a = new ArrayList <Float>();
    ArrayList <Integer> b = new ArrayList <Integer>();
    ArrayList <Number> c = new ArrayList <Number>();
    a.add(1.1f);
    a.add(1.2f);
    a.add(1.3f);
    b.add(1);
    b.add(2);
    b.add(3);
    c.addAll(a);
    c.addAll(b);
    for(Number i : c)
    {
    	System.out.print(i+" ");
    }
	}

}
