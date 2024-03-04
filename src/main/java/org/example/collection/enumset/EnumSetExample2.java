package org.example.collection.enumset;

import java.util.EnumSet;
import java.util.Set;

enum LAPTOP{
    Hp, Dell, Acer, Lenovo, Asus
}

public class EnumSetExample2 {
    public static void main(String[] args) {

        Set<LAPTOP> set1=EnumSet.allOf(LAPTOP.class);
        System.out.println("Laptop Types = "+set1);

        Set<LAPTOP> set2 = EnumSet.noneOf(LAPTOP.class);
        System.out.println("Laptop Types = "+set2);
    }
}
