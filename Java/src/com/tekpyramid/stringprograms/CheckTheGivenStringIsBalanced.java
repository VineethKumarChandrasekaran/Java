package com.tekpyramid.stringprograms;

import java.util.ArrayList;

public class CheckTheGivenStringIsBalanced {

	public static void main(String[] args) {
	String a = "{{[{[()]}]}}";
    ArrayList<Character> list = new ArrayList<Character>();
	
    for(int i=0; i<a.length(); i++) {
    	if(list.size()>0 && ((list.get(list.size()-1)=='{' && a.charAt(i)=='}') 
    					|| (list.get(list.size()-1)=='(' && a.charAt(i)==')') 
    					|| (list.get(list.size()-1)=='[' && a.charAt(i)==']'))) {
    		
    		list.remove(list.size()-1);
    		
    	}else {
    		list.add(a.charAt(i));
    	}
    }
    if (list.isEmpty()) {
		System.out.println("Balanced String");
	} else {
         System.out.println("Not a Balanced String");
	}
	}

}
