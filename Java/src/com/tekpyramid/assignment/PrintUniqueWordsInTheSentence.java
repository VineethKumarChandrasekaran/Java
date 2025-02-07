package com.tekpyramid.assignment;

import java.util.*;

public class PrintUniqueWordsInTheSentence {

    public static void main(String[] args) {
        String a = "My Name is Name is Vineeth";
        List<String> list = Arrays.asList(a.split(" "));
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : list) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        Set<String> uniqueWords = new HashSet<>();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) { 
                uniqueWords.add(entry.getKey());
            }
        }

        System.out.println("Unique Words: " + uniqueWords);
    }
}
