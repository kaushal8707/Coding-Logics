package org.example.regexp;

import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {

        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", ""));//true (a or m or n comes one time or not at all)
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time or not at all)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "m"));//true (a or m or n must come one time)

        System.out.println(Pattern.matches("[amn]?", "n"));//true (a or m or n must come one time)
        System.out.println(Pattern.matches("amn?", "am"));

    }
}
