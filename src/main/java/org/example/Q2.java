package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {
       String input1="one.two.three";
       String input2="four.five.six";

        List list1=Arrays.asList(input1.split("\\."));
        List list2=Arrays.asList(input2.split("\\."));
        List<List<String>> listOfLists=Arrays.asList(list1,list2);
        List<String> list=listOfLists.stream()
                .flatMap(l->l.stream())
                .collect(Collectors.toList());
        System.out.println(list);


    }
}
