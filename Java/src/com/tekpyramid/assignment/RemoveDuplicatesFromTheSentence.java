package com.tekpyramid.assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromTheSentence {

	public static void main(String[] args) {
		String a = "My Name is Name is Vineeth";
        String[] b = a.split(" ");
        List<String> list = Arrays.asList(b);
        
        Set<String> unique = new LinkedHashSet<String>(list);
        System.out.println("String after removing duplicates: " + String.join(" ", unique));
        
	}

}
