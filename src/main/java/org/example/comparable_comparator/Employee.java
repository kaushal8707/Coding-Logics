package org.example.comparable_comparator;

public class Employee implements Comparable<Employee>
{
   private Integer id;
   private String address;
   private Double salary;

    public Employee(Integer id, String address, Double salary) {
        this.id = id;
        this.address = address;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee)
    {
        return this.salary.compareTo(employee.getSalary());
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
