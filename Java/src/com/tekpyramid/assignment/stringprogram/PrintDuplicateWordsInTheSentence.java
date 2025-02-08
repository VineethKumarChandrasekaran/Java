package com.tekpyramid.assignment.stringprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateWordsInTheSentence {

	public static void main(String[] args) {
		String a = "My Name is Name is Vineeth";
        String[] b = a.split(" ");
        List<String> list = Arrays.asList(b);
        
        Set<String> unique = new HashSet<String>();
        Set<String> duplicate = new HashSet<String>();
        
        for (String ch : list) {
        	
			if (!unique.add(ch)) {
				duplicate.add(ch);
			}
		}
        System.out.println("Duplicates : "+duplicate);
	}

}
