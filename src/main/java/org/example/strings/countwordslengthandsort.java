package org.example.strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class countwordslengthandsort {
    public static void main(String[] args) {
        String input="I newly joined persi ";
        Map<String,Integer> map=new HashMap<String,Integer>();
        int j=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                map.put(input.substring(j,i),(i-j));
                j=i+1;
            }
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
