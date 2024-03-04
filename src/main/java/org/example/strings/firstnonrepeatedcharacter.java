package org.example.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstnonrepeatedcharacter {
    public static void main(String[] args) {
        String input="kaushal singh";
        String s=Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(e->e.getKey())
                .findFirst()
                .get();
        System.out.println(s);

    }
}
