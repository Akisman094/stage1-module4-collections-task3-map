package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        String[] words = sentence.split("[\\s\\r\\.,]+");
        for (String word : words) {
            if (word.length() > 0) {
                String lowerCaseWord = word.toLowerCase();
                if (result.containsKey(lowerCaseWord)) {
                    result.put(lowerCaseWord, result.get(lowerCaseWord) + 1);
                } else {
                    result.put(lowerCaseWord, 1);
                }
            }
        }
        return result;
    }
}
