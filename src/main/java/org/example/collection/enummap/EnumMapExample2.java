package org.example.collection.enummap;
import java.util.EnumMap;

public class EnumMapExample2 {
    enum City{
        Bangalore, Pune, Hyderabad, Delhi, Kolkata, Mumbai
    }
    public static void main(String[] args) {
        EnumMap<City, Book> map = new EnumMap<>(City.class);
        Book b1=new Book(101,"selfdeveloped","kaushal","selfpublish",2);
        Book b2=new Book(102,"selfdeveloped-Edition 2","kaushal -2","selfpublish-2",3);
        Book b3=new Book(103,"selfdeveloped-Edition 3","kaushal -3","selfpublish-3",4);
        map.put(City.Bangalore,b1);
        map.put(City.Delhi,b2);
        map.put(City.Mumbai,b3);
        for(EnumMap.Entry<City,Book> entry:map.entrySet()){
            Book b=entry.getValue();
            System.out.println(b.name+" - "+b.author+" - "+b.publisher);
        }
    }}
