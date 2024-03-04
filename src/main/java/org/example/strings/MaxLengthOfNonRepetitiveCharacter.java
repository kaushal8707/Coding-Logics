package org.example.strings;

import java.util.*;

public class MaxLengthOfNonRepetitiveCharacter {
    public static void main(String[] args) {
        String input="printing";
        Set<Character> set=new HashSet<>();
        int i=0;
        int maxLength=0;
        Map<String, Integer> map=new HashMap<>();
        for(int j=0;j<input.length();j++){
            if(!set.contains(input.charAt(j))){
                set.add(input.charAt(j));
                maxLength=Math.max(maxLength,(j-i+1));
            }else{
                while(input.charAt(j)!=input.charAt(i)){
                    set.remove(input.charAt(i));
                    i++;
                }
                set.remove(input.charAt(i));
                i++;
                set.add(input.charAt(j));
            }
            map.put(input.substring(i, j+1),maxLength);
        }
       String result= map.entrySet()
                .stream()
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                .findFirst()
                .map(entry->entry.getKey()).get();
        System.out.println("Result = "+result);



    }
}
