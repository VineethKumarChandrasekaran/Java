package com.qsp.oops;
import java.util.ArrayList;
public class CharArrayListEx {

	public static void main(String[] args) {
    ArrayList<Character> ch = new ArrayList<Character>();
    ch.add('A');
    ch.add('B');
    ch.add('C');
    ch.add('D');
    
    System.out.println("Printing the Elements with For Loop");
    for(int i=0;i<=ch.size()-1;i++)
    {
    	System.out.print(ch.get(i)+" ");
    }
    System.out.println();
    
    System.out.println("Printing the Elements with For-Each Loop");
    for(char i : ch)
    {
    	System.out.print(i+" ");
    }
    System.out.println();
    
	}

}
