package org.example.core_java.cloning;

import java.util.HashMap;
import java.util.Map;

public class DeepMainApp
{
    public static void main(String[] args) throws CloneNotSupportedException{
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(1234,5678);
        map.put(5678,989);
        map.put(5556,7788);
        map.put(1919,8871);
        int arr[]={2,3,1,4,5};

        DeepCopy dCopy=new DeepCopy(12345, "kaushal",7826284.111,map,arr);
        System.out.println("Before copy=====");
        System.out.println(dCopy);
        System.out.println();
        System.out.println("After copy=====");
        DeepCopy copieObject=dCopy.clone();
        System.out.println(copieObject);
        System.out.println("check reference vriable. i.e both objects");
        System.out.println("either refer a same varaibles or differet variables");
        System.out.println(dCopy.id==copieObject.id);//refer same variables
        System.out.println(dCopy.name==copieObject.name);//refer same variables
        System.out.println(dCopy.salary==copieObject.salary);//refer same variables
        System.out.println(dCopy.map==copieObject.map);//refer same variables
        System.out.println(dCopy.val==copieObject.val);//refer same variables
        System.out.println(dCopy==copieObject);  //two different objects
    }
}
