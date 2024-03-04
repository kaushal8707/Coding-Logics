package org.example.core_java.cloning;

public class ShallowMainApp
{
    public static void main(String[] args) throws CloneNotSupportedException{
        ShallowCopy shallowCopy=new ShallowCopy(456,"sdfg",86756.00);
        System.out.println("Original Object data: "+shallowCopy);
        System.out.println("------------------");
        ShallowCopy copied_Object=(ShallowCopy)shallowCopy.clone();
        System.out.println("Copied Object data: "+copied_Object);

        System.out.println("check reference variable. i.e both objects");
        System.out.println("either refer a same varaibles or differet variables");
        System.out.println(shallowCopy.id==copied_Object.id);//refer same variables
        System.out.println(shallowCopy.name==copied_Object.name);//refer same variables
        System.out.println(shallowCopy.salary==copied_Object.salary);//refer same variables
        System.out.println(shallowCopy==copied_Object);  //two different objects

    }
}
