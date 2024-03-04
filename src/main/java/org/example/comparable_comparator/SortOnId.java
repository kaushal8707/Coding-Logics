package org.example.comparable_comparator;

import java.util.Comparator;

public class SortOnId implements Comparator<Student>
{
    @Override
    public int compare(Student emp1,Student emp2)
    {
        return emp1.getId().compareTo(emp2.getId());
    }
}
