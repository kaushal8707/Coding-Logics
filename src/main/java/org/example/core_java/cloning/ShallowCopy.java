package org.example.core_java.cloning;

public class ShallowCopy implements Cloneable
{
     int id;
     String name;
     double salary;

    public ShallowCopy(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ShallowCopy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
