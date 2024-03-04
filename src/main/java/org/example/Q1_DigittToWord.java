package org.example;

import java.util.HashMap;
import java.util.Map;

public class Q1_DigittToWord {
    public static void main(String[] args) {
        String input="876";
        numberToWords(input);
    }

    private static void numberToWords(String input) {
        Map<Character, String> map=new HashMap<Character, String>();
        map.put('1',"one");
        map.put('2',"two");
        map.put('3',"three");
        map.put('4',"four");
        map.put('5',"five");
        map.put('6',"six");
        map.put('7',"seven");
        map.put('8',"eight");
        map.put('9',"nine");
        map.put('0',"zero");
        char chArr[]=input.toCharArray();
        for(Character ch: chArr){
            System.out.print(map.get(ch)+" ");
        }
    }
}
