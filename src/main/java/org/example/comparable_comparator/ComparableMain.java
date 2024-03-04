package org.example.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain
{
    public static void main(String[] args) {

        Employee emp1=new Employee(223,"pune",6355.45);
        Employee emp2=new Employee(564,"hyderabad",55665.75);
        Employee emp3=new Employee(334,"mumbai",4545.11);
        Employee emp4=new Employee(998,"bangalore",11123.09);

        List<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(emp1);
        employeeList.add(emp3);
        employeeList.add(emp2);
        employeeList.add(emp4);

        Collections.sort(employeeList);

        System.out.println("********** after sorting data based on salary ********");
        for(Employee employee : employeeList)
        {
            System.out.println(employee);
        }

    }
}
