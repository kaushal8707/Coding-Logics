package org.example.collection.enumset;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum Days{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class EnumSetExample {
    public static void main(String[] args) {

        Set<Days> set = EnumSet.of(Days.Monday,Days.Tuesday);

        Iterator<Days> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
