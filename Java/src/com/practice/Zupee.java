package com.practice;

public class Zupee {

	public static void main(String[] args) {
		String a = "My name is vineeth kumar";
        String[] b = a.split(" ");
        for(int i=0; i<=b.length-1; i++) {
        	if(b[i].equalsIgnoreCase("vineeth")) {
        		String c = b[i];
        		System.out.println(Character.toUpperCase(c.charAt(0))+c.substring(1));
        	}
        }
	}

}
