package org.example.core_java.cloning;
import java.util.*;

public class DeepCopy
{
    Integer id;
    String name;
    Double salary;
    Map<Integer,Integer> map;
    int val[];

    public DeepCopy(Integer id, String name, Double salary, Map<Integer, Integer> map, int[] val) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.map = map;
        this.val = val;
    }

    //doing deep copy
    protected DeepCopy clone() throws CloneNotSupportedException
    {
        //map cloning.......
       Map<Integer,Integer> newMap=new HashMap<Integer,Integer>();
       Set<Integer> keySet=map.keySet();
       Iterator<Integer> keyIterator=keySet.iterator();
       while(keyIterator.hasNext())
       {
           Integer key=keyIterator.next();
           newMap.put(key,map.get(key));
       }
       //array cloning......

       int newArr[]=new int[val.length];
       for(int i=0;i<val.length;i++)
       {
          newArr[i]=val[i];
       }

       return new DeepCopy(new Integer(id),new String(name),new Double(salary),newMap,newArr);
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", map=" + map +
                ", val=" + Arrays.toString(val) +
                '}';
    }
}
