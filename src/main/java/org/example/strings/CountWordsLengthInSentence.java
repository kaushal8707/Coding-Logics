package org.example.strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordsLengthInSentence {
    public static void main(String[] args) {
        String input="i usually do coding";
        int j=0;
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                map.put(input.substring(j, i),(i-j));
                j=i+1;
            }
        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
