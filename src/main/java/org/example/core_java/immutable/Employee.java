package org.example.core_java.immutable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class Employee {
    private final String name;  // bcz string is immutable and it declared as a final
    private final Date doj;    //mutable
    private final List<String> mobile;    //List of Object
    private final Address address;
    public Employee(String name, Date doj, List<String> mobile, Address address){
        this.name=name;
        this.doj=doj;
        this.mobile=mobile;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public Date getDoj() {
        return (Date) doj.clone();
    }
    public List<String> getMobile() {
        return new ArrayList(mobile);
    }
    public Address getAddress() {
        return new Address(address.getCity(),address.getZip());
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }
    public static void main(String[] args) {
        Address address=new Address("bangalore","1231");
        Employee employee=new Employee("kaushal", new Date(),
                        Arrays.stream(new String[]{"1234","5678"}).collect(Collectors.toList()),address);
        employee.getDoj().setDate(8);    // for mutable object return clone of object instead of actual reference obj
        employee.getMobile().add("9999");  // for list object we should create a copy of it instead of actual reference
        employee.getAddress().setCity("Pune");
        System.out.println(employee);
    }
}