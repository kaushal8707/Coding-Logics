package org.example.comparable_comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain
{
    public static void main(String[] args) {

        Student emp1=new Student(223,"pune",6355.45);
        Student emp2=new Student(564,"hyderabad",55665.75);
        Student emp3=new Student(334,"mumbai",4545.11);
        Student emp4=new Student(998,"bangalore",11123.09);

        List<Student> employeeList=new ArrayList<Student>();
        employeeList.add(emp1);
        employeeList.add(emp3);
        employeeList.add(emp2);
        employeeList.add(emp4);

        Collections.sort(employeeList,new SortOnId());

        System.out.println("********** after sorting data based on Id ********");
        for(Student employee : employeeList)
        {
            System.out.println(employee);
        }

    }
}
